import java.io.*;
import java.net.*;

public class ServeurTCP1
{
	public static void main( String[] args ) throws Exception
	{
		ServerSocket socketserver = new ServerSocket(2016);
		while(true)
		{
			System.out.println( "Serveur en attente");
			Socket socket = socketserver.accept();
			System.out.println( "connexion d'un client");
			DataInputStream dIn = new DataInputStream( socket.getInputStream());
			System.out.println( "Message: " + dIn.readUTF());
			socket.close();
//			socketserver.close();
		}
	}
}
