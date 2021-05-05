package edu.pingpong.fastbreaktruck.packing;

import edu.pingpong.fastbreaktruck.interfaces.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
