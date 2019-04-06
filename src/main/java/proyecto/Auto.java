package proyecto;

public class Auto {
	int combustible;
	boolean encendido;
	double temperatura;
	
	public Auto(int combustible) {
		this.combustible = combustible;
	}
	
	public void encender() {
		encendido = true;
	}
	
	public void apagar() {
		encendido = false;
		temperatura = 0;
	}
	
	
	
}
