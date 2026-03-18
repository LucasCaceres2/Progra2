package Main;

import TDA.PilaEstaticaTDA;

public class MainPilaEstatica {
    public static void main(String[] args) {
        PilaEstaticaTDA pila = new PilaEstaticaTDA(5);

        pila.push(24);
        pila.push(56);
        pila.push(88);

        pila.mostrar();

        System.out.println("Tope actual: " + pila.peek());
        System.out.println("Elemento desapilado: " + pila.pop());

        pila.mostrar();
    }
}