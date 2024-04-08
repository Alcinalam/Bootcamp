public class Flat {

  // Attributes
  private String room;
  private int floor;
  private String streetName;
  private String tenantName;

  // setter & getter
  public void setRoom(String room) {
    this.room = room;
  }

  // public String getRoom() {
  //   return this.room;
  // }

  public void setFloor(int floor) {
    this.floor = floor;
  }

  // public int getFloor() {
  //   return this.floor;
  // }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  // public String getStreetName() {
  //   return this.streetName;
  // }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  // public String tenantName() {
  // return this.tenantName;
  // }

  public String fullAddress() {
    return this.room + ", " + this.floor + ", " +
        this.streetName;
  }

  public String withGarden() {
    return this.floor == 2 ? "yes" : "No";
  }

  public String available() {
    return this.tenantName.isEmpty() ? "Yes":"No";
  }

  public String toString() {
    return "Building("//
        + "room=" + this.room //
        + ", floor=" + this.floor //
        + ", streetName=" + this.streetName //
        + ", TenantName=" + this.tenantName //
        + ")";
  }

  public static void main(String[] args) {
    Flat flat = new Flat(); // new class name
    flat.setRoom("21B");
    flat.setFloor(2);
    flat.setStreetName("No.45 Park Road");
    flat.setTenantName("Peter Chu");
    System.out.println("Address: " + flat.fullAddress());
    System.out.println("With Garden: " + flat.withGarden());
    System.out.println("Available: " + flat.available());

    System.out.println("");

    Flat flat2 = new Flat();
    flat2.setRoom("13D");
    flat2.setFloor(6);
    flat2.setStreetName("No.10 Baker Street");
    flat2.setTenantName("");
    System.out.println("Address: " + flat2.fullAddress());
    System.out.println("With Garden: " + flat2.withGarden());
    System.out.println("Available: " + flat2.available());

    System.out.println(flat.toString());
    System.out.println(flat2.toString());

    
  }



}
