package Actividad1ED;
public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private String type; // "simple", "doble", "circular"

    public LinkedList(String type) {
        this.type = type.toLowerCase();
        this.head = null;
        this.tail = null;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
            if (type.equals("circular")) {
                tail.next = head;
            }
            return;
        }

        tail.next = newNode;
        if (type.equals("doble")) {
            newNode.prev = tail;
        }

        tail = newNode;

        if (type.equals("circular")) {
            tail.next = head;
        }
    }

    public boolean delete(T data) {
        if (head == null) return false;

        Node<T> current = head;
        Node<T> previous = null;

        do {
            if (current.data.equals(data)) {
                if (current == head) {
                    head = head.next;
                    if (type.equals("circular")) {
                        tail.next = head;
                    }
                } else {
                    previous.next = current.next;
                    if (type.equals("doble") && current.next != null) {
                        current.next.prev = previous;
                    }
                }

                if (current == tail) {
                    tail = previous;
                }
                return true;
            }
            previous = current;
            current = current.next;
        } while (current != null && current != head);

        return false;
    }

    public boolean search(T data) {
        Node<T> current = head;
        if (current == null) return false;

        do {
            if (current.data.equals(data)) return true;
            current = current.next;
        } while (current != null && current != head);

        return false;
    }

    public void display() {
        Node<T> current = head;
        if (current == null) {
            System.out.println("Lista vacía.");
            return;
        }

        System.out.print("Lista (" + type + "): ");
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != null && current != head);

        System.out.println(type.equals("circular") ? "(circular)" : "null");
    }
}
