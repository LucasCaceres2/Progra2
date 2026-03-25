package TDA.ColaPrioridadTDA;


public class TresColasTDA {
    private ColaTDA colaAlta;
    private ColaTDA colaMedia;
    private ColaTDA colaBaja;

    public TresColasTDA(int capacidadPorCola) {
        colaAlta = new ColaTDA(capacidadPorCola);
        colaMedia = new ColaTDA(capacidadPorCola);
        colaBaja = new ColaTDA(capacidadPorCola);
    }

    public boolean isEmpty(){
        return colaAlta.isEmpty() && colaMedia.isEmpty() && colaBaja.isEmpty();
    }

    public boolean isFull(){
        return colaAlta.isFull() || colaMedia.isFull() || colaBaja.isFull();
    }

    public void enqueuePriority(int x, int prioridad) {
        switch (prioridad) {
            case 3:
                colaAlta.enqueue(x);
                break;
            case 2:
                colaMedia.enqueue(x);
                break;
            case 1:
                colaBaja.enqueue(x);
                break;
            default:
                System.out.println("Prioridad invalido");
        }
    }

    public int dequeue() {
        if (!colaAlta.isEmpty()) {
            return colaAlta.dequeue();
        } else if (!colaMedia.isEmpty()) {
            return colaMedia.dequeue();
        } else if (!colaBaja.isEmpty()) {
            return colaBaja.dequeue();
        }
        return -1;
    }

    public int front() {
        if (!colaAlta.isEmpty()) {
            return colaAlta.front();
        } else if (!colaMedia.isEmpty()) {
            return colaMedia.front();
        } else if (!colaBaja.isEmpty()) {
            return colaBaja.front();
        }
        return -1;
    }

    public int priority() {
        if (!colaAlta.isEmpty()) {
            return 3;
        } else if (!colaMedia.isEmpty()) {
            return 2;
        } else if (!colaBaja.isEmpty()) {
            return 1;
        }
        return -1;
    }
}
