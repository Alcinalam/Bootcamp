public enum BookSysCode {
  
  NOT_IN_RANK (101,"This Book not in the correct Rank"),
  BK_NOT_FOUND (404,"This Book not in List"),
  ;

  private int code;
  private String desc;

  private BookSysCode (int code, String desc) {
    this.code = code;
    this.desc = desc;
  }

  public int getCode () {
    return this.code;
  }

  public String getDesc () {
    return this.desc;
  }

}
