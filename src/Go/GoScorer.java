package Go;

public class GoScorer {
    public static void countFinalScore(GoBoard board, GoPlayer player1, GoPlayer player2, int size) {
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;

        // Contar territorio para player1 y player2
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board [i][j] == '-') {
                    // Contar territorio vacío
                    // (Por simplicidad, asumimos que las áreas de territorio están correctamente definidas)
                    if (isSurrounded(i, j, player1.getColor())) {
                        scorePlayer1++;
                    } else if (isSurrounded(i, j, player2.getColor())) {
                        scorePlayer2++;
                    }
                }
            }
        }

        // Contar piedras capturadas
        // (Por simplicidad, asumimos que se mantiene un registro de las piedras capturadas)
        scorePlayer1 += player1.getCapturedStones();
        scorePlayer2 += player2.getCapturedStones();

        // Mostrar resultados
        System.out.println("Puntuación final:");
        System.out.println(player1.getColor() + ": " + scorePlayer1 + " puntos");
        System.out.println(player2.getColor() + ": " + scorePlayer2 + " puntos");

        // Determinar al ganador
        if (scorePlayer1 > scorePlayer2) {
            System.out.println("¡" + player1.getColor() + " gana!");
        } else if (scorePlayer2 > scorePlayer1) {
            System.out.println("¡" + player2.getColor() + " gana!");
        } else {
            System.out.println("¡Empate!");
        }
    }

    private static boolean isSurrounded(int row, int col, String color) {
        // Implementar lógica para verificar si un área está rodeada por piedras de un jugador
        return false; // Por ahora, devolver falso para todas las áreas
    }
}

