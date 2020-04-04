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
public class Mamiferos extends Mascotas{
    public String colorPelo;
    public String raza;
    public String tamaño;

    public Mamiferos(String colorPelo, String raza, String tamaño, String animal, String nombre, int edad, String genero) {
        super(animal, nombre, edad, genero);
        this.colorPelo = colorPelo;
        this.raza = raza;
        this.tamaño = tamaño;
    }
    
    public String ladrar(){
        String mm="El perro esta ladrando";
        return mm;
    }
    
    public String pelaje(){
        String pelaje="Los perros cambian su pelaje cada cierto tiempo";
        return pelaje;
    }

    @Override
    public String infoAnimal() {
        String info="Mamifero: " + this.animal + "\n" +
                    "Nombre: " + this.nombre + "\n" +
                    "Edad: " + this.edad + " año\n" +
                    "Genero: " + this.genero + "\n" +
                    "Color de Pelo: " + this.colorPelo + "\n" +
                    "Raza: " + this.raza + "\n" +
                    "Tamaño del perro: " + this.tamaño + "\n";
       return info;
    }

    @Override
    public String origenMascotas() {
        String msj="Raza canina originaria de Terranova, en la actual Canadá ";
        return msj;
    }
    
}
