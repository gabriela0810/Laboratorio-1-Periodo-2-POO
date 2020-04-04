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
public class Aves extends Mascotas{
    public String colorPlumas;
    public String pesoAve;
    public String puedeVolar;

    public Aves(String colorPlumas, String pesoAve, String puedeVolar, String animal, String nombre, int edad, String genero) {
        super(animal, nombre, edad, genero);
        this.colorPlumas = colorPlumas;
        this.pesoAve = pesoAve;
        this.puedeVolar = puedeVolar;
    }

    
    
    public String volar(){
        if (this.puedeVolar.equals("si") || this.puedeVolar.equals("Si") || this.puedeVolar.equals("SI")){
            String vuelo="El ave esta volando";
            return vuelo;
        }else{
            String vuelo="El ave no puede Volar :(";
            return vuelo;
        }
        
    } 
    
    public String cantar(){
        String canto="El ave esta cantando";
        return canto;
    }

    @Override
    public String infoAnimal() {
        String info="Ave: " + this.animal + "\n" +
                    "Nombre del Ave: " + this.nombre + "\n" +
                    "Edad del Ave: " + this.edad + " año\n" +
                    "Genero del Ave: " + this.genero + "\n" +
                    "Color de Plumas: " + this.colorPlumas + "\n" +
                    "Peso del ave: " + this.pesoAve + "\n";
       return info;
    }

    @Override
    public String origenMascotas() {
        String msj="Estas aves son originarias de Australasia ";
        return msj;
    }    
}
