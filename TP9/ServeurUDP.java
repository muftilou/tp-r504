import java . io . * ;
import java . net . 

public class MonProg
{
	public static void main( String[] args )
	{
		DatagramSocket sock = new DatagramSocket (1234);
		while (true)
		{
			System.out.println( "-Wainting data" );
			DatagramPacket packet = new DatagramPacket (new byte[1024], 1024);
			sock.receive(packet);
			String str = new 
		}
	}
}

