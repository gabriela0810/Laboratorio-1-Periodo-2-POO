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
public class Peces extends Mascotas{
    public String colorEscamas;
    public String tamaño;
    public String tipoAgua;

    public Peces(String colorEscamas, String tamaño, String tipoAgua, String animal, String nombre, int edad, String genero) {
        super(animal, nombre, edad, genero);
        this.colorEscamas = colorEscamas;
        this.tamaño = tamaño;
        this.tipoAgua = tipoAgua;
    }
    
    public String nadar(){
        String nd="El Pez esta nadando";
        return nd;
    }
    
    public String tiempoComida(){
        String comida="Este tipo de peces comen cada 12 0 13 horas";
        return comida;
    }
    
    @Override
    public String infoAnimal() {
        String info="Pez: " + this.animal + "\n" +
                    "Nombre: " + this.nombre + "\n" +
                    "Edad: " + this.edad + " año\n" +
                    "Genero: " + this.genero + "\n" +
                    "Color de Escamas: " + this.colorEscamas + "\n" +
                    "Tamaño: " + this.tamaño + "\n" +
                    "Tipo de Agua(Dulce o Salada): " + this.tipoAgua + "\n";
       return info;
    }

    @Override
    public String origenMascotas() {
        String msj="Es nativo del Sudeste Asiático mayormente en Tailandia y Camboya";
        return msj;
    }
    
}
