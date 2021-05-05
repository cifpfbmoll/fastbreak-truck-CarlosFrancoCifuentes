package edu.pingpong.fastbreaktruck.cereals;

import edu.pingpong.fastbreaktruck.interfaces.Packing;
import edu.pingpong.fastbreaktruck.interfaces.Product;
import edu.pingpong.fastbreaktruck.packing.Box;

public abstract class Cereals implements Product {
    @Override
    public Packing packing() {
        return new Box();
    }

    @Override
    public abstract float price();
}
