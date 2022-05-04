package mayo4;

public class Ejercicio4Mayo {

    public static void main(String[] args) {
        
        // 1) variables.
        // 2) definicion clase.
        // 3) listado, arrays.
        // 4) condiciones
        // 5) ciclos
        // 6) definicion de funciones
        // 7) control de error.

        boolean hayStock=true; // false 
        int entero=20+40-40*(20+30);
        String texto="hola"+"mundo";

        boolean esMayor= 1 > 2; // operador logico (false)

        // > :mayor a
        // < :menor a
        // >= : mayor o igual
        // <= : menor o igual.
        // == : igualdad.
        // != : no igual

        if(1==2) {
            System.out.println("1 es igual a dos");
        } else {
            System.out.println("1 no es igual a dos");
        }

        int num1=2;
        int num2=2;
        System.out.println("comparacion numero 1 con numero2:");
        if(num1<num2) {
            System.out.println("numero1 es menor que numero2");
        } else {
            if(num1>num2) {
                System.out.println("numero1 es mayor que numero2");
            } else {
                System.out.println("numero1 y numero2 son iguales");
            }
        }

        // 1gigahertz mil millones de op por segundo

        if(num1<num2) {
            System.out.println("numero1 es menor que numero2");
        }
        if(num1>num2) {
            System.out.println("numero1 es mayor que numero2");
        }
        if(num1==num2) {
            System.out.println("son iguales");
        }



    }//aqui terminal la funcion main
    
} // aqui terminal la clase
