package Actividad1ED;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<DataTypeExample.Contact> contactList = null;

        while (true) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Crear nueva lista de contactos");
            System.out.println("2. Insertar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Buscar contacto");
            System.out.println("5. Mostrar lista de contactos");
            System.out.println("6. Ver ejemplos de tipos de datos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Tipo de lista (simple, doble, circular): ");
                    String type = sc.nextLine();
                    contactList = new LinkedList<>(type);
                    System.out.println("Lista de tipo '" + type + "' creada.");
                    break;

                case 2:
                    if (contactList == null) {
                        System.out.println("Primero crea una lista.");
                        break;
                    }
                    System.out.print("Nombre: ");
                    String name = sc.nextLine();
                    System.out.print("Dirección: ");
                    String address = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String phone = sc.nextLine();
                    contactList.insert(new DataTypeExample.Contact(name, address, phone));
                    break;

                case 3:
                    if (contactList == null) break;
                    System.out.print("Nombre del contacto a eliminar: ");
                    String delName = sc.nextLine();
                    boolean removed = contactList.delete(new DataTypeExample.Contact(delName, "", ""));
                    System.out.println(removed ? "Eliminado." : "No encontrado.");
                    break;

                case 4:
                    if (contactList == null) break;
                    System.out.print("Nombre del contacto a buscar: ");
                    String searchName = sc.nextLine();
                    boolean found = contactList.search(new DataTypeExample.Contact(searchName, "", ""));
                    System.out.println(found ? "Encontrado." : "No encontrado.");
                    break;

                case 5:
                    if (contactList != null) contactList.display();
                    else System.out.println("La lista aún no ha sido creada.");
                    break;

                case 6:
                    DataTypeExample.primitiveExample();
                    DataTypeExample.complexExample();
                    DataTypeExample.abstractExample();
                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    return;

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
