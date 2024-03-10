package Go;

public class GoBoard {
    private final int size;
    private final char[][] board;

    public GoBoard(int size) {
        this.size = size;
        this.board = new char[size][size];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isValidMove(int row, int col) {
        // Implementar lógica para verificar si el movimiento es válido
        return true; // Por ahora, todos los movimientos son válidos
    }

    public void placeStone(int row, int col, GoPlayer player) {
        // Implementar lógica para colocar una piedra en el tablero
        board[row][col] = player.getColor().charAt(0); // Colocar el color del jugador en el tablero
    }

    public boolean isGameOver() {
        // Implementar lógica para determinar si el juego ha terminado
        return false; // Por ahora, el juego nunca termina
    }
}

