package edu.jalc.everydaythings.bottle;

import edu.jalc.everydaythings.liquid.Liquid;

abstract public class Bottle {

	private double capacity;
	private Liquid liquid;

	private Bottle(){
		this.capacity = 0;
	}

	public Bottle(double capacity, Liquid liquid){

		this.capacity = capacity;
		this.liquid = liquid;
	}

	public double getCapacity(){
		return this.capacity;
	}


	protected Liquid getLiquid(){
		return this.liquid;
	}

	public String toString(){
		return this.getCapacity() + "oz " + this.getLiquid();
	}
}
