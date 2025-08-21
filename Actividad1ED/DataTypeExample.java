package Actividad1ED;
import java.util.ArrayList;
import java.util.List;
public class DataTypeExample{

    public static class Contact {
        String name;
        String address;
        String phone;

        public Contact(String name, String address, String phone) {
            this.name = name;
            this.address = address;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return name + " | " + address + " | " + phone;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Contact)) return false;
            Contact other = (Contact) obj;
            return this.name.equalsIgnoreCase(other.name);
        }
    }

    public static void primitiveExample() {
        System.out.println("Ejemplo con tipo de dato primitivo (int):");
        LinkedList<Integer> intList = new LinkedList<>("simple");
        intList.insert(10);
        intList.insert(20);
        intList.insert(30);
        intList.display();
    }

    public static void complexExample() {
        System.out.println("Ejemplo con tipo de dato complejo (Contact):");
        LinkedList<Contact> contactList = new LinkedList<>("doble");
        contactList.insert(new Contact("Ana", "Calle Falsa 123", "555-1234"));
        contactList.insert(new Contact("Luis", "Av. Siempre Viva 742", "555-5678"));
        contactList.display();
    }

    public static void abstractExample() {
        System.out.println("Ejemplo con tipo de dato abstracto (List<String>):");
        LinkedList<List<String>> listOfLists = new LinkedList<>("simple");
        List<String> innerList = new ArrayList<>();
        innerList.add("Elemento A");
        innerList.add("Elemento B");
        listOfLists.insert(innerList);
        listOfLists.display();
    }
}

