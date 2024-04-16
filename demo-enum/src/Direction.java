public enum Direction { // class: run java program, JVM new 4 objects of direction

    // Finite number of values
    EAST(1, 'E'),//
    SOUTH(2, 'S'),//
    WEST(-1, 'W'),//
    NORTH(-2,'N'),//
    ;
    private int value; // make it final, 無得再setvalue
    private char a;

    private Direction (int value,char a) {
        this.value = value;
        this.a = a;
    }

    // private Direction(){ // 一定係private

    // }
        
   public int getValue() {
    return this.value;
   }

   public void setValue(int value) {
    this.value = value;
   }

   public void setShort(char a) {
    this.a = a;
   }

   public int getShort() {
    return this.a;
   }

   public static Direction oppsite(Direction direction) {
      if (direction == null)
        return null;
      for (Direction d: Direction.values()) { // values() -> implicit static method
        if (direction.getValue()* -1 == d.getValue())
            return d;
      }
      return null;   
   }

   public Direction oppsite() {
    for (Direction d: Direction.values()) {
        if (this.value*-1 == d.getValue())
        return d;
    }
    return null;
   }

    // you cannot create Direction object by yourself. 

    public static void main(String[] args) {
        // check if the direction is EAST?
        House house = new House(Direction.EAST); // set an address of enum object
        house.setDirection(Direction.NORTH);

        System.out.println(house.getDirection() == Direction.EAST); //true

        System.out.println(Direction.NORTH.getValue()); //4
        Direction.NORTH.setValue(5);
        System.out.println(Direction.NORTH.getValue()); //5

        System.out.println(Direction.oppsite(Direction.WEST)); // EAST

        System.out.println(Direction.EAST.oppsite().name()); //WEST

    }

    public static int getDirectionDegree(Direction direction) {
        int result = -1;
        switch (direction) {
            case NORTH:
                result = 360;
                break;
            case EAST:
                result = 90;
                break;
            case SOUTH:
                result = 180;
                break;
            case WEST:
                result = 270;
                break;
            default:
                return -1;
        }
        return result;
    }
}
