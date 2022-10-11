package org.fasttrackit.exercitiul2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Person> lista = new ArrayList<>();
        lista.add(new Person("Ioan", 33, "blue"));
        lista.add(new Person("Iulian", 23, "blonde"));
        lista.add(new Person("Gesepi", 13, "black"));
        lista.add(new Person("Ioana", 29, "chestnut"));
        lista.add(new Person("Ion", 63, "bald"));

        System.out.println(lista);

        List<String> listaCuNume = new ArrayList<>();

        for(Person e : lista){
            listaCuNume.add(e.getName());
        }

        System.out.println(listaCuNume);

        Map<String, Integer> mapaLista = new HashMap<>();

        for(Person e : lista){
            mapaLista.put(e.getName(), e.getAge());
        }

        System.out.println(mapaLista);

        int varstaMaxima = 33;
        List<String> listaPersoaneTinere = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : mapaLista.entrySet()){
            if(entry.getValue()<varstaMaxima){
                listaPersoaneTinere.add(entry.getKey());
            }
        }

        System.out.println(listaPersoaneTinere);


        Map<String, List<String>> mapaPar = new HashMap<>();
        int i=0;
        for(Person e : lista){
            mapaPar.put(e.getHairColour(), Collections.singletonList(listaCuNume.get(i)));
            i++;
        }


        System.out.println(mapaPar);


        Map<Integer ,List<Person>> listaEx2Ultimul = new HashMap<>();
        for(Person e : lista){
            listaEx2Ultimul.put(e.getAge(), lista);
        }

        System.out.println(listaEx2Ultimul);

    }

}
