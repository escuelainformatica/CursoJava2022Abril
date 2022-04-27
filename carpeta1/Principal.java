package carpeta1;

public class Principal {
    // campos (int campo)
    public int campo;

    // esta es la funcion o metodo principal llamado "main"
    public static void main(String[] args) {
        int numero1=1;
        int numero2=2;
        int suma=numero1+numero2;
        System.out.println("la suma es :"+suma);

        Modelo mod=new Modelo();
        mod.nombre="cocacola";
        System.out.println(mod.nombre);
    }

    // un metodo o funcion con dos argumentos y que devuelve nada
    public void funcion1(int argumento1,int argumento2) {

    }
    // un metodo o funcion con dos argumentos y que devuelve un entero
    public int funcion2(int argumento1,int argumento2) {
        int resultado=0;

        return resultado;

    }
}
