package com.qriosity.day14.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author Queue-ri
 */
public class FinanceCrawlingTest1 {
    public static void main(String[] args) throws Exception {
        Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();

        // 찾아볼 태그, 태그.클래스명, 태그#아이디명, 클래스명, 아이디명
        // <img src="a.png"> src는 속성
        Elements list1 = doc.select("span.code");
        System.out.println(list1.size());
        System.out.println(list1);
        Element e1 = list1.get(0);
        String code = e1.text();

        Elements list2 = doc.select("span.tx");
        System.out.println(list2);
        //여러 개 텍스트 출력
        for (int i = 0; i < list2.size(); ++i) {
            Element e = list2.get(i);
            System.out.println(e.text());
        }

        //Elements list3 = doc2.select("div.today");
        //<div class="today">
        // <p class="no_today"><em class="no_down"> <span class="blind">59,400</span> <span class="no5">5</span><span class="no9">9</span><span class="shim">,</span><span class="no4">4</span><span class="no0">0</span><span class="no0">0</span> </em></p>
        // <p class="no_exday"><span class="sptxt sp_txt1">전일대비</span> <em class="no_down"> <span class="ico down">하락</span> <span class="blind">300</span> <span class="no3">3</span><span class="no0">0</span><span class="no0">0</span> </em> <span class="bar">l</span> <em class="no_down"> <span class="ico minus">-</span> <span class="blind">0.50</span> <span class="no0">0</span><span class="jum">.</span><span class="no5">5</span><span class="no0">0</span> <span class="per">%</span> </em></p>
        //</div>
        Elements list3 = doc.select("div.today span.blind");
        //<span class="blind">59,400</span>
        //<span class="blind">300</span>
        //<span class="blind">0.50</span>
        System.out.println(list3.get(0).text());
        //System.out.println(list3);

        Elements list4 = doc.select("td.first");
        System.out.println(list4);


        Elements list5 = doc.select("span.blind");
        System.out.println(list5);
        System.out.println(list5.size());

        for (int i = 0; i < list5.size(); i++) {
            System.out.println(i + ": " + list5.get(i));
        }

        //14: <span class="blind">59,500</span>
        //15: <span class="blind">200</span>
        //16: <span class="blind">0.34</span>
        //17: <span class="blind">59,700</span>
        //18: <span class="blind">60,100</span>
        //19: <span class="blind">77,600</span>
        //20: <span class="blind">7,806,752</span>
        //21: <span class="blind">59,900</span>
        //22: <span class="blind">59,300</span>
        //23: <span class="blind">465,481</span>
        //여러 목록을 프린트해서 화면과 비교하면서 몇 번 인덱스에 있는지 확인하고
        //추출한다.

        //고가 high에 넣기
        String high = list5.get(18).text();
        //현재가 today에 넣기
        String today = list5.get(14).text();
        //전일 yesterday에 넣기
        String yesterday = list5.get(17).text();
        //다음과 같이 프린트해보자.
        //회사명 : 삼성전자
        System.out.println("회사명 : " + "삼성전자") ;
        //코드 :
        System.out.println("코드 : " + code);
        //고가 :
        System.out.println("고가 : " + today);
        //현재가 :
        System.out.println("현재가 : " + high);
        //전일가 :
        System.out.println("전일가 : " + yesterday);

        //회사명 : 삼성전자
        //코드 : 005930
        //고가 : 59,300
        //현재가 : 60,100
        //전일가 : 59,700
    }
}
