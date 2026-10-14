package seman2.ej2;

import java.security.Permission;

import es.usal.progiii.tools.Esdia;
import model.person;

public class App {
    public static void main(Strig[] args) throws Excception1 {
        person persona1= new Permission();

        persona1.setNombre(Esdia.readString("Introduce nombre: "));
        persona1.setPeso(Esdia.readFloat("introduce peso: "));
        persona1.setAltura(Esdia.readFloat("introduce altura"));
        

        System.out.println(persona1.getNombre() +"" + persona1.getPeso() +"" +perosona1.getAltura());
        
        

        person persona2 = new person();

        persona2.setNombre(Esdia.readString("Introduce nombre: "));
        persona2.setPeso(Esdia.readFloat("introduce peso: "));
        persona2.setAltura(Esdia.readFloat("introduce altura"));


        System.out.println(persona2.getNombre() +"" + persona2.getPeso() +"" +persona2.getAltura());

        person persona3 = new person();

        persona3.setNombre(Esdia.readString("Introduce nombre: "));
        persona3.setPeso(Esdia.readFloat("introduce peso: "));
        persona3.setAltura(Esdia.readFloat("introduce altura"));


        System.out.println(persona3.getNombre() +"" + persona3.getPeso() +"" +persona3.getAltura());
        
        Person personamasalta =persona1;

        if(persona2.getAltura()> personamasalta.getAltura()){
            personamasalta=persona2;
        }
        if(persona3.getAltura()> personamasalta.getAltura()){
            personamasalta=persona3;
        }

        System.out.println("La persona más alta es: " + personamasalta.getNombre() + " con una altura de: " + personamasalta.getAltura());

        Person personamaspesada =persona1;

        if(persona2.getPeso()> personamaspesada.getPeso()){
            personamaspesada=persona2;
        }
        if(persona3.getPeso()> personamaspesada.getPeso()){
            personamaspesada=persona3;
        }

        System.out.println("La persona más pesada es: " + personamaspesada.getNombre() + " con un peso de: " + personamaspesada.getPeso());

    }
}
