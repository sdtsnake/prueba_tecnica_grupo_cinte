package work.oscarramos.grupo.cinte.prueba;

import java.util.Arrays;
import java.util.List;

public class ExtraerNombres {
    private static String getMatchingSubstring(String str, List<String> substrings) {
        return substrings.stream().filter(str::contains).findAny().orElse(null);
    }

    public static void main(String[] args) {
        String nombreEmpresa = "Heinsohn";
        List<String> subString = Arrays.asList("soh");
        String resultado = getMatchingSubstring(nombreEmpresa, subString);

        if (resultado != null) {
            System.out.println("Se encotro la cadena");
        } else {
            System.out.println("No se encontro la cadena");
        }
    }
}
