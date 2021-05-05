package edu.pingpong.fastbreaktruck.breakfast;

import edu.pingpong.fastbreaktruck.cereals.Eyeholes;
import edu.pingpong.fastbreaktruck.cereals.Smiggles;
import edu.pingpong.fastbreaktruck.drink.Fleebjuice;
import edu.pingpong.fastbreaktruck.drink.Turbulentjuice;
import edu.pingpong.fastbreaktruck.toy.Plumbus;

public class BreakfastMaker {

    public static Breakfast prepareEyeholes() {
        Breakfast breakfast = new Breakfast();
        breakfast.addProduct(new Eyeholes());
        breakfast.addProduct(new Turbulentjuice());
        return breakfast;
    }

    public static Breakfast prepareSmiggles() {
        Breakfast breakfast = new Breakfast();
        breakfast.addProduct(new Smiggles());
        breakfast.addProduct(new Fleebjuice());
        return breakfast;
    }

    public static void addToy(Breakfast breakfast){
        breakfast.addProduct(new Plumbus());
    }
}
