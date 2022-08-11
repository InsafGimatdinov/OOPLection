package Lection3.Ex004.ExBeverage;

import java.util.Iterator;

public class Coffee extends Beverage {

    @Override
    public Iterator<Ingredient> iterator() {
        Iterator<Ingredient> it = new Iterator<Ingredient>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Ingredient next() {
                return components.get(index);
            }
        };
        return it;
    }
}
