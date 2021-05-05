package edu.pingpong.fastbreaktruck;

import edu.pingpong.fastbreaktruck.breakfast.Breakfast;
import edu.pingpong.fastbreaktruck.breakfast.BreakfastMaker;

public class App {

	public static void main(String[] args) {

		/**
		 * Desayuno Eyeholes
		 */

		Breakfast eyeDes = BreakfastMaker.prepareEyeholes();
		System.out.println("\nNo abras la caja de Eyeholes!");
		eyeDes.showProduct();
		System.out.print("Precio pedido: " + eyeDes.getCost());

		/**
		 * Desayuno Smiggles
		 */

		Breakfast smigDes = BreakfastMaker.prepareSmiggles();
		System.out.println("\nSmiggles per als nins!");
		smigDes.showProduct();
		System.out.print("Precio pedido: " + smigDes.getCost());

		/**
		 * Plumbus
		 */

		eyeDes = BreakfastMaker.prepareEyeholes();
		BreakfastMaker.addToy(eyeDes);
		System.out.println("\nEyeholes con plumbus!");
		eyeDes.showProduct();
		System.out.print("Precio pedido: " + eyeDes.getCost());
	}
}