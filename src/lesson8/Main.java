package lesson8;

public class Main {

    public static void main(String[] args) {

        BlackJack blackJack = new BlackJack();

        Dealer dealer = new Dealer();
        Player player1 = new Player();
        Player player2 = new Player();

        blackJack.addPlayerToGame(dealer);
        blackJack.addPlayerToGame(player1);
        blackJack.addPlayerToGame(player2);

        blackJack.dealTwoCards();
        blackJack.dealRemainingCards();
        blackJack.printWinner();

        Deck deck = new Deck();
//        System.out.println(deck.randomeCard());
//        System.out.println(deck.randomeCard());
//        System.out.println(deck.randomeCard());

        player1.addCardToHand(deck.randomeCard());
        player1.addCardToHand(deck.randomeCard());
        player1.addCardToHand(deck.randomeCard());
        player1.openHand();
        for
    }
}
