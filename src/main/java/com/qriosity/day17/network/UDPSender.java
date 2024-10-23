package com.qriosity.day17.network;

import java.io.IOException;
import java.net.*;

/**
 * @author Queue-ri
 */
public class UDPSender {
    public static void main(String[] args) throws IOException {
        //보내는 전화기역할 부품 --> DatagramSocket
        DatagramSocket socket = new DatagramSocket();
        //주소: ip(InetAddress) + port(int)
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        //데이터: String --> byte[]
        byte[] data = "안뇽".getBytes();
        //패킷 --> DatagramPacket(데이터, 주소)
        DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7100);
        //소켓으로 패킷을 보내자.
        socket.send(packet);
        //소켓 자원해제.
        socket.close();
    }
}
