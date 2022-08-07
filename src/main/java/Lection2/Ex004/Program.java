package Lection2.Ex004;

import Lection2.Ex002.BaseHero;
import Lection2.Ex004.Aliance.Dwarf;
import Lection2.Ex004.Aliance.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {

    public static void main(String[] args) {

        // Герой - герой ли?

//        int teamCount = 10;
//        Random rand = new Random();
//
//        List<BaseHero> teams = new ArrayList<>();
//        for (int i = 0; i < teamCount; i++) {
//            int val = rand.nextInt(4);
//            switch (val) {
//                case 0:
//                    teams.add(new Priest());
//                    break;
//                case 1:
//                    teams.add(new Magician());
//                    break;
//                case 2:
//                    teams.add(new Human());
//                    break;
//                default:
//                    break;
//            }
//            System.out.println(teams.get(i).getInfo());
//        }
//        System.out.println();
//
//        Magician magician = new Magician();
//        System.out.println(magician);
//        Priest priest = new Priest();
//        System.out.println(priest);
//        Druid druid = new Druid();
//        System.out.println(druid);

        Priest priest = new Priest();
        System.out.println(priest.getInfo());
        Druid druid = new Druid();
        System.out.println(druid.getInfo());
        Magician magician = new Magician();
        System.out.println(magician.getInfo());

        priest.Attack(magician);
        System.out.println(magician.getInfo());
        priest.Attack(magician);
        System.out.println(magician.getInfo());
//        druid.healing(magician);
//        System.out.println(magician);
//        druid.healing(magician);
//        System.out.println(magician);
//        druid.healing(magician);
//        System.out.println(magician);
//        druid.healing(magician);
//        System.out.println(magician);

//        BaseHero dh = new Druid();
//        /* BaseHero*/
//        Dwarf dwarf = new Dwarf();
//        dwarf.dwarf_method();
//        ((Dwarf)(dwarf).dwarf_method());
//        System.out.println(dwarf.name);

    }

}
