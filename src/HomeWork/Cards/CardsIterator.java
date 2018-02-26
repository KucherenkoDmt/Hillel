package HomeWork.Cards;

import java.util.Iterator;

public class CardsIterator implements Iterator {

    Cards[] cards = new Cards[36];
    int index = 0;
    int r = 0;
    int r2=0;
    String mastTemporary;
    String valuesTemporary;

    public static void main(String[] args) {
        CardsIterator c = new CardsIterator();

        c.createCards();
        //c.printCards();
        c.shuffle();
        c.shuffle();
        c.shuffle();
        //for(Cards i: c.cards){
        //c.next();}
        c.printCards();
    }

    public void shuffle() {
        r = (int) (Math.random() * 36);
        r2 = (int) (Math.random() * 36);
        valuesTemporary = cards[r].value;
        mastTemporary = cards[r].mast;
        cards[r].mast=cards[r2].mast;
        cards[r].value=cards[r2].value;
        cards[r2].value=valuesTemporary;
        cards[r2].mast=mastTemporary;
    }

    public void createCards() {
        String[] masti = {"чирва", "бубна", "пика", "креста"};
        String[] values = {"шесть", "семь", "восемь", "дявять", "десять", "валет", "дама", "кароль", "туз"};
        int i = 0;
        int j = 0;
        int y = 0;
        while (i < 36) {
            cards[i] = new Cards();
            if (i % 4 == 0 && i != 0) {
                j -= 4;
                y++;
            }
            cards[i].mast = masti[j];
            cards[i].value = values[y];
            i++;
            j++;
        }
    }

    public void printCards() {
        for (Cards i : cards)
            System.out.println(i.mast + " " + i.value);
    }

    @Override
    public boolean hasNext() {
        if (index < cards.length) {
            return true;
        }
        return false;
    }

    //проверяет есть ли в колоде карта
    //есле картае есть удаляет
    @Override
    public Object next() {
        while (hasNext()) {
            remove();
            return cards[index++];
        }
        return null;
    }

    @Override
    //удаляет карту
    public void remove() {
        cards[index].mast = null;
        cards[index].value = null;
    }

}
