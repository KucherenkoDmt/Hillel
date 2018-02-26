package HomeWork.Cards;

import java.util.ArrayList;
import java.util.Iterator;

public class CardsIterator2 {
    public static void main(String[] args) {
        ArrayList<Cards2> cards2 = new ArrayList<Cards2>();
        cards2.add(new Cards2("6","bubna"));
        cards2.add(new Cards2("6","chirva"));
        cards2.add(new Cards2("6","pika"));
        cards2.add(new Cards2("6","krest"));


        System.out.println(cards2.size());

        Iterator<Cards2> i = cards2.iterator();
        while (i.hasNext()){
            Cards2 c = i.next();
            System.out.println(c.getRank());
            System.out.println(c.getSuite());
        }
    }
}
