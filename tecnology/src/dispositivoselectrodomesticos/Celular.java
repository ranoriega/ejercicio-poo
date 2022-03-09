package dispositivoselectrodomesticos;



// TODO: Auto-generated Javadoc
/**
 * The Class Celular.
 */
public class Celular  extends DispositivoElectrodomestico  implements Conectar {

	/** The pantalla tactil. */
	private boolean pantallaTactil;

	
	/**
	 * Instantiates a new celular.
	 */
	public Celular(){
 	  
		pantallaTactil= true;
     }
 	




		
		/**
		 * Instantiates a new celular.
		 *
		 * @param pantallaTactil the pantalla tactil
		 */
		public Celular(boolean pantallaTactil){
	 		this.pantallaTactil= pantallaTactil;
	 	
	 	}
		
		/**
		 * Instantiates a new celular.
		 *
		 * @param celular the celular
		 */
		public Celular(Celular celular){
			this.pantallaTactil=celular.pantallaTactil;
			

		}
	
	
		
	

	/**
	 * Cargar.
	 */
	public void cargar() {
		System.out.println("cargando");
	}

	/**
	 * Desconectar carga.
	 */
	public void desconectarCarga() {
   System.out.println("carga desconectada");		
	}

	/**
	 * Navegar.
	 * 
	 */
	public void navegar() {
		
		this.conectarRedwifi(null);
		System.out.println("comenzando a navegar por internet");
	}
	

	/**
	 * Prender.
	 */
	public void prender() {
		System.out.println("celular  encendido");
	}

	/**
	 * Apagar.
	 */
	public void apagar() {
		System.out.println("celular  apagado");
	}

	/**
	 * Checks if is pantalla tactil.
	 *
	 * @return true, if is pantalla tactil
	 */
	public boolean isPantallaTactil() {
		return pantallaTactil;
	}

	/**
	 * Sets the pantalla tactil.
	 *
	 * @param pantallaTactil the new pantalla tactil
	 */
	public void setPantallaTactil(boolean pantallaTactil) {
		this.pantallaTactil = pantallaTactil;
	}

	/**
	 * Conectar redwifi.
	 *
	 * @param wifi 
	 * 
	 */
	@Override
	public void conectarRedwifi(String wifi) {
		System.out.println(" conectando a la red " + wifi);
		
	}

	/**
	 * Redwifi actual.
	 *
	 * @return the string
	 */
	@Override
	public void redwifiActual() {
		// TODO Auto-generated method stub
		System.out.println("estas conectado la red del vecino");
		
	}

	


}
