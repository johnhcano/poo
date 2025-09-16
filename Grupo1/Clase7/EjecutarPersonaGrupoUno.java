public class EjecutarPersonaGrupoUno {
    public static void main(String[] args) {
        
        //Forma1
        //Creación del objeto objPersona1
        Persona objPersona1;
        //Instanciar el objeto (new) --> Instanciar es igual a crear (Darle vida al objeto)
        objPersona1 = new Persona("Camilo", "Cifuentes", 22, 1120345, 68.4);

        //Forma2
        Persona objPersona2 = new Persona("Byron", "Cano", 35, 1001980, 60.0);

        //Mostrar por pantalla el objeto creado
        System.out.println(objPersona1.toString());
        System.out.println(objPersona2.toString());

        //Mostrar el nombre de la persona1
        System.out.println(objPersona1.getNombre());

        //Modificar el nombre de la persona2
        objPersona2.setNombre("Harvin"); 

        //Mostrar el objeto objPersona2 con la modificación del nombre
        System.out.println(objPersona2.toString());


        /* Tarea: 
         * Crear 3 objetos más de la clase Persona
         * Crear los metodos get y set para los atributos que faltan
         * Crear el metodo saludar que retorne un saludo con el nombre de la persona
         * Crear el metodo esMayorDeEdad que retorne true si la persona es mayor de edad (18 años) y false si no lo es
         * Crear el metodo calcularIMC que retorne el indice de masa corporal (IMC) de la persona
         * IMC = peso (kg) / (altura (m) * altura (m))
         * Mostrar por pantalla los resultados de los nuevos metodos
         */
        
    }
}
