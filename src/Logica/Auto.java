package Logica;

import java.util.List;

public class Auto {
    private Long id;
    private String marca;
    private String modelo;
    // private Propietario propietario; // relacion de 1 a 1
    private List<Propietario> propietarios; // relacion de 1 a n

    public Auto(){

    }

    /*// constuctor con relacion de 1 a 1
    public Auto(Long id, String marca, String modelo, Propietario propietario){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
    }*/

    public Auto(Long id, String marca, String modelo, List<Propietario> propietarios){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.propietarios = propietarios;
    }

    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    /*// getter relacion de 1 a 1
    public Propietario getPropietario(){
        return this.propietario;
    }
    // setter relacion de 1 a 1
    public void setPropietario(Propietario propietario){
        this.propietario = propietario;
    }*/

    // getter relacion de 1 a n
    public List<Propietario> getPropietarios(){
        return this.propietarios;
    }

    // setter relacion de 1 a n
    public void setPropietarios(List<Propietario> propietarios){
        this.propietarios = propietarios;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", propietarios=" + propietarios +
                '}';
    }
}
