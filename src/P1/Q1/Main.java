package P1.Q1;
    /*
     * Questão 1) Escreva um programa iterativo (Java) que recebe como entrada dois
     * arranjos (dois vetores de inteiros), cada um com n elementos, e devolve como
     * saída a interseção entre os dois. O retorno é outro vetor contendo os
     * elementos comuns a ambos os vetores.
     */

     import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        int[] intersecao = encontrarIntersecao(arr1, arr2);
        
        System.out.print("Interseção: ");
        for (int num : intersecao) {
            System.out.print(num + " ");
        }
    }

    public static int[] encontrarIntersecao(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        int[] intersecao = new int[set2.size()];
        int i = 0;
        for (int num : set2) {
            intersecao[i++] = num;
        }

        return intersecao;
    }
}


