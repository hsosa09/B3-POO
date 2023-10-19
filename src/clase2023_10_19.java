public class clase2023_10_19 {
    private String numero;
    private String nombre;
    private double deuda;

    private int valor;

    public clase2023_10_19(String numero, String nombre, double deuda){
        this.numero = numero;
        this.nombre = nombre;
        this.deuda = 0;
    }

    public void incrementarDeuda(double Valor){
        this.deuda += valor;
    }

    public void pagarDeuda() {
        this.deuda = 0;
    }

    public double getDeuda(){
        return this.deuda;
    }

    public void setDeuda(double deuda){
        if(deuda > 0){
            this.deuda = deuda;
        }
    }
}
