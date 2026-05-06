package TDA.implementacionesDinamicas;

import TDA.PilaEstaticaTDA;

public class PilaLD implements PilaTDA {
    Nodo primero;

    public void InicializarPila() {
        primero = null;
    }

    public void Apilar(int x) {
        Nodo nuevo = new Nodo();
        nuevo.info = x;
        nuevo.sig = primero;
        primero = nuevo;
    }

    public void Desapilar() {
        primero = primero.sig;
    }

    public boolean PilaVacia() {
        return primero == null;
    }

    public int Tope() {
        return primero.info;
    }
}
