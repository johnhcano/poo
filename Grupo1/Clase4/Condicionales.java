public class Condicionales {
    public static void main(String[] args) {

        // Problema1: Se necesita validar la edad de una persona mayor de edad (En
        // Colombia la mayoría de edad se obtiene al cumplir los 18 años)

        // Se declara la variable edad de tipo entero
        int edad = 18;

        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        /*
         * Problema a. Si un ángulo es igual a 90 grados, imprimir el mensaje
         * "El ángulo es un ángulo recto"
         * sino imprimir el mensaje "El ángulo no es un ángulo recto".
         */

        int angulo = 100;
        if (angulo == 90) {
            System.out.println("El ángulo es un ángulo recto");
        } else {
            System.out.println("El ángulo no es un ángulo recto");
        }

        /*
         * Problema b. Si la temperatura es superior a 100 grados, visualizar el mensaje “por encima del 
         * punto de ebullición del agua” sino visualizar el mensaje “por debajo del punto de 
         * ebullición del agua”.
         */

         int temperatura = 80;
         if (temperatura > 100){
            System.out.println("por encima del punto de ebullición del agua");
         }else{
            System.out.println("por debajo del punto de ebullición del agua");
         }

    }
}