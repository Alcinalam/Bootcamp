import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mainclass {

  public static void main(String[] args) {
    double[] price = new double[] {10d, 3d, 4d};
    String[] name = new String[] {"Mily", "Wendy", "Chu"};
    List<Book> books = new ArrayList<>();
    
    // loop book detail in List<Book>
    for (int i = 0; i < price.length; i++) {
      books.add(new Book(price[i],name[i]));
    }
    System.out.println(books);

    for (Book a : books) {
      if (a.getAuthor().equals("Wendy"))
      System.out.println(a.getPrice());
    }

   books.set(2,new Book(23d,"kate"));
   System.out.println(books.size());
   System.out.println(books);
  
   System.out.println(books.subList(0, 3));

   List<Book> books2 = new ArrayList<>(
    List.of(new Book(78d,"Ken"),new Book(89d,"Paul"),new Book(99d,"Pinky"))
   );

   List<Book> books3 = new ArrayList<>(
    List.of(new Book(345d,"Ken"),new Book(198d,"Paul"),new Book(188d,"Pinky"))
   );

  //  book2.clear();
  //  System.out.println(book2.size());
  
  // loop books list into hashMap with ranking
  HashMap<String,List<Book>> booksrank = new HashMap<>();
  String [] rank = new String [] {"Top1", "Top2","Top3"};
  // List<List<Book>> allbooks = new ArrayList<>(List.of(books,books2,books3));
  // System.out.println("all book below:" + " \n" + allbooks);

  booksrank.put("Top1", books);
  booksrank.put("Top2", books2);
  booksrank.put("Top3", books3);

  int sum = 0;
  for (Map.Entry<String,List<Book>> entry : booksrank.entrySet()) {
    for (Book b : entry.getValue()){
      sum += b.getPrice();
    }
  } 
  System.out.println("<map.entry>" + sum);

  
// change list of book in top2
List<Book> books4 = new ArrayList<>(
  List.of(new Book(10d,"Kenji"),new Book(13d,"Aska"),new Book(56d,"Karen"))
);


  


  }
}
