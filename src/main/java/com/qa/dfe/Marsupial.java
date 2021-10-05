package com.qa.dfe;

public class Marsupial {

	private String name;
	private String species;
	private String colour;

	public Marsupial(String name, String species, String colour, int id) {
		super();
		this.name = name;
		this.species = species;
		this.colour = colour;
	}

	public Marsupial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Marsupial [name=" + name + ", species=" + species + ", colour=" + colour + "]";
	}

}
