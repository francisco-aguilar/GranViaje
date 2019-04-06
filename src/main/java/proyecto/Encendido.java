package proyecto;

public class Encendido implements Estado{
	@Override
	public void encender(Auto unAuto) {
		throw new YaEncendidoException("El auto ya se encuentra encendido");
	}
	
	@Override
	public void apagar(Auto unAuto) {
		
	}
	
	@Override
	public void acelerar(Auto unAuto, int aceleracion) {
		
	}
	
	@Override
	public void detener(Auto unAuto) {
		
	}
}
