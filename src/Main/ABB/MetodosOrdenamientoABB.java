package Main.ABB;

import TDA.Arboles.ABBTDA;

public class MetodosOrdenamientoABB {

    public static void preOrder(ABBTDA a) {
        if (!a.ArbolVacio()) {
            System.out.print(a.Raiz() + " ");
            preOrder(a.HijoIzq());
            preOrder(a.HijoDer());
        }
    }

    public static void inOrder(ABBTDA a) {
        if (!a.ArbolVacio()) {
            inOrder(a.HijoIzq());
            System.out.print(a.Raiz() + " ");
            inOrder(a.HijoDer());
        }
    }

    public static void postOrder(ABBTDA a) {
        if (!a.ArbolVacio()) {
            postOrder(a.HijoIzq());
            postOrder(a.HijoDer());
            System.out.print(a.Raiz() + " ");
        }
    }

    public static boolean existe(ABBTDA a, int x) {
        if (a.ArbolVacio()) {
            return false;
        } else if (a.Raiz() == x) {
            return true;
        } else if (x < a.Raiz()) {
            return existe(a.HijoIzq(), x);
        } else {
            return existe(a.HijoDer(), x);
        }
    }
}