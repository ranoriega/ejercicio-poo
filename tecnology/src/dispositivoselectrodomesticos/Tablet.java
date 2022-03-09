package dispositivoselectrodomesticos;

public class Tablet  extends DispositivoElectrodomestico  implements Conectar{

private boolean pantallaTactil;

	
	public Tablet(){  
		pantallaTactil= true;
     }
 	
		public Tablet(boolean pantallaTactil){
	 		this.pantallaTactil= pantallaTactil;
	 	
	 	}
		
		public Tablet(Tablet tablet){
			this.pantallaTactil=tablet.pantallaTactil;
			

		}

	public void cargar(int j) {
		
	}

	public void desconectarCarga() {
		
	}

	public void navegar() {
		
	}

	public void prender() {
		System.out.println("tablent encendida");
	}

	public void apagar() {
		System.out.println("tablet apagada");
	}

	public boolean isPantallaTactil() {
		return pantallaTactil;
	}

	public void setPantallaTactil(boolean pantallaTactil) {
		this.pantallaTactil = pantallaTactil;
	}

	
	
	@Override
	public String toString() {
		return "Tablet [pantallaTactil=" + pantallaTactil + "]";
	}

	@Override
	public void conectarRedwifi(String wifi) {
		System.out.println(" conectando a la red " + wifi);
	}

	@Override
	public void redwifiActual() {
		System.out.println("estas conectado la red del vecino");
		
	}

	


}
