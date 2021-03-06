package dispositivoselectrodomesticos;


class DispositivoElectrodomestico {

       protected boolean cargador;
       protected int tamaņoPantalla;
       protected float altura;
       protected float ancho;
       protected String marca;
       protected int camara;
       protected boolean desconectarCarga;
       public boolean isDesconectarCarga() {
		return desconectarCarga;
	}






	@Override
	public String toString() {
		return "DispositivoElectrodomestico [cargador=" + cargador + ", tamaņoPantalla=" + tamaņoPantalla + ", altura="
				+ altura + ", ancho=" + ancho + ", marca=" + marca + ", camara=" + camara + ", desconectarCarga="
				+ desconectarCarga + "]";
	}






	public void setDesconectarCarga(boolean desconectarCarga) {
		this.desconectarCarga = desconectarCarga;
	}






	private  static int  cantidadDispositivo;

       public DispositivoElectrodomestico(){
    	   cargador=true;
    	   tamaņoPantalla=0;
    	   altura=0;
    	   ancho=0;
    	   marca="indefinida";
    	   camara=0;
        }
    	




		
		public DispositivoElectrodomestico(boolean cargador,int tamaņoPantalla,float altura,float ancho, String marca, int camara){
	 		this.cargador= cargador;
	 		this.tamaņoPantalla=tamaņoPantalla;
	 		this.altura=altura;
	 		this.ancho=ancho;
	 		this.marca=marca;
	 		this.camara=camara;
	 		 DispositivoElectrodomestico.cantidadDispositivo++;
	 	}
		
		public DispositivoElectrodomestico(DispositivoElectrodomestico dispositivoelectrodomestico){
			this.cargador=dispositivoelectrodomestico.cargador;
			this.tamaņoPantalla =dispositivoelectrodomestico.tamaņoPantalla;
			this.altura =dispositivoelectrodomestico.altura;
			this.ancho =dispositivoelectrodomestico.ancho;
			this.marca=dispositivoelectrodomestico.marca;

		}






		public int getTamaņoPantalla() {
			return tamaņoPantalla;
		}






		public void setTamaņoPantalla(int tamaņoPantalla) {
			this.tamaņoPantalla = tamaņoPantalla;
		}






		public int getCamara() {
			return camara;
		}






		public void setCamara(int camara) {
			this.camara = camara;
		}






		public static int getCantidadDispositivo() {
			return cantidadDispositivo;
		}






		public static void setCantidadDispositivo(int cantidadDispositivo) {
			DispositivoElectrodomestico.cantidadDispositivo = cantidadDispositivo++;
		}
		
		
	



}


