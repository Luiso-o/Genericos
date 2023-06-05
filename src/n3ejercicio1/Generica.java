package n3ejercicio1;

public class Generica {

   public <T extends Telefono> void metodo1(T telefono) {
      telefono.llamar();
   }

   public void metodo2(Smartphone smartphone) {
      smartphone.llamar();
      smartphone.hacerFotos();
   }


}
