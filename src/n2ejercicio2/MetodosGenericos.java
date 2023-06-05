package n2ejercicio2;

public class MetodosGenericos {

    private Persona miObjeto1;
    private Object miObjeto2;
    private Object miObjeto3;

    public MetodosGenericos(Persona miObjeto1, Object miObjeto2, Object miObjeto3) {
        this.miObjeto1 = miObjeto1;
        this.miObjeto2 = miObjeto2;
        this.miObjeto3 = miObjeto3;
    }

    public Object getMiObjeto1() {
        return miObjeto1;
    }

    public Object getMiObjeto2() {
        return miObjeto2;
    }

    public Object getMiObjeto3() {
        return miObjeto3;
    }


    //metodos constructor genericos
    public static MetodosGenericos create(Object obj1, Object obj2, Object obj3) {
        if (obj1 instanceof Persona) {
            return new MetodosGenericos((Persona) obj1, obj2, obj3);
        } else if (obj2 instanceof Persona) {
            return new MetodosGenericos((Persona) obj2, obj1, obj3);
        } else if (obj3 instanceof Persona) {
            return new MetodosGenericos((Persona) obj3, obj1, obj2);
        } else {
            throw new IllegalArgumentException("Al menos uno de los argumentos debe ser de tipo Persona.");
        }
    }

}
