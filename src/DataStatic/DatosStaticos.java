package DataStatic;

import Logica.Auto;
import Logica.Propietario;

import java.util.ArrayList;
import java.util.List;

public class DatosStaticos {
    public static void main(String[] args){
        // instancear un nuevo auto
        Auto auto = new Auto();

        auto.setId(25L);
        auto.setMarca("Toyota");
        auto.setModelo("Yaris");

        // crear una lista de propietarios
        List<Propietario> propietarioList = new ArrayList<>();

        // crear propietaios
        Propietario propietario1 = new Propietario(1L, "Gerson", "Benito");
        Propietario propietario2 = new Propietario(2L, "Pepe", "Grillo");

        // agregar a la lista los propietarios del auto
        propietarioList.add(propietario1);
        propietarioList.add(propietario2);

        // asignar los propietarios al auto
        auto.setPropietarios(propietarioList);

        // mostrar los datos asignados a auto
        System.out.println("El auto " + auto.getMarca() + " " + auto.getModelo() + " "+ auto.getPropietarios());
    }
}
