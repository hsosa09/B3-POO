/*Ejercitación Funciones*/

/*Ejercicio 2
Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC)
Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre el resultado.*/


public class clase2023_10_12_TareaEj2 {
    public static void main (String[] args){
        int unNumeroA = 6;
        int unNumeroB = 40;
        int unNumeroC = 3;

        int mayor = maximoEntreTresNumeros(unNumeroA, unNumeroB, unNumeroC);
        System.out.println(mayor);
    }

    public static int maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC){
        for (int i = 1; i <= 3; i++){
            if (unNumeroA > unNumeroB && unNumeroA > unNumeroC){
                return unNumeroA;
            } else if (unNumeroB > unNumeroA && unNumeroB > unNumeroC){
                return unNumeroB;
            }
        }
        return unNumeroC;
    }
}
