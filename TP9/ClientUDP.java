import java.io.*;
import java.net.*;

public class ClientUDP
{
	public static void main( String[] args ) throws Exception
	{
		String s="Hello";
		byte [] data = s.getBytes ( ) ;
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println( "adresse=" +addr.getHostName() );
		DatagramPacket packet  = new DatagramPacket( data, data.length, addr, 1234 );
		DatagramSocket sock = new DatagramSocket();
		sock.send(packet);

		System.out.println( "attente retour serveur");
		sock.receive(packet);

		String str = new String (packet.getData() );
		System.out.println( "retoru serveur=" + str );

		sock.close();
	}
}


