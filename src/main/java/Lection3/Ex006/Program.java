package Lection3.Ex006;

public class Program {

    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Water("Вода"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }

}
