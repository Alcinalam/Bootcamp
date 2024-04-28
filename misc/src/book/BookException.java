public class BookException extends Exception {
  
  private int code;
  

  public BookException(BookSysCode bsc) {
    super(bsc.getDesc());
    this.code = bsc.getCode();
  }

  public static BookException of(BookSysCode bsc) {
    if (bsc == null)
      throw new IllegalArgumentException();
    return new BookException(bsc);
  }
}
