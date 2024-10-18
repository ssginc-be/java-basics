package com.qriosity.day14.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Queue-ri
 */

public class SSGCrawlingTest {
    public static void main(String[] args) throws Exception {
        SSGCrawler crawler = new SSGCrawler();
        List<CrawlData> dataList = crawler.crawl();
        ExcelUtil.saveCrawlDataToExcel(dataList);

        for (int i = 0; i < dataList.size(); ++i) {
            ImageUtil.downloadImage(dataList.get(i).getImageUrl(), "c:/data/img",i + ".jpg");
        }
    }
}

class SSGCrawler {
    public List<CrawlData> crawl() throws Exception {
        Document doc = Jsoup.connect("https://www.ssg.com/").get();
        //Elements list = doc.select("div.ssgitem_thmb > a");
        Elements titles = doc.select("div.ssgitem_tit");
        Elements brands = doc.select("div.ssgitem_tit > em");
        Elements prices = doc.select("div.ssgitem_pricewrap > div > em");
        Elements images = doc.select("div.ssgitem_thmb_imgbox > img");

        final int ITEM_SIZE = titles.size();
        // 텍스트 저장
        String[] titleList = new String[ITEM_SIZE];
        String[] brandList = new String[ITEM_SIZE];
        String[] priceList = new String[ITEM_SIZE];
        String[] imageList = new String[ITEM_SIZE];

        int brandIdx = 0;
        List<CrawlData> dataList = new ArrayList<CrawlData>();
        for (int i = 0; i < ITEM_SIZE; i++) {
            String titleText = titles.get(i).text();
            String brandText = brands.get(brandIdx).text();
            if (titleText.startsWith(brandText)) {
                brandList[i] = brandText;
                titleList[i] = titleText.substring(brandText.length()).stripLeading(); // lstrip
                ++brandIdx;
            }
            else {
                brandList[i] = "";
                titleList[i] = titleText;
            }
            priceList[i] = prices.get(i).text();
            int parsedPrice = Integer.parseInt(priceList[i].substring(0, priceList[i].length() - 1).replaceAll(",", ""));
            String imageUrl = images.get(i).absUrl("src");
            imageList[i] = imageUrl;

            dataList.add(new CrawlData(brandList[i], titleList[i], parsedPrice, imageUrl));
        }

        System.out.println("* * * SSG.COM에서 지금 관심도 급상승 중인 상품 * * *");
        for (int i = 0; i < prices.size(); i++) {
            System.out.println((i+1) + ". " + "[" + brandList[i] + "] " + titleList[i] + "  -->  " + priceList[i] + " (" + imageList[i] + ")");
        }

        return dataList;
    }
}
