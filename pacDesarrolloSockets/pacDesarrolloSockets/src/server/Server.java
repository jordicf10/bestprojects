package server;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;




public class Server {
	
	String HOST = "localhost";
	int PUERTO= 9876;
	ServerSocket serverSocket;
	Socket socket;
	
	public Server()throws IOException{
		serverSocket=new ServerSocket(PUERTO);
		System.out.println("Servidor ON");
		
	}
	
	
	public void arrancarServer()throws IOException{
		
		String nombre;
		String tareas;
		String descripcion = null;
		String estado = null;
		
		socket=serverSocket.accept();  
		
		DataInputStream entradaServidor= new DataInputStream(socket.getInputStream());
		
		
		DataOutputStream salidaServidor=new DataOutputStream(socket.getOutputStream());
		
		
		
		salidaServidor.writeUTF("Esperando la conexión del cliente\n................");
		
		System.out.println(entradaServidor.readUTF());
		
		salidaServidor.writeUTF("Petición recibida");
		
		salidaServidor.writeUTF("Introduce tu nombre");
			
		System.out.println("Nombre del cliente: " + entradaServidor.readUTF());
	
		salidaServidor.writeUTF("Introduce el número de tareas a realizar");
			
		tareas=entradaServidor.readUTF();
		int tareasint=Integer.parseInt(tareas);
		
		System.out.println("Número de tareas a realizar: " + tareasint);
	
		ArrayList<Tarea>todaslasTareas=new ArrayList<Tarea>();

			for(int i=0;i<tareasint;i++) {
				
			
			
			Tarea nuevatarea= new Tarea(descripcion, estado);

			salidaServidor.writeUTF("Indica la descripción de la tarea");
	
			descripcion=entradaServidor.readUTF();
			
			nuevatarea.setdescripcion(descripcion);

			salidaServidor.writeUTF("Indica el estado de la tarea");
			
			estado=entradaServidor.readUTF();
			
			nuevatarea.setestado(estado);
				
			System.out.println("Tarea " + (i+1) + " creada");
			
			salidaServidor.writeUTF("Tarea " + (i+1) + " creada");

			todaslasTareas.add(nuevatarea);
			}
			
			
			
			salidaServidor.writeUTF("A continuación se le van a mandar el conjunto de tareas, "
					+ "con su descripción y el estado de las mismas");

			
			salidaServidor.writeUTF(todaslasTareas.toString());

			entradaServidor.close();
			salidaServidor.close();
			socket.close();
			finalizarServer();

			
			System.out.println("Fin de la conexión");
			
		}
		
	public void finalizarServer()throws IOException{
		serverSocket.close();
			
	}
	
}
			
		
			

		
