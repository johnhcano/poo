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
         * Problema b. Si la temperatura es superior a 100 grados, visualizar el mensaje
         * “por encima del punto de ebullición del agua” sino visualizar el mensaje
         * “por debajo del punto de ebullición del agua”.
         */

        int temperatura = 80;
        if (temperatura > 100) {
            System.out.println("por encima del punto de ebullición del agua");
        } else {
            System.out.println("por debajo del punto de ebullición del agua");
        }

        /*
         * Problema c. Si el número es positivo, sumar el número a total de positivos,
         * sino sumar al total de negativos.
         */

        int positivos = 0, negativos = 0, numero = -14;
        if (numero >= 0) {
            positivos = positivos + numero; // positivos += numero
            System.out.println("total positivos: " + positivos);
        } else {
            negativos = negativos + numero; // negativos += numero
            System.out.println("Total negativos: " + negativos);
        }

        /*
         * Problema d. Si x es mayor que y, y z es menor que 20, leer un valor para p.
         * --> if(x > y && z < 20)
         */

        /*
         * Problema e. Si distancia es mayor que 20 y menos que 35, leer un valor para
         * tiempo.
         * --> if (distancia > 20 && distancia < 35)
         */

        /*
         * Problema 4.9 Un ángulo se considera agudo si es menor de 90 grados, obtuso si es mayor de 90 grados 
         * y recto si es igual a 90 grados. Utilizando esta información, escribir un algoritmo 
         * que acepte un ángulo en grados y visualice el tipo de ángulo correspondiente a los 
         * grados introducidos.
         */ 

         int a = 90;
         if (a < 90){
            System.out.println("Ángulo Agudo");
         }else if(a > 90){
            System.out.println("Ángulo Obtuso");
         }else{
            System.out.println("Ángulo Recto");
         }

    }
}