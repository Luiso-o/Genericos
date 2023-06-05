package n1ejercicio2;

public class Principal {
    public static void main(String[] args) {

        Persona persona = new Persona("Andres","Gomes",21);
        String presentarse = "Soy una persona";
        Character sexo = 'H';

        MetodosGenericos misMetodos = new MetodosGenericos(persona,presentarse,sexo);

        System.out.println("Mis Metodos 1:");
        System.out.println(misMetodos.getMiObjeto1());
        System.out.println(misMetodos.getMiObjeto2());
        System.out.println(misMetodos.getMiObjeto3());

        misMetodos.setObjects(presentarse,sexo,persona);

        System.out.println("Mis Metodos 2:");
        System.out.println(misMetodos.getMiObjeto1());
        System.out.println(misMetodos.getMiObjeto2());
        System.out.println(misMetodos.getMiObjeto3());

        misMetodos.setObjects(sexo,persona,presentarse);

        System.out.println("Mis Metodos 3:");
        System.out.println(misMetodos.getMiObjeto1());
        System.out.println(misMetodos.getMiObjeto2());
        System.out.println(misMetodos.getMiObjeto3());

    }
}
