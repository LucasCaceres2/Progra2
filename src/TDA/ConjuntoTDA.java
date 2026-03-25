package TDA;

public class ConjuntoTDA {
    private int[] elementos;
    private int cantidad;
    private int capacidad;

    public ConjuntoTDA(int capacidad) {
        this.capacidad = capacidad;
        elementos = new int[capacidad];
        cantidad = 0;
    }

    public boolean isEmpty() {
        return cantidad == 0;
    }

    public boolean isFull() {
        return cantidad == capacidad;
    }

    public boolean contains(int x) {
        for (int i = 0; i < cantidad; i++) {
            if (elementos[i] == x) {
                return true;
            }
        }
        return false;
    }

    public void add(int x) {
        if (!isFull() && !contains(x)) {
            elementos[cantidad] = x;
            cantidad++;
        }
    }

    public void remove(int x) {
        for (int i = 0; i < cantidad; i++) {
            if (elementos[i] == x) {
                elementos[i] = elementos[cantidad - 1];
                cantidad--;
                return;
            }
        }
    }

    public int elegir() {
        if (!isEmpty()) {
            return elementos[0];
        }
        return -1;
    }

    public int size() {
        return cantidad;
    }
}