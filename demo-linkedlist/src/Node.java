public class Node { // same as object
  
  private String str; // object reference

  // private Node previous; can add reference when constructed
  
  private Node next; // object reference

  //private Node tail; 

  public Node (String str) {
    this.str = str;
  }

  public Node (String str, Node next) {
    this.str = str;
    this.next = next;
  }

  public void setNext (Node next) {
    this.next = next;
  }

  public Node getNext(){
    return this.next;
  }

  public void setString (String str) {
    this.str = str;
  }

  public String getString(){
    return this.str;
  }

  @Override
  public String toString(){
    return "Node(" //
      + " Str=" + this.str //
      + ", next" + this.next //
      + ")";
  }


public static void main(String[] args) {
  //"hello","abc","def"
  Node head = new Node("hello", new Node("abc",new Node("def")));
  System.out.println(head);;

  // check if head contains "def" -> true/false
  // for loop? while loop -> linked list
  Node temp = head;
  boolean result = false;
  while (temp != null) { //自己唔係null
    // find "def"
    if ("def".equals(temp.getString())){ 
      result = true;
      break;
    } 
    // if not move to the next node
    temp = temp.getNext();
  }
  System.out.println(temp.getString()); //def

  System.out.println("hello".equals(null)); // false 放前面, 不會空指針
}

}
