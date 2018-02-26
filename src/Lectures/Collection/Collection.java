package Lectures.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<String> listOfCars = new ArrayList();
        listOfCars.add("Hyndai");
        listOfCars.add("Honda");
        listOfCars.add("Toyota");
        listOfCars.add("Mercedes");

        System.out.println(listOfCars.get(1));
        System.out.println(listOfCars.size());
        System.out.println();
        // first option
        for (int i = 0; i < listOfCars.size() - 1; i++) {
            System.out.println(listOfCars.get(i));
        }
        // second option
        Iterator iterator = listOfCars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // все елементы
        for (String car : listOfCars) {
            System.out.println(car);
        }
        System.out.println("-----------");
        listOfCars.forEach(car->{
            System.out.println(car);
        });

    }
}
