package dispositivoselectrodomesticos;

public class Pc  extends DispositivoElectrodomestico implements Conectar {

	private boolean teclados;
	
	public Pc(){  
		teclados= true;
     }
 	
		public Pc(boolean teclados){
	 		this.teclados= teclados;
	 	
	 	}
		
		public Pc(Pc pc){
			this.teclados=pc.teclados;
			

		}

	public boolean isTeclados() {
		return teclados;
	}

	public void setTeclados(boolean teclados) {
		this.teclados = teclados;
	}

	public void cargar() {
		System.out.println(" cargador conectado");
	}

	public void desconectarCarga() {
		System.out.println(" cargador  desconectado");
	}

	public void navegar() {
		
	}

	public void prender() {
		System.out.println(" pc  encendida");
	}

	public void apagar() {
		System.out.println(" pc  apagada");
	}

	@Override
	public void conectarRedwifi(String wifi) {
		// TODO Auto-generated method stub
		System.out.println(" conectando a la red " + wifi);
	}

	@Override
	public void redwifiActual() {
		// TODO Auto-generated method stub
		System.out.println("estas conectado la red del vecino");
		
	}

	


}
