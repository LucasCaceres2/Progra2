package Main.ColaPrioridad;

import TDA.ColaPrioridadTDA.TresColasTDA;

public class MainTresColas {
    public static void main(String[] args) {
        TresColasTDA cola = new TresColasTDA(10);

        cola.enqueuePriority(101,1);
        cola.enqueuePriority(202,3);
        cola.enqueuePriority(303,2);
        cola.enqueuePriority(404,3);
        cola.enqueuePriority(505,1);
        cola.enqueuePriority(606,2);

        System.out.println("Orden de atencion: ");

        while (!cola.isEmpty()) {
            System.out.println("Elemento: " + cola.front() + " | Prioridad: " + cola.priority());
            cola.dequeue();
        }
    }
}
