package Socket;

import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static void main(String[] args) {
		try {
			int socketPost = 1234;
			ServerSocket socket = new ServerSocket(socketPost); //서버 소켓에다가 포트주소 넣어줌 
			Socket socketUser = null;
			System.out.println("socket: " + socketPost + "으로 서버가 열렸습니다."); //포트가 열렸다
			
				while(true){
					socketUser = socket.accept(); //소켓을 부를 때 유저에다 저장
					System.out.println("Client가 접속함: " + socketUser.getInetAddress());
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
