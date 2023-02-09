package work.oscarramos.grupo.cinte.prueba;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutaciones {
    public static ArrayList<Integer> permutacionArray(int[] arreglo, int pemutaciones) {
        int[] inicial = null;
        int[] permutacion = Arrays.copyOf(arreglo, arreglo.length);
        for (int k = 0; k < pemutaciones; k++) {
            inicial = Arrays.copyOf(permutacion, permutacion.length);
            for (int i = 0; i < inicial.length; i++) {
                int ant = 0;
                int post = 0;
                if (i > 0) {
                    ant = inicial[i - 1];
                }
                if (i < inicial.length - 1) {
                    post = inicial[i + 1];
                }
                permutacion[i] = ant ^ post;
            }
        }
        ArrayList resultado = new ArrayList<Integer>();
        for (int p : permutacion) {
            resultado.add(p);
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] arreglo = {0, 1, 0};
        ArrayList<Integer> respuesta = permutacionArray(arreglo, 2);
        System.out.println(respuesta);
    }
}
