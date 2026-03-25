package TDA.ColaPrioridadTDA;

public class ColaTDA {
    private int[] datos;
    private int frente;
    private int fin;
    private int cantidad;
    private int capacidad;

    public ColaTDA(int capacidad){
        this.capacidad = capacidad;
        datos = new int[capacidad];
        frente = 0;
        fin = -1;
        cantidad = 0;
    }

    public boolean isEmpty() {
        return cantidad == 0;
    }

    public boolean isFull() {
        return cantidad == capacidad;
    }

    public void enqueue(int x){
        if (!isFull()) {
            fin = (fin + 1) % capacidad;
            datos[fin] = x;
            cantidad++;
        }
    }

    public int dequeue() {
        if (isEmpty()){
            return -1;
        }
        int valor = datos[frente];
        frente = (frente + 1) % capacidad;
        cantidad--;
        return valor;
    }

    public int front() {
        if (isEmpty()) {
            return -1;
        }
        return datos[frente];
    }
}