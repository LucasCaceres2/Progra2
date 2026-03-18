package TDA;

public class PilaTDA {
    private int[] datos;
    private int tope;
    private int capacidad;

    public PilaTDA(int capacidad) {
        this.capacidad = capacidad;
        this.datos = new int[capacidad];
        this.tope = -1;
    }

    public boolean isEmpty(){
        return this.tope == -1;
    }

    public boolean isFull(){
        return this.tope == capacidad - 1;
    }

    public void push(int valor){
        if (isFull()) {
            System.out.println("Error: la pila esta llena");
            return;
        }
        tope++;
        this.datos[tope] = valor;
    }

    public int pop(){
        if (isEmpty()) {
            System.out.println("Error: la pila esta vacia");
            return -1;
        }
        int valor = this.datos[tope];
        tope--;
        return valor;
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("Error: la pila esta vacia");
            return -1;
        }
        return datos[tope];
    }

    public void mostrar() {
        if (isEmpty()) {
            System.out.println("Error: la pila esta vacia");
            return;
        }
        System.out.println("Contenido de la pila: ");
        for (int i = tope; i >= 0; i--) {
            System.out.println(datos[i]);
        }
    }
}
