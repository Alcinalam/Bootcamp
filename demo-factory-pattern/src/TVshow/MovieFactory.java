public class MovieFactory implements ShowFactory {

  @Override
  public Pearl createPearl() {
    System.out.println("Free Pearl");
    return new PearlMovie();
  }

  @Override
  public NetTV createNetTV() {
    System.out.println("Paid NetTV");
    return new NetTVMovie();
  }

}
