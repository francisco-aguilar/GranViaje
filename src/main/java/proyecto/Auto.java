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
		this.aumentarTemperatura(0.04 * velocidad);
		velocidad = 0;
	}
	
	public void acelerar(int aceleracion) {
		velocidad += aceleracion;
		this.aumentarTemperatura(0.02 * aceleracion);
	}
	
	public void encender() {
		encendido = true;
		this.aumentarTemperatura(70);
		this.consumirCombustible(0.001 * combustible);
	}
	
	public void apagar() {
		encendido = false;
		temperatura = 0;
	}
	
	public void aumentarTemperatura(double aumento) {
		temperatura += aumento;
	}

	
	public void consumirCombustible(double consumo) {
		combustible -= consumo;
	}
	
	public double porcentajeCombustibleActual() {
		return combustible * 100 / capacidadCombustible;
	}
	
	/*
	public boolean estaEnReserva() {
		return this.porcentajeCombustibleActual() < 10;
	}
	
	public boolean estaProximoAReserva() {
		return this.porcentajeCombustibleActual() < 15;
	}
	*/
	
	public boolean estaCaliente() {
		return temperatura >= 95;
	}
	
	public void recorrer(int distancia) {
		consumirCombustible(distancia * 133);
	}
	
}
