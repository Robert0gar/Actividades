package Actividad2ED;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    // Insertar al inicio (útil para Stack - push)
    public void insertFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    // Insertar al final (útil para Queue - enqueue)
    public void insertLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        size++;
    }

    // Eliminar al inicio (útil para Stack pop y Queue dequeue)
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node<T> temp = head;
        head = head.getNext();
        size--;
        return temp.getData();
    }

    // Ver el primer elemento sin eliminarlo
    public T peekFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.getData();
    }

    // Mostrar elementos de la lista
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
