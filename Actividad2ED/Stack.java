package Actividad2ED;

public class Stack<T> {
    private LinkedList<T> list;

    public Stack() {
        list = new LinkedList<>();
    }

    // Agregar elemento (push)
    public void push(T data) {
        list.insertFirst(data);
    }

    // Remover elemento (pop)
    public T pop() {
        return list.removeFirst();
    }

    // Ver el tope (peek)
    public T peek() {
        return list.peekFirst();
    }

    // Verificar si está vacía
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Mostrar pila
    public void display() {
        System.out.println("Contenido de la pila:");
        list.display();
    }
}
