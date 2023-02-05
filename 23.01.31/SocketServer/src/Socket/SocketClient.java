package Socket;

import java.net.Socket;

public class SocketClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socket = new Socket("192.168.0.36", 1234);
			System.out.println("socket 서버에 접속완료!");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
