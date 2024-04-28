public class BusinessException extends Exception {

  private int code;
  

  private BusinessException(Syscode syscode) {
    super(syscode.getDesc());
    this.code = syscode.getCode();
  }

  public static BusinessException of(Syscode syscode) { 
    if (syscode == null)
      throw new IllegalArgumentException();
    return new BusinessException(syscode);
  }


  public static void main(String[] args) throws BusinessException  {
    
    //Exception e = new Exception("Login Fail!"); // carry info of exception
    
    // Objective: 1000 -> Login Fail
    // 1001 -> Password Wrong
    // 1002 -> user id not found
    // BusinessException be =  BusinessException.of(Syscode.LOGIN_FAIL); 
    // BusinessException be1 =  BusinessException.of(Syscode.ID_NOT_FIND);
    // be is throwable
    //throw be;
    

    System.out.println(login(""));

  }
  
  public static String login(String name) throws BusinessException {
    if(name.isBlank()){
      throw new BusinessException(Syscode.ID_NOT_FIND);
    }
    return "input password";
  }

  
}
