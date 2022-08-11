package Lection3.Ex005;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        Random r = new Random();

//        List<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            numbers.add(r.nextInt(1, 20));
//        }
//        System.out.println(numbers);
//        Collections.sort(numbers);
//        System.out.println(numbers);

        List<Worker> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            db.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18, 31), r.nextInt(10000)));
        }
        System.out.println(db);
        db.sort(new SalaryComporator());
//        Collections.sort(db);
        System.out.println(db);

    }

}
