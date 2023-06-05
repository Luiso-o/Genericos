package n2ejercicio2;

public class Principal {
    public static void main(String[] args) {

        Persona persona = new Persona("Andres","Gomes",21);
        String presentarse = "Soy una persona";
        Character sexo = 'H';

        MetodosGenericos misMetodos1 = MetodosGenericos.create(persona,presentarse,sexo);

        System.out.println("Mis Metodos 1:");
        System.out.println(misMetodos1.getMiObjeto1());
        System.out.println(misMetodos1.getMiObjeto2());
        System.out.println(misMetodos1.getMiObjeto3());

        MetodosGenericos misMetodos2 = MetodosGenericos.create(presentarse,sexo,persona);

        System.out.println("Mis Metodos 2:");
        System.out.println(misMetodos2.getMiObjeto1());
        System.out.println(misMetodos2.getMiObjeto2());
        System.out.println(misMetodos2.getMiObjeto3());

        MetodosGenericos misMetodos3 = MetodosGenericos.create(sexo,persona,presentarse);

        System.out.println("Mis Metodos 3:");
        System.out.println(misMetodos2.getMiObjeto1());
        System.out.println(misMetodos2.getMiObjeto2());
        System.out.println(misMetodos2.getMiObjeto3());

    }
}
