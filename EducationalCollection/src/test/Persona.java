package test;

public class Persona {
	
	private static int population = 0;
	private String name, surname;
	
	public Persona(String name, String surname) {
		this.name = name;
		this.surname = surname;
		Persona.population++;
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", surname=" + surname + "]";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public static int getPopulation() {
		return population;
	}

	public static int printPopulation() {
		System.out.println("Total population: " + Persona.getPopulation());
		return Persona.getPopulation();
	}
	
	public static void main(String[] args) {
		Persona p1 = new Persona("Antonio","Pagnotta");
		Persona p2 = new Persona("Armando","Pagnotta");
		Persona p3 = new Persona("Sofia","Pagnotta");
		Persona p4 = new Persona("Giampiero","Pagnotta");
		
		printPopulation();
		
		p4 = null;
		
		printPopulation();
		
		System.out.println(p4);
	}
}
