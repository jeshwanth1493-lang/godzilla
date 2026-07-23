package TicTacToe;

public class Board {

    int size;
    char[] [] grid;

    public Board(int size) {
        this.size = size;
        grid = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = '-';
            }
        }
    }

    boolean placeMove(Move move, Player player) {
        if (grid[move.row][move.col] != '-') {
            return false;
        }

        grid[move.row][move.col] = player.symbol;
        return true;
    }

    void printBoard() {
        for (char[] row : grid) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
