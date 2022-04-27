package abril27b.modelo;

public class Cliente {
    // campo
    public String rut;
    public String nombre;
    public String direccion;

    // constructor
    // 1) tiene el nombre de la clase
    // 2) no devuelve nada, no tiene ni void ni nada adicional.
    // 3) se puede crear mas de un constructor, siempre y cuando tenga diferentes numeros de argumentos

    public Cliente() {

    }

    public Cliente(String r1,String n1,String d1) {
        rut=r1;
        nombre=n1;
        direccion=d1;
    }



    // funcion o metodo
    public int mifuncion(int arg1,int arg2) {
        return 20;
    }
    public int mifuncion(int arg1) {
        return 20;
    }
}
