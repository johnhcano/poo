package Grupo20262;

public class MainBanco {
    public static void main(String[] args) {
        
        //Creación del objeto Cuenta
        Cuenta cuenta = new Cuenta("5869874-2", "Juan", 0);

        //Creación del objeto Cliente
        Cliente cliente =  new Cliente(1012587965, "Camilo");

        //Creación del objeto Banco
        Banco banco = new Banco("AVVillas", "Oficina Centenario", cuenta);

        System.out.println(banco);

    }
}
