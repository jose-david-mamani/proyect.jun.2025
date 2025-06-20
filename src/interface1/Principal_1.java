package interface1;

import SectorPrivado.Cliente;

import java.util.Objects;
import java.util.Scanner;

public class Principal_1 {
    public static void main(String[] args) {


//ESTA ES LA VERCION DE GUARDADO EN OTRA CLASE
// OSEA QUE CADA NOMBRE DEL CLIENTRE SERA GUARDADO EN EL MISMO CODIGO Y ASI MODIFICADO EN EL MISMO CODIGO PERO EN DIFERENTE CLASE



        Scanner lol = new Scanner(System.in);// SE ESCANEA EL TECLADO "OSEA QUE REGISTRA LOS DATOS ENTRADOS POR EL CLIENTE

//MENSAJES POR DEFECTOS.. OSEA QUE SE VAN A UTILIZAR A MENUDOS Y LA PARA EVITAR LA REPETICON  DE CODIGO

        String nameClient = "krax";
        String lastNameClient ="krax";

        String WelcomeClient = """
              Bienvenido a banco J-M-P \n  Querido %s,%s""".formatted(nameClient, lastNameClient);

        String nombre = " nombre ".toUpperCase();
        String apellido = " apellido".toUpperCase();
        String textQuestion = " INGRECE SU ";
        // AQUI SE PRODUCE LA PARTE EN DONDE SE LE PREGUNTA SU NOMBRE Y APELLIDO


        System.out.println(textQuestion + nombre);
        String txt = lol.next();

        System.out.println(textQuestion + apellido);
        String txt2 = lol.next();

// SE VERIFICA LOS DATOS INGRESADOS POR EL USUARIO Y LUEGO ENTRA EN UN LOOP O ALGO ASI


        Cliente cliente1 = new Cliente();
        cliente1.getSaldoCliente();
        String saldClient = "saldo insuficiente" + "su saldo es de " + cliente1.getSaldoCliente();

        if (Objects.equals(txt, nameClient) || Objects.equals(txt2, lastNameClient)) {
            System.out.println("muy bien".toUpperCase());

            System.out.println(WelcomeClient);

            System.out.println("que desea hacer "  );




            String txtOpcion = lol.next();
            switch (txtOpcion){
                case "saldo" :
                    System.out.println(saldClient);
                    return;

                case "retiro":
                    System.out.println("cuanto desea retirar");
                int retiro = lol.nextInt();

                if (retiro > 0 && retiro < cliente1.getSaldoCliente()){
                    cliente1.setSaldoCliente( retiro - cliente1.getSaldoCliente() );
                }else {
                    System.out.println(saldClient);
                    break;
                }

                case "deposito":
                    System.out.println("cuanto desea deposito");
                    int deposito = lol.nextInt();

                    if (deposito > 0 ){
                        cliente1.setSaldoCliente( deposito + cliente1.getSaldoCliente() );
                    }else{
                        System.out.println("saldo insuficiente");
                        System.out.println(cliente1.getSaldoCliente());
                    }

                // aqui falta algunos datos para que sea mas  y me jor la app de banco
                     // falta mas mejoras y mas avancess


            }

            System.out.println(cliente1.getSaldoCliente());

        } else{
            System.out.println("no es cliemte ,lo siento".toUpperCase());
}

    }
}
