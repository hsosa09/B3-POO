/*Ejercitación Funciones*/
/*Ejercicio 3
Escribir una función:
boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
que debe tomar dos cadenas de texto y devolver true, en caso de que sean distintos, o false, en caso de que coincidan.*/
public class clase2023_10_12_TareaEj3 {
    public static void main(String[] args){
        String uno = "asd";
        String dos = "dsa";
        boolean distintas = cadenasDeTextoDistintas(uno, dos);
        System.out.println(distintas);
    }
    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        return (unTextoA == unTextoB);
    }
}
