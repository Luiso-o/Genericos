package n3ejercicio1;

public class Smartphone implements Telefono{

    public Smartphone() {}

    @Override
    public void llamar() {
        System.out.println("Llamada en curso...");
    }

    public void hacerFotos(){
        System.out.println("Sonríe :D");
    }

}
