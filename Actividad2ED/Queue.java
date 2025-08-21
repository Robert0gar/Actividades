package Actividad2ED;

public class Queue<T> {
    private LinkedList<T> list;

    public Queue() {
        list = new LinkedList<>();
    }

    // Agregar al final (enqueue)
    public void enqueue(T data) {
        list.insertLast(data);
    }

    // Remover al inicio (dequeue)
    public T dequeue() {
        return list.removeFirst();
    }

    // Ver el primer elemento (peek)
    public T peek() {
        return list.peekFirst();
    }

    // Verificar si está vacía
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Mostrar cola
    public void display() {
        System.out.println("Contenido de la cola:");
        list.display();
    }
}
