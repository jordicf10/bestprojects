package restauranteejercicio;



public class Restaurante {
	
	//private int docenas; LA BONA ANTERIOR
	private int huevos;
	private double chorizo;
	private int huevosdisponibles;
	private double chorizodisponible;
	
	public Restaurante(int docenas,double chorizo) {
		this.huevos=docenas*12;
		this.chorizo=chorizo*1000;
		
	}
	
	public int getHuevos() {
		return huevos;
	}
	
	public void setHuevos(int huevos) {
		this.huevos=huevos;
	}
	
	public int getDocenas() {
		return huevos/12;
	}
	
	public int getDocenasResto() {
		return huevos%12;
	}
	
	
	
	public double getChorizo() {
		return chorizo/1000;
	}
	
	public void setKgchorizo(double kgchorizo) {
		this.chorizo=kgchorizo;
	}
	
	public double getKgchorizo() {
		return chorizo;
	}


	public int addHuevos(int huevos) {
		//return this.huevos+=huevos;
		return this.huevos+=huevos*12;
	}
	
	public double addChorizos(double chorizo){
		
		//return this.chorizo+=chorizo;
		return this.chorizo+=chorizo*1000;
	}
	
	void sirvePlato(int plato) {
		
		/*this.huevosdisponibles= getHuevos()-(plato*2);
		this.chorizodisponible= getChorizo()-(plato*200);*/
		
		//int platosdisponibles= 0;
		
		//TREBALLAR SOBRE AQUEST QUE ÉS EL BO
		
		
		/*huevosdisponibles=((getHuevos()-(plato*2))/12);
		this.kgchorizo= (getChorizo()-(plato*200))/1000;  //AQUEST ÉS CORRECTE!!!*/
		
		//TREBALLAR SOBRE AQUEST DE DALT QUE ÉS EL BO
		
		// AQUESTA ÉS LA NOVA
		
		huevos=huevos-(plato*2);
		chorizo=chorizo-(plato*200);
		//chorizo=kgchorizo-(plato*200);
		
		
		// AQUESTA ÉS LA NOVA
		
		/*int docenas=this.docenas*12;
		docenas- ((int)getChorizo()-(plato*200));
		chorizodisponible= (getChorizo()-(plato*200));*/
		/*platosdisponibles= huevosdisponibles;
		platosdisponibles= (int) chorizodisponible;*/
		
	}
	
	

	public int getNumPlatos() {
		
		int platosdisponibles= 0;
		huevosdisponibles= getHuevos()/2;
		chorizodisponible= getKgchorizo()/200;
		//int platosdisponibles= (int) (huevosdisponibles + chorizodisponible);
		if(huevosdisponibles>=1 && chorizodisponible>=1) {		

			if(huevosdisponibles<chorizodisponible) {
			platosdisponibles= huevosdisponibles;
			return platosdisponibles;
			}

			else if(huevosdisponibles>chorizodisponible) {
					platosdisponibles=(int) chorizodisponible;
					return platosdisponibles;
				}
				
			
			
		}
		return platosdisponibles;
	}
		

	
	
}

