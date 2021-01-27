package client;

import java.io.IOException;


public class MainCliente {
	
	public static void main(String[]args)throws IOException {
		Cliente cliente= new Cliente();
		System.out.println("Iniciando cliente...");
		System.out.println();
		
		cliente.iniciarCliente();

	}
	
	

}
