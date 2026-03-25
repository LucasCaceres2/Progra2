package Main.ColaPrioridad;

import TDA.ColaPrioridadTDA.DobleArregloTDA;

public class MainDobleArreglo {
    public static void main(String[] args) {

        DobleArregloTDA cola = new DobleArregloTDA(10);

        cola.acolarPrioridad(21,5);
        cola.acolarPrioridad(15,6);
        cola.acolarPrioridad(7,8);
        cola.acolarPrioridad(8,7);
        cola.acolarPrioridad(10,5);

        System.out.println("Elemento al frente: " + cola.primero());
        System.out.println("Prioridad del frente: " + cola.prioridad());

        System.out.println("\nDesacolar en orden de prioridad: ");

        while(!cola.isEmpty()) {
            System.out.println(
                    "Elemento: " + cola.primero() +
                            " | Prioridad: " + cola.prioridad()
            );
            cola.desacolar();
        }
    }
}
