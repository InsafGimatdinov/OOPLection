package Lection2.Ex006.v2;

import Lection2.Ex006.v2.Healers.Healer;
import Lection2.Ex006.v2.Warriors.Warrior;

public class God extends Hero implements Healer, Warrior {

    @Override
    public void healing(Hero target) {

    }

    @Override
    public Warrior attack(Hero target) {

        return null;
    }

}
