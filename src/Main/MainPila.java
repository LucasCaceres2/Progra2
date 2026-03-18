package Main;

import TDA.PilaTDA;

public class MainPila {
    public static void main(String[] args) {
        PilaTDA pila = new PilaTDA(5);

        pila.push(24);
        pila.push(56);
        pila.push(88);

        pila.mostrar();

        System.out.println("Tope actual: " + pila.peek());
        System.out.println("Elemento desapilado: " + pila.pop());

        pila.mostrar();
    }
}