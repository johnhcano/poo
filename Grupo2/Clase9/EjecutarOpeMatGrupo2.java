public class EjecutarOpeMatGrupo2 {
    public static void main(String[] args) {
        
        OperacionesMatematicas objOp = new OperacionesMatematicas(8,6);

        System.out.println("El resultado de la suma es: " + objOp.sumar());
        System.out.println("El resultado de la resta es: " + objOp.restar());
        System.out.println("El resultado de la multiplicación es: " + objOp.multiplicar());
        System.out.println("El resultado de la división es: " + objOp.dividir());
        

    }
}
