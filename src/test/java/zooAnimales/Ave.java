package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private ArrayList<Ave> listado = null;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, 
			String colorPlumas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public Ave() {
		this(null, 0, null, null, null);
		listado.add(this);
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public ArrayList<Ave> getListado(){
		return listado;
	}
	
	public void setListado(ArrayList<Ave> listado) {
		this.listado = listado;
	}
	
	public int cantidadAves() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public void crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		listado.add(halcon);
		halcones++;
	}
	
	public void crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		listado.add(aguila);
		aguilas++;
	}
}