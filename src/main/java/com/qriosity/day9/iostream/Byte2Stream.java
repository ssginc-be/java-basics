package com.qriosity.day9.iostream;

import java.io.*;

/**
 * @author Queue-ri
 */
public class Byte2Stream {
    //글자를 써서, 파일에 저장하고 싶습니다.!
    //FileWriter
    //글자를 써서, 네트워크로 전송해야한다.!!
    //네트워크 전송은 1바이트단위로 전송할 예정!
    //글자를 써서 바이트배열로 변환 후,
    //--> 바이트배열을 바이트스트림으로 저장!
    public static void main(String[] args) {
        //파일에 쓰기(String --> byte변환 저장)
        // 파일 내용이 아래 코드처럼 적으면 차이가 적어서 기대한 결과가 안나옴
        // 텍스트를 많이 저장해야 유의미한 차이가 발생함
//        try {
//            OutputStream os = new FileOutputStream("c:/data/java-basics-day9.txt");
//            Writer writer = new OutputStreamWriter(os, "UTF-8");
//            writer.write("안녕!!!");
//            writer.flush();
//            writer.close();
//            os.close();
//        } catch (Exception e) {
//            e.printStackTrace();//자세히 에러정보를 프린트!
//        }

        //파일 읽어오기(byte단위 전송됨.)
        //surround-with 코드 완성(컨트롤+알트+T)
        try {
            InputStream is = new FileInputStream("c:/data/java-basics-day9.txt");
            Reader reader = new InputStreamReader(is);
            long start = System.nanoTime();
            char[] data = new char[10];
            while (true) {
                int num = reader.read(data);
                if(num == -1) break;
                String str = new String(data, 0, num);
                System.out.println(str);
            }
            long end = System.nanoTime();
            System.out.println(end-start);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
