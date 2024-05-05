public interface Pearl {

  void print();

  public static Pearl create(ShowFactory factory) {
    return factory.createPearl();
  }
}
