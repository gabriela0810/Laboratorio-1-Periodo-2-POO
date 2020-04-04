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
public class LabPoo1 {
    public static void main(String[] args) {
        
        Aves luna=new Aves("Blancas con Amarillo", "630 g", "si", "Cacatuidae/Cacatuas", "Luna", 2, "Hembra");
        
        System.out.println(luna.infoAnimal());
        System.out.println(luna.cantar());
        System.out.println(luna.volar());
        System.out.println(luna.origenMascotas());
        System.out.println("\n********************************************************************************\n");
        
        Anfibios argos=new Anfibios("Negro con amarillo", "Anfibio", "Tropical", "Salamandra/Triton", "Argos", 1, "Macho");
        
        System.out.println(argos.infoAnimal());
        System.out.println(argos.saltar());
        System.out.println(argos.treparParedes());
        System.out.println(argos.origenMascotas());
        System.out.println("\n********************************************************************************\n");
        
        Mamiferos odin=new Mamiferos("Crema claro", "Labrador retriever", "Mediano", "Perro", "Odin", 3, "Macho");
        
        System.out.println(odin.infoAnimal());
        System.out.println(odin.ladrar());
        System.out.println(odin.origenMascotas());
        System.out.println(odin.pelaje());
        System.out.println("\n********************************************************************************\n");
        
        Reptiles sami=new Reptiles("Amarillo con verde oscuro", "si", "no", "Tortuga", "Sami", 5, "Hembra");
        
        System.out.println(sami.infoAnimal());
        System.out.println(sami.mudarPiel());
        System.out.println(sami.origenMascotas());
        System.out.println(sami.reproduccion());
        System.out.println("\n********************************************************************************\n");
        
        Peces ronie=new Peces("Azul royal", "6 cm", "Dulce", "Pez combatiente", "Ronie", 1, "Macho");
        
        System.out.println(ronie.infoAnimal());
        System.out.println(ronie.nadar());
        System.out.println(ronie.origenMascotas());
        System.out.println(ronie.tiempoComida());
        
    }
}
