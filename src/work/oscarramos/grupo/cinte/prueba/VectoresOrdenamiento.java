package work.oscarramos.grupo.cinte.prueba;

import java.util.Arrays;
import java.util.Vector;
import java.util.stream.Stream;

public class VectoresOrdenamiento {

    public static void ordenamiento(Vector<Integer> numeros) {
        Stream<Integer> stream = numeros.stream();

        stream.filter(n -> n % 2 == 0)
                .sorted()
                .forEach(System.out::println);

        stream = numeros.stream();

        stream.filter(n -> n % 2 != 0)
                .sorted()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        ordenamiento(new Vector<>(Arrays.asList(15, 7, 2, 1, 5, 9, 8, 7, 24, 50)));
    }
}
