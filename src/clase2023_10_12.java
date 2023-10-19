public class clase2023_10_12 {
    public static void main(String[] args) {
        String nombre = "Horacio";
        String apellido = "Sosa";
        String fecha = "1999-09-29";
        String iniciales = "" + nombre.toCharArray()[0] + apellido.toCharArray()[0];
        System.out.println(iniciales);

        String[] separados = fecha.split("-");
        System.out.println(separados[0]);
        System.out.println(separados[1]);
        System.out.println(separados[2]);

    }
}


