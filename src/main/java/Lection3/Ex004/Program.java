package Lection3.Ex004;

import Lection3.Ex004.ExBeverage.*;

import java.util.Iterator;

public class Program {

    public static void main(String[] args) {

//        List<Integer> nums = new ArrayList<>();
//        nums.add(1);
//        nums.add(12);
//        nums.add(123);
//        nums.add(1234);
//        nums.add(12345);

//        Iterator<Integer> iter = nums.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }

//        Worker worker = new Worker(
//                "Имя", "Фамилия", 23, 4675);
//        Iterator<String> components = worker;
//
//        while (components.hasNext()) {
//            System.out.println(worker.next());
//        }

        Beverage latte = new Coffee();
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Beans("Зерна"));
        latte.addComponent(new Milk("Молоко"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }

}
