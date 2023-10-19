public class clase2023_10_19_Tarea_UsuarioJuego {

    private String nombre;
    private String clave;
    private double puntaje;
    private int nivel;

    public clase2023_10_19_Tarea_UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0;
        this.nivel = 1;
    }

    public void aumentarPuntaje() {
        puntaje += 1.1;
    }

    public void subirNivel() {
        nivel += 1;
    }

    public void bonus(int valor) {
        puntaje += valor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public static void main(String[] args) {
        clase2023_10_19_Tarea_UsuarioJuego usuario = new clase2023_10_19_Tarea_UsuarioJuego("TheUsuario", "LaPassword");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Clave: " + usuario.getClave());
        System.out.println("Puntaje inicial: " + usuario.getPuntaje());
        System.out.println("Nivel inicial: " + usuario.getNivel());

        usuario.aumentarPuntaje();
        usuario.subirNivel();
        usuario.bonus(12);

        System.out.println("Puntaje post aumento y bonus: " + usuario.getPuntaje());
        System.out.println("Nivel post subida: " + usuario.getNivel());


    }
}




