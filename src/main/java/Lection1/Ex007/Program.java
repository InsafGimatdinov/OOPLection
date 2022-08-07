package Lection1.Ex007;

public class Program {

    public static void main(String[] args) {

//        Magician hero1 = new Magician();
//        System.out.println(hero1.getInfo());
//
//        Priest hero2 = new Priest();
//        System.out.println(hero2.getInfo());

        BaseHero hero3 = new Magician();
        System.out.println(hero3.getInfo());

        BaseHero hero4 = new Priest();
        System.out.println(hero4.getInfo());

        hero3.Attack(hero4);
        System.out.println(hero4.getInfo());

        hero4.Attack(hero3);
        System.out.println(hero3.getInfo());

    }

}
