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
public abstract class Mascotas {
    public String animal;
    public String nombre;
    public int edad;
    public String genero;
    

    public Mascotas() {
    }

    public Mascotas(String animal, String nombre, int edad, String genero) {
        this.animal = animal;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    
    
    public abstract String infoAnimal();
    
    public abstract String origenMascotas();
    
}
