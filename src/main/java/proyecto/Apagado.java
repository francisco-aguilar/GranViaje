package proyecto;

public class Apagado implements Estado{
	@Override
	public void encender(Auto unAuto) {
		unAuto.aumentarTemperatura(70);
		unAuto.consumirCombustible(0.001 * unAuto.getCombustible());
		//super.setEstado()
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
