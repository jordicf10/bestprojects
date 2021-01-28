package restauranteejercicio;

public class RestauranteMain {

	public static void main(String[] args) {
		Restaurante plato=new Restaurante(5, 2);

		System.out.println("Con " + plato.getHuevos() + " huevos, que son " + plato.getDocenas() + " docenas y " + plato.getDocenasResto() + " huevos, y " + plato.getChorizo() + " kg de chorizo, que son " + plato.getKgchorizo() + " gramos de chorizo, puedes hacer " + plato.getNumPlatos()+ " platos");

		plato.sirvePlato(2);
		
		System.out.println("---AQUÍ AÑADIMOS DOS PLATOS, POR LO QUE RESTAREMOS 4 HUEVOS Y 400 GRAMOS DE CHORIZO---");

		System.out.println("Con " + plato.getHuevos() + " huevos, que son " + plato.getDocenas() + " docenas y " + plato.getDocenasResto() + " huevos, y " + plato.getChorizo() + " kg de chorizo, que son " + plato.getKgchorizo() + " gramos de chorizo, puedes hacer " + plato.getNumPlatos()+ " platos");

		plato.addHuevos(4);
		
		System.out.println("---AQUÍ AÑADIMOS 4 DOCENAS DE HUEVOS---");

		System.out.println("Con " + plato.getHuevos() + " huevos, que son " + plato.getDocenas() + " docenas y " + plato.getDocenasResto() + " huevos, y " + plato.getChorizo() + " kg de chorizo, que son " + plato.getKgchorizo() + " gramos de chorizo, puedes hacer " + plato.getNumPlatos()+ " platos");

		plato.addChorizos(3);
		
		System.out.println("---AQUÍ AÑADIMOS 3 KG DE CHORIZO---");

		System.out.println("Con " + plato.getHuevos() + " huevos, que son " + plato.getDocenas() + " docenas y " + plato.getDocenasResto() + " huevos, y " + plato.getChorizo() + " kg de chorizo, que son " + plato.getKgchorizo() + " gramos de chorizo, puedes hacer " + plato.getNumPlatos()+ " platos");

		plato.addHuevos(8);
		
		System.out.println("---AQUÍ AÑADIMOS 8 DOCENAS DE HUEVOS---");

		System.out.println("Con " + plato.getHuevos() + " huevos, que son " + plato.getDocenas() + " docenas y " + plato.getDocenasResto() + " huevos, y " + plato.getChorizo() + " kg de chorizo, que son " + plato.getKgchorizo() + " gramos de chorizo, puedes hacer " + plato.getNumPlatos()+ " platos");

		plato.addChorizos(7);
		
		System.out.println("---AQUÍ AÑADIMOS 7 KG DE CHORIZO---");

		System.out.println("Con " + plato.getHuevos() + " huevos, que son " + plato.getDocenas() + " docenas y " + plato.getDocenasResto() + " huevos, y " + plato.getChorizo() + " kg de chorizo, que son " + plato.getKgchorizo() + " gramos de chorizo, puedes hacer " + plato.getNumPlatos()+ " platos");

		plato.sirvePlato(13);
		
		System.out.println("---AQUÍ AÑADIMOS TRECE PLATOS, POR LO QUE RESTAREMOS 26 HUEVOS Y 2600 GRAMOS DE CHORIZO---");

		System.out.println("Con " + plato.getHuevos() + " huevos, que son " + plato.getDocenas() + " docenas y " + plato.getDocenasResto() + " huevos, y " + plato.getChorizo() + " kg de chorizo, que son " + plato.getKgchorizo() + " gramos de chorizo, puedes hacer " + plato.getNumPlatos()+ " platos");

		plato.sirvePlato(2);
		
		System.out.println("---AQUÍ AÑADIMOS DOS PLATOS, POR LO QUE RESTAREMOS 4 HUEVOS Y 400 GRAMOS DE CHORIZO---");

		System.out.println("Con " + plato.getHuevos() + " huevos, que son " + plato.getDocenas() + " docenas y " + plato.getDocenasResto() + " huevos, y " + plato.getChorizo() + " kg de chorizo, que son " + plato.getKgchorizo() + " gramos de chorizo, puedes hacer " + plato.getNumPlatos()+ " platos");

		plato.sirvePlato(1);
		
		System.out.println("---AQUÍ AÑADIMOS UN PLATO, POR LO QUE RESTAREMOS 2 HUEVOS Y 200 GRAMOS DE CHORIZO---");

		System.out.println("Con " + plato.getHuevos() + " huevos, que son " + plato.getDocenas() + " docenas y " + plato.getDocenasResto() + " huevos, y " + plato.getChorizo() + " kg de chorizo, que son " + plato.getKgchorizo() + " gramos de chorizo, puedes hacer " + plato.getNumPlatos()+ " platos");

		
	}

}
