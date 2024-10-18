package com.qriosity.day14.jsoup;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * @author Queue-ri
 */
public class CrawlingTest {
    public static void main(String[] args) throws Exception {
        // Connection: 스트림 객체
        Connection con = Jsoup.connect("https://www.naver.com");
        Document doc = con.get();
        // '체인식 코드'로 작성하면 하단과 같음
        // Document doc = Jsoup.connect("https://www.naver.com/").get();
        // System.out.println(doc); // 코드를 String으로 만들어줌

        // Elements: ArrayList를 상속받음
        Elements list = doc.select("span.blind");
        System.out.println(list.size());
        System.out.println(list); // toString이 오버라이딩되어있어서 출력 가능

        Element e1 = list.get(0);
        String e1Str = e1.text();
        System.out.println(e1Str);
    }
}
