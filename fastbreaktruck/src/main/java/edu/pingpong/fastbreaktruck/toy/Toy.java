package edu.pingpong.fastbreaktruck.toy;

import edu.pingpong.fastbreaktruck.interfaces.Product;

import edu.pingpong.fastbreaktruck.packing.Bottle;

import edu.pingpong.fastbreaktruck.interfaces.Packing;

public abstract class Toy implements Product {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
