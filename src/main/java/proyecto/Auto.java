package proyecto;

public class Auto {
	int capacidadCombustible;
	boolean encendido;
	double temperatura;
	int velocidad;
	int combustible = capacidadCombustible;
	
	public Auto(int capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}
	
	public double getTemperatura() {
		return temperatura;
	}
	
	public void detener() {
		velocidad = 0;
	}
	
	public void encender() {
		encendido = true;
		this.aumentarTemperatura(70);
	}
	
	public void apagar() {
		encendido = false;
		temperatura = 0;
	}
	
	public void aumentarTemperatura(double aumento) {
		temperatura += aumento;
	}
	
	public void consumirCombustible(double consumo) {
		combustible -= consumo * combustible;
	}
	
	public double porcentajeCombustibleActual() {
		return combustible * 100 / capacidadCombustible;
	}
	
	
	
}
