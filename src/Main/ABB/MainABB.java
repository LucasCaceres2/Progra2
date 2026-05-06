package Main.ABB;

import TDA.Arboles.ABB;
import TDA.Arboles.ABBTDA;

import static Main.ABB.MetodosOrdenamientoABB.*;

public class MainABB {

    public static void main(String[] args) {
        ABBTDA arbol = new ABB();
        arbol.InicializarArbol();
        int[] valores = {50, 30, 70, 20, 40, 60, 80, 35, 45};
        for (int x : valores) {
            arbol.AgregarElem(x);
        }
        System.out.print("Preorden: ");
        preOrder(arbol);
        System.out.print("\nInorden: ");
        inOrder(arbol);
        System.out.print("\nPostorden: ");
        postOrder(arbol);
        System.out.println("\nExiste 60: " + existe(arbol, 60));
        System.out.println("Existe 45: " + existe(arbol, 45));
        System.out.println("Existe 90: " + existe(arbol, 90));
    }

}
