package work.oscarramos.grupo.cinte.prueba;

public class CompararNumeros {
    public static void comparaNumero(int num1, int num2, int num3){
        int numeros[] = {num1, num2, num3};
        int iNumeroMayor = 0;
        for (int x=1;x<numeros.length;x++){
            if (numeros[x]>iNumeroMayor) {
                iNumeroMayor = numeros[x];
            }
        }
        System.out.printf("Mayor: %d", iNumeroMayor);
    }
}
