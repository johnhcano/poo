public class EjecutarHerencia1 {
    public static void main(String[] args) {
        
        Animal lucas = new Perro();
        Animal ceniza = new Gato();

        //hacerSonido() es la materialización del polimorfismo, es decir,
        //la capacidad que tiene un método de comportarse
        //según quién lo llame.

        lucas.hacerSonido();
        ceniza.hacerSonido();


    }
}
