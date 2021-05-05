package edu.pingpong.fastbreaktruck.drink;

import edu.pingpong.fastbreaktruck.interfaces.Packing;
import edu.pingpong.fastbreaktruck.interfaces.Product;
import edu.pingpong.fastbreaktruck.packing.Bottle;

public abstract class Drink implements Product {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
