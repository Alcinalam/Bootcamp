create table players (
	player_id integer not null unique,
	group_id integer not null
);

create table matches (
	match_id integer not null unique,
	first_player integer not null,
	second_player integer not null,
	first_score integer not null,
	second_score integer not null
);

insert into players (player_id,group_id) values (20,2);
insert into players (player_id,group_id) values (30,1);
insert into players (player_id,group_id) values (40,3);
insert into players (player_id,group_id) values (45,1);
insert into players (player_id,group_id) values (50,2);
insert into players (player_id,group_id) values (65,1);

insert into matches(match_id, first_player, second_player, first_score ,second_score)
values (1,30,45,10,12),(2,20,50,5,5),(13,65,45,10,10),(5,30,65,3,15),(42,45,65,8,4);

select * from players;
select * from matches;

-- return table contain winner of each group
-- (group_id,player_id of winner aka max score)


with players_score as (
	select p.group_id, m.first_player as player_id, m.first_score as score
	from players p left join matches m on p.player_id = m.first_player
	where m.first_player is not null
	union
	select p.group_id, m.second_player as player_id, m.second_score as score
	from players p left join matches m on p.player_id = m.second_player
	where m.second_player is not null
),
cal_sum as(
	select p.group_id, p.player_id, sum(score) as total_score
	from players p left join players_score ps on p.player_id = ps.player_id
	group by p.group_id, p.player_id
	order by p.group_id asc,total_score desc, p.player_id asc
)
select distinct on (group_id) group_id, player_id as winner_id
from cal_sum




