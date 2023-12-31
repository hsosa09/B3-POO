/*Ejercitación Funciones*/

/*Ejercicio 1
Hacer una función que dado un número indica si es un número primo o no. Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir por 1 y por 17.
Usar esta función en un programa, que permita el ingreso de un número y luego llame a la función desarrollada para comprobar si es primo o no.
Para resolverlo usar la función obtenida en el ejercicio desarrollado en la clase asincrónica. boolean esDivisible(int n, int divisor)*/
public class clase2023_10_12_TareaEj1 {
    public static void main(String[] args) {
        int[] valor = {1, 2, 5, 17, 25};
        for (int i = 0; i < valor.length; i++) {
            boolean isPrimo = esPrimo(valor[i]);
            System.out.println(valor[i] + " " + isPrimo);
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero == 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
