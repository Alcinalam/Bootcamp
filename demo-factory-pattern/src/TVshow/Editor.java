public class Editor {

  public static void main(String[] args) {
    ShowFactory factory = ShowFactory.create(Genre.DOCUMENTARIES);

    Pearl pearl = factory.createPearl();
    pearl.print();

    NetTV nettv = factory.createNetTV();
    nettv.print();

    ShowFactory factory2 = ShowFactory.create(Genre.MOVIES);

    Pearl pearl2 = factory2.createPearl();
    pearl2.print();

    NetTV nettv2 = factory2.createNetTV();
    nettv2.print();
  }

}
