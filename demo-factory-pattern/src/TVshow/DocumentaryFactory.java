public class DocumentaryFactory implements ShowFactory {

  @Override
  public Pearl createPearl() {
    System.out.println("Free Pearl");
    return new PearlDocumentary();
  }

  @Override
  public NetTV createNetTV() {
    System.out.println("Paid NetTV");
    return new NetTVDocumentary();
  }

}
