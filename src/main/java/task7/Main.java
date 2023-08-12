package task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>(3);
        for (int i = 0; i < 11; i++) {
            list.add(random.nextInt(10) + 1);
        }
        System.out.println("Значення списоку:");
        for (int temp : list) System.out.println(temp);
        System.out.println("Квадрати значень списку:");
        list.stream().map(a -> a * a).forEach(System.out::println);
        System.out.println("Сума квадратів списку:");
        int number = list.stream().map(a -> a * a).reduce(Integer::sum).get();
        System.out.println(number);
    }
}