package Lection3.Ex003;

import Lection3.Ex003.ExBeverage.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

        Iterator<Ingredient> iterator = latte;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
