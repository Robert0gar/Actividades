package Actividad3ED;

public class Sudoku {
    private static final int N = 9; // Sudoku clásico 9x9

    // Método principal de backtracking
    public static boolean resolver(int[][] board) {
        for (int fila = 0; fila < N; fila++) {
            for (int col = 0; col < N; col++) {
                if (board[fila][col] == 0) { // Si la celda está vacía
                    for (int num = 1; num <= 9; num++) {
                        if (esSeguro(board, fila, col, num)) {
                            board[fila][col] = num; // Probar número
                            if (resolver(board)) {  // Recursión
                                return true;
                            }
                            board[fila][col] = 0;   // Backtracking
                        }
                    }
                    return false; // No hay número válido → retroceder
                }
            }
        }
        return true; // Si no hay ceros → resuelto
    }

    // Verifica si es válido poner num en board[fila][col]
    private static boolean esSeguro(int[][] board, int fila, int col, int num) {
        // Verificar fila y columna
        for (int i = 0; i < N; i++) {
            if (board[fila][i] == num || board[i][col] == num) {
                return false;
            }
        }
        // Verificar subcuadro 3x3
        int startFila = fila - fila % 3;
        int startCol = col - col % 3;
        for (int i = startFila; i < startFila + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    // Imprime el Sudoku con formato de tablero
    public static void imprimir(int[][] board) {
        for (int i = 0; i < N; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("------+-------+------");
            }
            for (int j = 0; j < N; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                if (board[i][j] == 0) {
                    System.out.print(". "); // punto para casillas vacías
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
