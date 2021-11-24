package zooAnimales;

import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona = null;
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	public Animal() {
		this(null, 0, null, null);
		totalAnimales++;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Zona getZona() {
		return zona;
	}
	
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	public int getTotalAnimales() {
		return totalAnimales;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		
		return "Mamiferos: " + "\n" + "Aves: " + "\n" + "Reptiles: " + "\n" + "Peces: " +
				"\n" + "Anfibios: ";
	}
	
	public String toString() {
		if(zona == null) {
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + 
					", habito en " + habitat + " y mi genero es " + genero;
		}
		
		return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " 
		+ habitat + " y mi genero es " + genero + ", la zona en la que me ubico es" + 
		zona.getNombre() + ", en el " + zona.getZoo();
	}
}
