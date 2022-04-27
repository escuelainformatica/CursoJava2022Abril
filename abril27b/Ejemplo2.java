package abril27b;

import java.util.ArrayList;
import java.util.List;

import abril27b.modelo.Cliente;

public class Ejemplo2 {
    
    public static void main(String[] args) {
        // quisiera tener una lista de clientes
        // Rut  | Nombre | Direccion
        //---------------------------
        //1111-1| John   | Sunset blv.
        //2222-2| Peter  | Avenida ccc.

        // 1) crear un modelo.  
        //    crear una clase, ideal en una carpeta con el nombre correspondiente (deberia ser en singular)
        // 2) voy a crear las filas.
        Cliente cli1=new Cliente();
        cli1.rut="1111-1";
        cli1.nombre="john";
        cli1.direccion="sunset blv";
        Cliente cli2=new Cliente("22222-2", "Peter", "Avenida ccc.");
        // 3) voy a crear el listado
        List<Cliente> clientes=new ArrayList<>();
        // 4) voy a agregar datos al listado
        clientes.add(cli1);
        clientes.add(cli2);

        // con arreglos.
        Cliente[] clientesArreglo=new Cliente[2];
        clientesArreglo[0]=cli1;
        clientesArreglo[1]=cli2;

        // 5) mostrar los nombres de los clientes.
        // sout
        System.out.println(clientes.get(0).nombre);
        System.out.println(clientes.get(1).nombre);

        System.out.println("La cantidad de clientes es "+clientes.size());

    }

}
