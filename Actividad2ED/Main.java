package Actividad2ED;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<String> comandos = new Stack<>();
        Queue<String> procesos = new Queue<>();

        int opcion;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Agregar comando");
            System.out.println("2. Agregar proceso");
            System.out.println("3. Ver comandos y procesos agregados");
            System.out.println("4. Ejecutar comandos como pila");
            System.out.println("5. Ejecutar procesos como cola");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    String comando;
                    do {
                        System.out.print("Ingresa un comando: ");
                        comando = scanner.nextLine();
                        comandos.push(comando);

                        System.out.print("¿Deseas agregar otro comando? (s/n): ");
                    } while (scanner.nextLine().equalsIgnoreCase("s"));
                    break;

                case 2:
                    String proceso;
                    do {
                        System.out.print("Ingresa un proceso: ");
                        proceso = scanner.nextLine();
                        procesos.enqueue(proceso);

                        System.out.print("¿Deseas agregar otro proceso? (s/n): ");
                    } while (scanner.nextLine().equalsIgnoreCase("s"));
                    break;

                case 3:
                    System.out.println("\n--- COMANDOS (Pila) ---");
                    comandos.display();
                    System.out.println("--- PROCESOS (Cola) ---");
                    procesos.display();
                    break;

                case 4:
                    System.out.println("\n--- EJECUTANDO COMANDOS COMO PILA (uno por uno) ---");
                    while (!comandos.isEmpty()) {
                        System.out.println("Siguiente comando: " + comandos.peek());
                        System.out.print("¿Deseas ejecutarlo? (s/n): ");
                        if (scanner.nextLine().equalsIgnoreCase("s")) {
                            System.out.println("Ejecutando: " + comandos.pop());
                        } else {
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n--- EJECUTANDO PROCESOS COMO COLA (uno por uno) ---");
                    while (!procesos.isEmpty()) {
                        System.out.println("Siguiente proceso: " + procesos.peek());
                        System.out.print("¿Deseas ejecutarlo? (s/n): ");
                        if (scanner.nextLine().equalsIgnoreCase("s")) {
                            System.out.println("Ejecutando: " + procesos.dequeue());
                        } else {
                            break;
                        }
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}
