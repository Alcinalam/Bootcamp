

public class String1 {
  
  // Attributes
  private char[] characters;

  // Constructors
  // Empty Constructor (Implicitly exists)
  public String1() { // no return type, name same as class name
    this.characters = new char[0];
  } 
  public String1(String s){
    this.characters = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
    this.characters[i]= s.charAt(i);
    }
    
  }
  public void clear () {
    this.characters = new char[0];
  }

  //"abc" -> length = 3 , ,"abc".concat("defg")  , "defg.length -> 4 "
  public String concat(String s) {
    char[] newArr = new char [this.characters.length + s.length()];
    // 3+4 = 7
    int idx = 0;
    //"abc"
    for (int i = 0; i < characters.length; i++) {
      newArr[idx++] = characters[i];
    }
    for (int i = 0; i < s.length();i++){
      newArr[idx++] = s.charAt(i);
    }
    return String.valueOf(newArr);
  }

  public void concat2(String s) {
    char[] copyArr = this.characters;
    this.characters = new char [this.characters.length + s.length()];
    int idx = 0;
    for (int i = 0; i < copyArr.length; i++) {
      this.characters[idx++] = copyArr[i];
    }
    for (int i = 0; i < s.length();i++){
      this.characters[idx++] = s.charAt(i);
    }
  
  }


  // Instance Methods
  // public void setValue(String s) {
  //   this.characters = new char[s.length()];
  //   for (int i = 0; i < s.length(); i++) {
  //     this.characters[i]= s.charAt(i);
  //   }
  // }

  // Instance Methods
  public String getValue() {
    //return this.characters;
    String s = "";
    for (int i = 0; i < this.characters.length; i++){
      // s = s + this.characters[i]; // String + char -> String + String
      s = s.concat(String.valueOf(this.characters[i]));
    }
    return s;
  }

  public String toString() {
    String s = "";
    for (int i = 0; i < this.characters.length; i++){
    s = s.concat(String.valueOf(this.characters[i]));
    }
    return s;
  }

  public static void main(String[] args) {
    String1 str = new String1(); // constructor 同時行埋Class constructor 入面的新object, eg(new char[])

    // char[] arr = new char[] {'c','d','e'};
    
    
    System.out.println((str.getValue())) ; // "cde"

    String1 str2 = new String1("hello");
    System.out.println(str2); //str2.toString() -> hello

    String result = str2.concat("world");
    System.out.println(str2); // "hello"
    System.out.println(result) ; // "helloworld"

    str2.concat2("World");
    System.out.println(str2); //"helloworld"

    String1 abc = new String1("abc");
  }
}
