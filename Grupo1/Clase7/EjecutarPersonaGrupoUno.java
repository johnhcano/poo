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


    }
}
