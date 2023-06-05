package n2ejercicio1;

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

    public void setObjects(Persona obj1, Object obj2, Object obj3) {
        this.miObjeto1 = obj1;
        this.miObjeto2 = obj2;
        this.miObjeto3 = obj3;
    }

}
