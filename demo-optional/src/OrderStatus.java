import java.util.Arrays;

public enum OrderStatus {
  
  CONFIRMED(1, "ordered."),//
  PAID(2, "Paid."),//
  READY_TO_SHIP (3,"Ready to ship."),//
  DELIVERED(4,"Delivered"),//
  ;

  private final int code;
  private final String desc;
  
  private OrderStatus (int code, String desc) {
    this.code = code;
    this.desc = desc;
  }

  public int getCode () {
    return this.code;
  }

  public String getDescs () {
    return this.desc;
  }



  public static OrderStatus get(int code)  { //2 -> PAID
    // stream to find enum (code = 2),return OrderStatus
    
    //  Array -> List -> Stream
    //  Arrays.asList(values()).stream()

    // Array -> Stream
    return Arrays.stream(values())//
      .filter(e-> e.getCode() == code)
      .findFirst() //
      .orElseThrow(()->new IllegalArgumentException());


    
  }

  public static void main(String[] args) {
    //System.out.println(get(90)); //IllegalArgumentException
    System.out.println(get(3)); // READY_TO_SHIP

    // OrderStatus[]
    System.out.println(Arrays.toString(OrderStatus.values()));
    //[CONFIRMED, PAID, READY_TO_SHIP, DELIVERED]
  }
}
