public class Expresiones {
    public static void main(String[] args){

        /*
         * Evaluar la siguiente expresión para A = 2 y B = 5: 3 * A - 4 * B / A ^ 2
         */

         int a = 2;
         int b = 5;

         System.out.println( 3 * a - 4 * b / Math.pow(a,2) );
    }
}