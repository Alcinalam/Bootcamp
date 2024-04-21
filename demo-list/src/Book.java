import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {

  private double price;

  private String author;


  public Book(double price, String author) {
    this.price = price;
    this.author = author;
  }

  public String getAuthor() {
    return this.author;
  }

  public double getPrice() {
    return this.price;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Book))
      return false;
    Book b = (Book) obj;
    return Objects.equals(this.price, b.getPrice())
        && Objects.equals(this.author, b.getAuthor());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.price, this.author);
  }

  @Override
  public String toString() {
    return "Book(" //
        + "price=" + this.price //
        + ", author=" + this.author //
        + ")";
  }

  public static void main(String[] args) {
    // Book Array
    Book[] books = new Book[2];
    books[0] = new Book(1.2d, "Vincent");
    books[1] = new Book(8.4d, "Jenny");

    // get Author from Book object books.
    System.out.println(books[0].getAuthor());

    // ArrayList
    ArrayList<Book> books2 = new ArrayList<Book>();// 後面Book唔寫都得

    // add()
    books2.add(new Book(3.4d, "Sally"));
    books2.add(new Book(3d, "Ken"));
    books2.add(new Book(8d, "Chu"));

    System.out.println(books2.size()); // 3
    books2.add(new Book(100.2d, "Kelvin"));

    // contains() -> equals(), hashCode()
    System.out.println(books2.contains(new Book(3.4d, "Sally"))); // true
    System.out.println(books2.contains(new Book(2.4d, "Sally"))); // false

    // remove() -> remove one object only
    System.out.println("before remove=" + books2);
    // [Book(price=3.4, author=Sally), Book(price=3.0, author=Ken), Book(price=8.0, author=Chu), Book(price=100.2, author=Kelvin)]
    System.out.println("before remove=" + books2.size()); // 4
    books2.remove(new Book(3d, "Ken"));
    System.out.println("after remove=" + books2);
    // [Book(price=3.4, author=Sally), Book(price=8.0, author=Chu), Book(price=100.2, author=Kelvin)]
    System.out.println("after remove=" + books2.size()); // 3

    // ArrayList has ordering
    books2.remove(0);
    System.out.println(books2.size());
    System.out.println(books2);

    // Set ()
    books2.set(0, new Book(45d, "Molly"));
    System.out.println(books2.size());
    System.out.println(books2);

    // isEmpty
    System.out.println(books2.isEmpty()); // false

    // subList()
    System.out.println(books2.subList(1, 2)); // endIdx-1 [Book(price=100.2, author=Kelvin)]
    System.out.println(books2.get(0)); // Book(price=45.0, author=Molly)

    // clear()
    books2.clear();
    System.out.println(books2); // [] clear books object, arraylist still at point

    // Initialize with objects
    ArrayList<Book> books3 = new ArrayList<>(
        List.of(new Book(10.3, "Katie"), new Book(12.3, "kip")));
    List<Book> books4 = 
        List.of(new Book(10.3, "Katie"), new Book(12.3, "kip")); //cannot modifty

    System.out.println(books3.size()); //2
    System.out.println(books4.size()); //2

    books3.add(new Book (10.9,"Cherry"));
    // books4.add(new Book(19.4, "Karl")); // unsupported, run error, coz books4 return List. 
    // List is an interface

    for (Book b : books4) {
      System.out.println(b.getPrice() + " " + b.getAuthor()); //照可以, 只係唔可以改
    }

  }
}
 