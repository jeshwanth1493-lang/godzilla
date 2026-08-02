package TicTacToe;

class Game {

    Board board;
    Player[] players;
    int currentPlayerIndex = 0;
    int movesPlayed = 0;

    Game(int size, Player p1, Player p2) {
        board = new Board(size);
        players = new Player[]{p1, p2};
    }

    boolean makeMove(int row, int col) {
        Player currentPlayer = players[currentPlayerIndex];
        Move move = new Move(row, col);

        boolean success = board.placeMove(move, currentPlayer);

        if (!success) {
            System.out.println("Invalid move");
            return false;
        }

        movesPlayed++;
        board.printBoard();

        if (checkWinner(row, col, currentPlayer.symbol)) {
            System.out.println(currentPlayer.name + " wins!");
            return true;
        }

        if (movesPlayed == board.size * board.size) {
            System.out.println("Draw");
            return true;
        }

        currentPlayerIndex = currentPlayerIndex==0?1:0;
        return false;

    }

    boolean checkWinner(int row, int col, char symbol) {
        boolean winRow = true;
        boolean winCol = true;
        boolean winDiag = true;
        boolean winAntiDiag = true;

        for (int i = 0; i < board.size; i++) {
            if (board.grid[row][i] != symbol) {
                winRow = false;
            }

            if (board.grid[i][col] != symbol) {
                winCol = false;
            }

            if (board.grid[i][i] != symbol) {
                winDiag = false;
            }

            if (board.grid[i][board.size - i - 1] != symbol) {
                winAntiDiag = false;
            }
        }

        return winRow || winCol || winDiag || winAntiDiag;
    }
}
