package TicTacToe;

public class Main {


    public static void main(String[] args) {

        Player p1 = new Player("Alice", 'X');
        Player p2 = new Player("Bob", 'O');

        Game game = new Game(3, p1, p2);

        game.makeMove(0, 0);
        game.makeMove(1, 0);
        game.makeMove(0, 1);
        game.makeMove(1, 1);
        game.makeMove(0, 2); // Alice wins
    }
}
