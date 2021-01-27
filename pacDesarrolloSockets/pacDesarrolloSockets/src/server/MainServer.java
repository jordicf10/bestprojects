package server;

import java.io.IOException;

public class MainServer {

	public static void main(String[] args) throws IOException {
		
		Server serv=new Server();
		System.out.println("Iniciando servidor...");
		System.out.println();
		
		serv.arrancarServer();
		
		serv.finalizarServer();

	}

}
