public interface ShowFactory {

  Pearl createPearl();

  NetTV createNetTV();

  public static ShowFactory create(Genre show) {
    return switch (show) {
      case DOCUMENTARIES -> new DocumentaryFactory();
      case MOVIES -> new MovieFactory();
    };
  }
}
