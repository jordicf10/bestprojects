package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;




public class Cliente {
	
	
	
	String HOST = "localhost";
	int PUERTO= 9876;
	Socket socket;
	
	public Cliente()throws IOException{
		socket=new Socket("localhost",9876);
	}
	
	
	public void iniciarCliente()throws IOException{
		
		String nombre = "";
		int tareas;
		String descripcion;
		String estado;
		
		DataInputStream entradaServidor= new DataInputStream(socket.getInputStream());

		DataOutputStream salidaServidor = new DataOutputStream(socket.getOutputStream());

		
		System.out.println(entradaServidor.readUTF());
		
		salidaServidor.writeUTF("Cliente conectado\n...............................");
		
		entradaServidor.readUTF();
		
		System.out.println(entradaServidor.readUTF());
		
		Scanner entrada= new Scanner(System.in);

		nombre=entrada.next();
		
		salidaServidor.writeUTF(nombre);
		
		System.out.println(entradaServidor.readUTF());
		
		tareas= entrada.nextInt();
		
		String tareasString= String.valueOf(tareas);
		
		salidaServidor.writeUTF(tareasString);
	
			int i=0;
			entrada=new Scanner(System.in);
			do {
				
				i++;
				
				System.out.println(entradaServidor.readUTF());
				descripcion=entrada.next();
				salidaServidor.writeUTF(descripcion);
				
				
				System.out.println(entradaServidor.readUTF());
				estado=entrada.next();
				salidaServidor.writeUTF(estado);
				
				System.out.println(entradaServidor.readUTF());
				
			}
			while(i<tareas);
			
			System.out.println(entradaServidor.readUTF());
			
			System.out.println(entradaServidor.readUTF());

			
			entradaServidor.close();
			salidaServidor.close();
			socket.close();

			System.out.println("Fin de la conexión");
		
		
		}
		
		

		
		
}
		
	
		
	
	
	
	
	
	
	
	


