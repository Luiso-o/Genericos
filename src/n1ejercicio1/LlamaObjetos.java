package n1ejercicio1;

public class LlamaObjetos {

    public static void main(String[] args) {

        Object objeto1 = "Soy un String";
        Object objeto2 = 1234;
        Object objeto3 = true;

        MetodosNoGenericos misMetodos = new MetodosNoGenericos(objeto1,objeto2,objeto3);

        System.out.println("Mis Objetos 1: ");
        System.out.println("-"+misMetodos.getMiObjeto1());
        System.out.println("-"+misMetodos.getMiObjeto2());
        System.out.println("-"+misMetodos.getMiObjeto3());

        misMetodos.setObjects(objeto3,objeto1,objeto2);

        System.out.println("Mis Objetos 2: ");
        System.out.println("-"+misMetodos.getMiObjeto1());
        System.out.println("-"+misMetodos.getMiObjeto2());
        System.out.println("-"+misMetodos.getMiObjeto3());

        misMetodos.setObjects(objeto2,objeto3,objeto1);

        System.out.println("Mis Objetos 3: ");
        System.out.println("-"+misMetodos.getMiObjeto1());
        System.out.println("-"+misMetodos.getMiObjeto2());
        System.out.println("-"+misMetodos.getMiObjeto3());


    }

}
