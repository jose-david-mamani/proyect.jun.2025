package SectorPrivado;

public class Cliente {

// nombre de cliente y su respectivos datos

    private String  nombreCliente = "";
    private String apellidoCliente = "";
    private int numeroDni = 0 ;
    private int edad = 0;
    private int cbu = 0;
    private double saldoCliente= 0 ;

// los get que traducido al español es estraer los datos

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public int getNumeroDni() {
        return numeroDni;
    }

    public int getEdad() {
        return edad;
    }

    public double getSaldoCliente() {
        return saldoCliente;
    }

// los set para incorporar los datos  alas variables privadas


    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public void setSaldoCliente(double saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    public void setNumeroDni(int numeroDni) {
        this.numeroDni = numeroDni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
