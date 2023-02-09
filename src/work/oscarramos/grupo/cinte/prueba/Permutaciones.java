package work.oscarramos.grupo.cinte.prueba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Permutaciones {
    public static ArrayList<Integer> permutacionArray(int[] arreglo, int pemutaciones) {
        int[] inicial = null;
        int[] permutacion = Arrays.copyOf(arreglo, arreglo.length);
        for (int k = 0; k < pemutaciones; k++) {
            inicial = Arrays.copyOf(permutacion, permutacion.length);
            for (int i = 0; i < inicial.length; i++) {
                int ant = 0;
                if (i == 0) {
                    permutar(inicial, permutacion, i, ant);
                } else {
                    ant = inicial[i - 1];
                    permutar(inicial, permutacion, i, ant);
                }
            }
        }
        ArrayList resultado = new ArrayList<Integer>();
        for (int p : permutacion) {
            resultado.add(p);
        }
        return resultado;
    }

    private static void permutar(int[] inicial, int[] permutacion, int i, int ant) {
        int posterior = 0;
        if (i == permutacion.length - 1) {
            posterior = 0;
        } else {
            posterior = inicial[i + 1];
        }
        if (ant == posterior) {
            permutacion[i] = 0;
        } else {
            permutacion[i] = 1;
        }
    }

    public static void main(String[] args) {
        int[] arreglo = {0, 1, 0};
        ArrayList<Integer> respuesta = permutacionArray(arreglo, 2);

        System.out.println(respuesta);

    }
}
