package cuentas.clientes;

public class Main {

    public static void main(String[] args) {
        //Comentario para la segunda modificación.
        operativa_cuenta(10.5F);
        operativa_cuenta(1045.5F); //Llamamos nuevamente al método
    }

    private static void operativa_cuenta(java.lang.Float cantidad) {
        Cuenta cuenta1;
        double saldoActual;

        cuenta1 = new Cuenta("Rafael Nadal Parera","1000-2365-85-1230456789",2500,0);
        
        System.out.println("El saldo actual es:"+ cuenta1.estado() );

        try {
            cuenta1.retirar(2300);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
