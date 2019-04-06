package proyecto;

public interface Estado {
	public void encender(Auto unAuto) {
		//unAuto.setEstado(this);
	};
	public void apagar(Auto unAuto);
	public void acelerar(Auto unAuto, int aceleracion);
	public void detener(Auto unAuto);
	////public void setEstado(this)
}
