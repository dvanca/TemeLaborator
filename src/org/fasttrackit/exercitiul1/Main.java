package org.fasttrackit.exercitiul1;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> clasa = new HashMap<>();
        clasa.put("Razvan Popescu",10);
        clasa.put("Mircea Diaconu",9);
        clasa.put("Elena Basescu",9);
        clasa.put("Virgil Iantu",8);
        clasa.put("Horea Enescu",7);

        System.out.println(clasa);
        System.out.println(clasa.keySet());

        int maxGrade =0;
        String name = null;
        for(Map.Entry<String, Integer> entry : clasa.entrySet()){
            if(entry.getValue()>maxGrade){
                maxGrade= entry.getValue();
                name = entry.getKey();
            }
        }
        System.out.println(name +" "+ maxGrade);

    }
}
