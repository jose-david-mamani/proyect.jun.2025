package SectorPrivado;

import java.util.Scanner;

public class RegistroCliente {
    public static void main(String[] args) {


 // variables

        Scanner escaneoPrincipal = new Scanner(System.in);

        String txtBienve = " **************** Indique su ";
        String textNombre = "Nombre  ************";
        String txtApellido = "Apellido ************";
        String txtEdad = "Edad ************";
        String txtDni = "D.N.I ************";


        // bienvenida

        System.out.println("Bienvenido a banco lord J-M-P ");

        Cliente cliente1 = new Cliente();
        // indique su nombre
        System.out.println(txtBienve + textNombre);
        // escaneo de pantalla y el dato ingresado es agregado en la variable lol
        String lol = escaneoPrincipal.nextLine();
        //se agrega el dato de la variable lol a la variable nombre
        cliente1.setNombreCliente(lol);

        // se repite el proceso mismo que con nombre pero ahora es apellido
        System.out.println(txtBienve + txtApellido);
         lol = escaneoPrincipal.nextLine();
        cliente1.setApellidoCliente(lol);

        // ahora es la edad
        System.out.println(txtBienve + txtEdad);
        int lolNum = escaneoPrincipal.nextInt();
        cliente1.setEdad(lolNum);

        // ahora es el dni
        System.out.println(txtBienve + txtDni);
        lolNum = escaneoPrincipal.nextInt();
        cliente1.setNumeroDni(lolNum);


        System.out.println("Hola señor " + cliente1.getNombreCliente() +"." +
                cliente1.getApellidoCliente() + "\n" + "Con edad de " + cliente1.getEdad() + "años"
        + "\n" + "Su dni es " + cliente1.getNumeroDni() + "\n" +
                "Su saldo es de $" + cliente1.getSaldoCliente() + " ARS");
        System.out.println(cliente1.getNombreCliente());
        System.out.println(cliente1.getApellidoCliente());
        System.out.println(cliente1.getEdad());
        System.out.println(cliente1.getNumeroDni());
        System.out.println(cliente1.getSaldoCliente());

    }
}
