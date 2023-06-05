package n3ejercicio1;

public class Principal {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Generica generica = new Generica();

        generica.metodo1(smartphone);
        generica.metodo2(smartphone);

        /*Por las condiciones del ejercicio no es posible llamar al metodo hacer fotos desde la clase Generica limitada
        por tener solamente el metodo llamar, la unica clase que puede usar ese metodo hacerFotos es la clase Smartphone además
        de implementar la interfaz Telefono por ende su metodo llamar. */
    }
}
