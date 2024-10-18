package com.qriosity.day14.jsoup;

/**
 * @author Queue-ri
 */
public class CrawlData {
    String brand;
    String title;
    int price;
    String imageUrl;

    public CrawlData(String brand, String title, int price, String imageUrl) {
        this.brand = brand;
        this.title = title;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    String getBrand() {
        return brand;
    }
    String getTitle() {
        return title;
    }
    int getPrice() {
        return price;
    }
    String getImageUrl() {
        return imageUrl;
    }
}
