

public interface NetTV {

  void print();

  public static NetTV create(ShowFactory factory) {
    return factory.createNetTV();
  }

}
