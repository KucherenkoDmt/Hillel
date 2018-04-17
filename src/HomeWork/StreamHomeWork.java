package HomeWork;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamHomeWork {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(120, 50, 800, 100, 200, 500, 1200, 10, 1500, 2000, 5000, 80);

        prices.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("--------------------------");
        prices.stream()
                .limit(5)
                .forEach(System.out::println);
        System.out.println("--------------------------");

        List<Integer> pricesPlus17 =
                prices.stream()
                        .map((i) -> i + ((17 * i) / 100))
                        .collect(Collectors.toList());
        pricesPlus17.forEach(System.out::println);

        System.out.println("--------------------------");
        prices.stream()
                .map(i -> i / 2)
                .limit(4)
                .forEach(System.out::println);
        System.out.println("--------------------------");

        prices.stream()
                .map(i -> i + "")
                .filter(i -> Integer.parseInt(i) < 500)
                .forEach(System.out::println);
        System.out.println("--------------------------");
        prices.stream()
                .filter(i -> i < 500)
                .map(i -> i * 10)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println("--------------------------");
        prices.stream()
                .map(i -> i / 10)
                .filter(o -> o < 100)
                .forEach(System.out::println);
        System.out.println("--------------------------");

        prices.stream()
                .filter(i -> i > 400)
                .sorted()
                .limit(1)
                .forEach(System.out::println);
        System.out.println("--------------------------");
        System.out.println(
        prices.stream()
                .filter(i -> i > 1200)
                .map(i -> i/5)
                .max(Integer::compareTo)
                .get()
        );
    }
}
