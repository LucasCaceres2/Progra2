package Main;

import TDA.ColaEstaticaTDA;

public class MainColaEstatica {
    public static void main(String[] args) {
        ColaEstaticaTDA cola = new ColaEstaticaTDA(5);

        cola.enqueue(43);
        cola.enqueue(65);
        cola.enqueue(70);

        cola.mostrar();

        System.out.println("Frente actual:: " + cola.front());
        System.out.println("Elemento desacolado: " + cola.dequeue());

        cola.mostrar();
    }
}
