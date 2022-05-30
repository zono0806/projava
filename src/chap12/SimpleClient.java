package chap12;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class SimpleClient {
	public static void main(String[] args) throws IOException {
		var soc = new Socket("localhost", 1700);
		OutputStream output = soc.getOutputStream();
		output.write('a');
		output.close();
		soc.close();
	}
}
