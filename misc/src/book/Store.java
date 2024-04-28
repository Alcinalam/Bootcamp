import java.util.HashMap;
import java.util.Map;

public class Store {
  public static void main(String[] args) {


    // handler
    try {
      System.out.println(total("Book8"));
    } catch (NullPointerException e) {
      System.out.println("please input the name of book");
    } catch (BookException e) {
      System.out.println(e);
      System.out.println("Please input an onlist book");
    }


  }



  public static double total(String bookname) throws BookException {
    Map<String, Integer> bookmap = new HashMap<>();
    String[] booknames =
        new String[] {"Book1", "Book2", "Book3", "Book4", "Book5"};
    int[] bookprices = new int[] {10, 20, 30, 40, 50};

    for (int i = 0; i < booknames.length; i++) {
      bookmap.put(booknames[i], bookprices[i]);
    }
    if (bookname == null) {
      throw new NullPointerException();
    }
    if (!bookmap.keySet().contains(bookname)) {
      throw new BookException(BookSysCode.BK_NOT_FOUND);
    }
    return bookmap.get(bookname);

  }

}
