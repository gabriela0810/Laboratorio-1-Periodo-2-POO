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
public class Reptiles extends Mascotas{
    public String color;
    public String seArrastra;
    public String veneno;

    public Reptiles(String color, String seArrastra, String veneno, String animal, String nombre, int edad, String genero) {
        super(animal, nombre, edad, genero);
        this.color = color;
        this.seArrastra = seArrastra;
        this.veneno = veneno;
    }
    
    public String mudarPiel(){
        String mp="El Reptil esta cambiando de piel y caparazon";
        return mp;
    }
    
    public String reproduccion(){
        String repro="Ponen huevos en la tierra, incubados naturalmente";
        return repro;
    }
    
    @Override
    public String infoAnimal() {
        String info="Reptil: " + this.animal + "\n" +
                    "Nombre: " + this.nombre + "\n" +
                    "Edad: " + this.edad + " año\n" +
                    "Genero: " + this.genero + "\n" +
                    "Color: " + this.color + "\n" +
                    "Se arrastra: " + this.seArrastra + "\n" +
                    "Reptil venenoso: " + this.veneno + "\n";
       return info;
    }

    @Override
    public String origenMascotas() {
        String msj="El origen de las tortugas es de Asia meridional ";
        return msj;
    }
    
}
