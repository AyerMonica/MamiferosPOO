import Mamiferos.*;

import java.util.ArrayList;
import java.util.List;

public class EjemploMamiferos {

    public static void main (String[] args){

        List<Mamifero> mamiferos = new ArrayList<>();

        mamiferos.add(new Lobo ("Bosques, tundras y montañas", 0.85, 1.4, 42,
                "Canis lupus lupus", "gris con tonos marrones", 5.5,
                8, "Lobo gris europeo"));
        mamiferos.add(new Lobo ("Regiones árticas y tundras nevadas", 0.9, 1.5, 50,
                "Canis lupus arctos", "blanco", 6.2,
                5, "Lobo ártico"));


        mamiferos.add(new PerroAfricano("Sabanas y praderas del África subsahariana",
                0.75, 1.1, 28, "Lycaon pictus", "manchado negro, blanco y marrón",
                4.5, 320));
        mamiferos.add(new PerroAfricano("Sabanas abiertas y zonas semiáridas de África",
                0.8, 1.15, 32, "Lycaon pictus", "negro con manchas amarillas",
                4.8, 340));


        mamiferos.add(new Leon ("Sabanas africanas", 1.2, 2.1, 190,
                "Panthera leo", 7, 80, 12, 114));
        mamiferos.add(new Leon ("Praderas y sabanas abiertas de África", 1.1, 1.9, 130,
                "Panthera leo", 6.5, 75, 15, 110));


        mamiferos.add(new Tigre("Selvas y manglares del sur de Asia", 1.1, 2.3, 220,
                "Panthera tigris tigris", 8, 65, "Tigre de bengala"));
        mamiferos.add(new Tigre("Bosques fríos del este de Rusia", 1.15, 2.5, 300,
                "Panthera tigris altaica", 8.5, 60, "Tigre siberiano"));


        mamiferos.add(new Guepardo("Sabanas abiertas y praderas africanas", 0.9, 1.4, 50,
                "Acinonyx jubatus", 4, 110));
        mamiferos.add(new Guepardo("Regiones semiáridas y sabanas del noreste de África", 0.85, 1.35, 45,
                "Acinonys jubatus", 3.8, 105));

        for (Mamifero a: mamiferos){
            System.out.println(a.comer() + a.comunicarse() + a.correr() + a.dormir());
            System.out.println();
        }
    }

}
