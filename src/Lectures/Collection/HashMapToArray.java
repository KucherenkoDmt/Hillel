package Lectures.Collection;

import java.util.*;
import java.util.Collection;

public class HashMapToArray {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        HashMapToArray hashMapToArray = new HashMapToArray();
        System.out.println(hashMapToArray.mapToList(map));
    }

    public List <String> mapToList(Map<String,String> a){

        List<String> list = new ArrayList<>();
        for (Map.Entry<String,String> entry : a.entrySet()){
            list.add(entry.getKey()+"="+entry.getValue());
        }
        return list;
        }
}