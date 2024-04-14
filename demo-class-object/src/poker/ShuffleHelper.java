package poker;

public class ShuffleHelper {

  private Card[] cards;

  public ShuffleHelper(Deck deck) {
    this.cards = deck.getCards();
  }

  public void riffle() {
    for (int i = 0; i < this.cards.length/2; i++) { //0-25
      
    }

  }


  
  public static void main(String[] args) {
    ShuffleHelper shuffleHelper = new ShuffleHelper(Deck.full());

    shuffleHelper.riffle();
    shuffleHelper.riffle();
  }
}
