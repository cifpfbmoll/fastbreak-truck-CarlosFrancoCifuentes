package edu.pingpong.fastbreaktruck.packing;

import edu.pingpong.fastbreaktruck.interfaces.Packing;

public class Box implements Packing {
    @Override
    public String pack() {
        return "Box";
    }
}
