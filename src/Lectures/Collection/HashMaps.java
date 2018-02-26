package Lectures.Collection;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {

        HashSet<String> setOfPhone = new HashSet<>();
        setOfPhone.add("iPhone X");
        setOfPhone.add("Xiomi R4 Prime");
        setOfPhone.add("Samsung Galaxy A5");
        Iterator iterator = setOfPhone.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("Ukrain", "Kyiv");
        map.put("Israli", "Telaviv/Ierusalim");
        map.put("Spain", "Madrid");


        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
       for(Map.Entry<String, String> entry :  map.entrySet()){
            System.out.print("Contry's "+entry.getKey());
            System.out.println(" capital is "+entry.getValue());
        }
             /*while (iterator1.hasNext()){
            Set<Map.Entry<String, String>> entrySet1 =  iterator1.next();
            System.out.println();*/
        }
    }

