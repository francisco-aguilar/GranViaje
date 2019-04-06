package proyecto;

public class Auto {
	int capacidadCombustible;
	boolean encendido;
	double temperatura;
	int velocidad;
	int combustible = capacidadCombustible;
	Estado estado;
	
	public Auto(int capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}
	
	public void encender() {
		estado.encender(this);
	}
	
	public void apagar() {
		estado.apagar(this);
	}
	
	public void acelerar(int aceleracion) {
		estado.acelerar(this, aceleracion);
	}
	
	public void detener() {
		estado.detener(this);
	}
	
	public int getCombustible() {
		return combustible;
	}
	
	public double getTemperatura() {
		return temperatura;
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
