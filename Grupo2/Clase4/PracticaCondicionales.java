public class PracticaCondicionales {
    public static void main(String[] args) {
        /*
         * Ejercicio 4.1.a)
         * Requerimiento: Si un ángulo es igual a 90 grados, imprimir el
         * mensaje "El ángulo es un ángulo recto" sino imprimir el
         * mensaje "El ángulo no es un ángulo recto".
         * 
         * Entrada: ángulo
         * Proceso: validar si el ángulo es igual a 90 grados
         * Salida: obtener el mensaje si es o no es un angulo recto.
         */

        int angulo = 90;

        if (angulo == 90) {
            System.out.println("El ángulo es un ángulo recto");
        } else {
            System.out.println("El ángulo no es un ángulo recto");
        }

        /*
         * Si la temperatura es superior a 100 grados, visualizar el 
         * mensaje "por encima del punto de ebullición del agua" sino 
         * visualizar el mensaje "por debajo del punto de ebullición del agua".
         * 
         * Entrada: temperatura
         * Proceso: validar que la temperatura sea superior a 100 grados
         * Salida: si alcanza o no el punto de ebullición.
         */

         double temperatura = 100.0;
         if (temperatura > 100){
            System.out.println("por encima del punto de ebullición del agua");
         } else {
            System.out.println("por debajo del punto de ebullición del agua");
         }
    }
}
