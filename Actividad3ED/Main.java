package Actividad3ED;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 📌 un solo Scanner para todo el programa
        int opcion;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Fibonacci");
            System.out.println("2. Subset Sum");
            System.out.println("3. Sudoku");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un número: ");
                    int n = scanner.nextInt();
                    System.out.println("Fibonacci de " + n + " = " + Fibonacci.fibonacci(n));
                    break;

                case 2:
                    System.out.print("¿Cuántos números quieres en el conjunto? ");
                    int tam = 0;

                    while (!scanner.hasNextInt()) {
                        System.out.println("Ingresa un número válido:");
                        scanner.next();
                    }
                    tam = scanner.nextInt();

                    int[] conjunto = new int[tam];

                    System.out.println("Ingresa " + tam + " números (puedes escribirlos en una sola línea separados por espacio):");
                    for (int i = 0; i < tam; i++) {
                        while (!scanner.hasNextInt()) {
                            System.out.println("Ingresa un número válido:");
                            scanner.next();
                        }
                        conjunto[i] = scanner.nextInt();
                    }

                    // 📌 Limpia lo que sobre en la misma línea (si el usuario escribió más de tam números)
                    scanner.nextLine();

                    System.out.print("Ingresa la suma objetivo: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Ingresa un número válido:");
                        scanner.next();
                    }
                    int suma = scanner.nextInt();

                    boolean existe = SubsetSum.subsetSum(conjunto, conjunto.length, suma);
                    if (existe) {
                        System.out.println("Sí existe un subconjunto que suma " + suma);
                    } else {
                        System.out.println("No existe un subconjunto que sume " + suma);
                    }
                    break;

                case 3:
                    System.out.println("Elige la dificultad:");
                    System.out.println("1. Fácil");
                    System.out.println("2. Medio");
                    System.out.println("3. Difícil");
                    System.out.println("4. Muy difícil");
                    int dificultad = scanner.nextInt(); // 📌 usar el mismo scanner

                    int[][] board = Sudokus.getPuzzleByDifficulty(dificultad);

                    System.out.println("\nSudoku inicial:");
                    Sudoku.imprimir(board);

                    // 📌 Preguntar al usuario si quiere ver la solución
                    System.out.print("\n¿Quieres ver el Sudoku resuelto? (s/n): ");
                    scanner.nextLine(); // limpiar buffer antes de leer texto
                    String respuesta = scanner.nextLine().trim().toLowerCase();

                    if (respuesta.equals("s") || respuesta.equals("si")) {
                        if (Sudoku.resolver(board)) {
                            System.out.println("\nSudoku resuelto:");
                            Sudoku.imprimir(board);
                        } else {
                            System.out.println("No se pudo resolver el Sudoku.");
                        }
                    } else {
                        System.out.println("Ok, no se mostrará la solución por ahora.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
