import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class WarGame {
    private Queue<Card> player1;
    private Queue<Card> player2;

    public WarGame() {
        Deck deck = new Deck();

        System.out.println(deck);

        Stack<Card> player1 = new Stack<Card>();
        Stack<Card> player2 = new Stack<Card>();
        
        while (!deck.isEmpty()) {
            player1.push(deck.dealCard());
            player2.push(deck.dealCard());
        }

        this.player1 = new LinkedList<Card>();
        while (!player1.isEmpty()) {
            this.player1.add(player1.pop());
        }

        this.player2 = new LinkedList<Card>();
        while (!player2.isEmpty()) {
            this.player2.add(player2.pop());
        }
    }

    public boolean isOver() {
        return player1.isEmpty() || player2.isEmpty();
    }

    public void doTurn() {
        Stack<Card> p1 = new Stack<Card>();
        Stack<Card> p2 = new Stack<Card>();

        p1.push(player1.remove());
        p2.push(player2.remove());

        int indent = 0;
        while (p1.peek().getRank() == p2.peek().getRank()) {
            for (int i = 0; i < indent * 2; i++) {
                System.out.print(" ");
            }

            p1.push(player1.remove());
            p1.push(player1.remove());

            p2.push(player2.remove());
            p2.push(player2.remove());

        }

        Queue<Card> winner;
        int playerWinner;

        if (p1.peek().getRank() > p2.peek().getRank()) {
            winner = this.player1;
            playerWinner = 1;
        }
        else {
            winner = this.player2;
            playerWinner = 2;
        }

        while (!p1.isEmpty()) {
            winner.add(p1.pop());
        }

        while(!p2.isEmpty()) {
            winner.add(p2.pop());
        }

        System.out.println("Player " + playerWinner + " won the war!" + " (" + this.player1.size() + ", " + this.player2.size() + ")");
        System.out.println("    " + this.player1);
        System.out.println("    " + this.player2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        WarGame game = new WarGame();

        while (!game.isOver()) {
            game.doTurn();
            scanner.nextLine();
        }
    }
}