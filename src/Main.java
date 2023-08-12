import Logica.Auto;
import Logica.Propietario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Auto auto = solictarDatosAuto();

        // mostrar los datos del auto
        System.out.println("**** Datos Auto ********\n");
        System.out.println("Id: " + auto.getId());
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Cantidad propietarios: " + auto.getPropietarios().size() + "\n");
        // mostrar los propietarios
        System.out.println("***** Datos Propietarios *******\n");

        // mostrar los propietarios
        for (Propietario propietario : auto.getPropietarios()){
            System.out.println("Id: " + propietario.getId());
            System.out.println("Nombre: "+ propietario.getNombre());
            System.out.println("Apellido: " + propietario.getApellido());
            System.out.println("------------------------------------\n");
        }
    }

    /**
     * funcion solictarDatosAuto, encargado de solictar los datos de un auto
     * @return Auto con los datos necesarios para mostrarse
     */
    public static Auto solictarDatosAuto(){

        // instancia de la clase Auto
        Auto auto = new Auto();

        // instancia de la clase scanner
        Scanner scanner = new Scanner(System.in);

        int numPropietarios = 0;

        System.out.println("****** ingreso Datos Auto *********\n");
        System.out.println("Ingrese el id del auto: ");
        auto.setId(scanner.nextLong());
        // resetear la clase scanner
        scanner.nextLine();
        System.out.println("Ingrese la marca del auto: ");
        auto.setMarca(scanner.nextLine());
        System.out.println("Ingrese el modelo del auto: ");
        auto.setModelo(scanner.nextLine());
        System.out.println("Ingrese el numero de propietarios que tiene el auto: ");
        numPropietarios = scanner.nextInt();

        // resetear la clase scanner
        scanner.nextLine();

        // invocar el metodo encargado de solictar los datos de un propietario
        List<Propietario> propietarios = solicitarDatosPropietario(scanner, numPropietarios);

        // asigar los propietarios al auto
        auto.setPropietarios(propietarios);

        // cerrar el scanner
        scanner.close();

        // retornamos un auto
        return auto;
    }

    /**
     * funcion solictarDatosPropietario, encargado de solicitar los datos un propietario
     * @param scanner solcitar datos por teclado
     * @param numPropietarios numero de propietarios que se le solicitaran sus datos
     * @return lista de propietarios para asignarselo a un auto
     */
    public static List<Propietario> solicitarDatosPropietario(Scanner scanner, int numPropietarios){

        // crear lista de propietarios
        List<Propietario> propietarioList = new ArrayList<>();

        for (int i = 0; i < numPropietarios; i++){
            Propietario propietario = new Propietario();

            // asignar id dinamico dependiendo del numero de propietarios
            propietario.setId(i + 1L);

            System.out.println("Ingrese el nombre del propietario " + (i + 1) + " : ");
            propietario.setNombre(scanner.nextLine());
            System.out.println("Ingrese el apellido del propietario " + (i + 1) + " : ");
            propietario.setApellido(scanner.nextLine());

            // asignar datos a la lista
            propietarioList.add(propietario);
        }

        // retornar la lista de propietarios
        return propietarioList;
    }
}