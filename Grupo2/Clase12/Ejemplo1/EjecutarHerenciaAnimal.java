public class EjecutarHerenciaAnimal {
    public static void main(String[] args) {
        
        Animal tomoe = new Gato();
        Animal doki = new Perro();

        tomoe.hacerSonido();
        doki.hacerSonido();

    }
}
