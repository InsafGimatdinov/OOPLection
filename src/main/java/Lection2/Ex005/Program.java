package Lection2.Ex005;

public class Program {

    public static void main(String[] args) {
        // Иерархия вызова конструкторов
        System.out.println("\nDwarf dw1 = new Dwarf()");
        Dwarf dw1 = new Dwarf();
        System.out.println(dw1);

        System.out.println("\nDruid dw2 = new Dwarf()");
        Druid dw2 = new Dwarf();
        System.out.println(dw2);

        System.out.println("\nBaseHero dw3 = new Dwarf()");
        Druid dw3 = new Dwarf();
        System.out.println(dw3);
    }

}
