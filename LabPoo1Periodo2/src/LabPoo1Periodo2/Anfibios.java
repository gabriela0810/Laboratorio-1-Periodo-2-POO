/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabPoo1Periodo2;

/**
 *
 * @author jenni
 */
public class Anfibios extends Mascotas{
    public String color;
    public String tipoAnimal;
    public String tipoHabita;

    public Anfibios(String color, String tipoAnimal, String tipoHabita, String animal, String nombre, int edad, String genero) {
        super(animal, nombre, edad, genero);
        this.color = color;
        this.tipoAnimal = tipoAnimal;
        this.tipoHabita = tipoHabita;
    }

    
    public String saltar(){
        String salt="Este tipo de anfibio se arrastra";
        return salt;
    }
    
    public String treparParedes(){
        String trepar="Los anfibios pueden trepara objetos";
        return trepar;
    }

    @Override
    public String infoAnimal() {
        String info="Anfibio: " + this.animal + "\n" +
                    "Nombre: " + this.nombre + "\n" +
                    "Edad: " + this.edad + " año\n" +
                    "Genero: " + this.genero + "\n" +
                    "Color: " + this.color + "\n" +
                    "Tipo de Habitat: " + this.tipoHabita + "\n" +
                    "Tipo de animal: " + this.tipoAnimal + "\n";
       return info;
    }

    @Override
    public String origenMascotas() {
        String msj="Se distribuyen en los continentes del hemisferio norte ";
        return msj;
    }
    
}
