package Go;

import java.util.Scanner;

public class GoGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GoBoard board = new GoBoard(9); // Tablero de tamaño 9x9 (puedes ajustar el tamaño)
        GoPlayer player1 = new GoPlayer("Negro");
        GoPlayer player2 = new GoPlayer("Blanco");
        GoPlayer currentPlayer = player1;

        System.out.println("¡Bienvenido al juego de Go!");

        while (!board.isGameOver()) {
            board.display();
            System.out.println("Turno de " + currentPlayer.getColor());
            System.out.print("Ingrese la fila y columna para colocar la piedra (ejemplo: 3 5): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (board.isValidMove(row, col)) {
                board.placeStone(row, col, currentPlayer);
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            } else {
                System.out.println("Movimiento inválido. Inténtelo de nuevo.");
            }
        }GoScorer.countFinalScore(board, player1, player2, size);


        System.out.println("Juego terminado");
        scanner.close();
    }

}

