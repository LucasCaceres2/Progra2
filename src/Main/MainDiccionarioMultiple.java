package Main;

import TDA.DiccionarioMultipleTDA;

public class MainDiccionarioMultiple {
        public static void main(String[] args) {
            DiccionarioMultipleTDA dic = new DiccionarioMultipleTDA();

            dic.put(3, 7);
            dic.put(3, 9);
            dic.put(3, 5);
            dic.put(6, 10);
            dic.put(7, 45);
            dic.put(7, 43);

            System.out.println("Estado inicial del diccionario:");
            dic.mostrar();

            System.out.println("\nAgregar valor repetido a la clave 3:");
            dic.put(3, 9);
            System.out.println("Se agrega porque no existe");
            dic.mostrar();

            System.out.println("\nValores asociados a la clave 5:");
            int[] valores = dic.get(5);
            for (int i = 0; i < valores.length; i++)
                System.out.print(valores[i] + " ");

            System.out.println("\n\nEliminar valor 4 de la clave 5:");
            dic.removeValue(5, 4);
            dic.mostrar();

            System.out.println("\nEliminar clave 7 completa:");
            dic.remove(7);
            dic.mostrar();

            System.out.println("\nClaves almacenadas:");
            int[] claves = dic.keys();
            for (int i = 0; i < claves.length; i++)
                System.out.print(claves[i] + " ");

            System.out.println("\n\nExiste la clave 3? " + dic.containsKey(3));
            System.out.println("Existe la clave 7? " + dic.containsKey(7));
            System.out.println("El diccionario esta vacio? " + dic.isEmpty());
        }
    }

