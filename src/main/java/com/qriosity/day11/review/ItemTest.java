package com.qriosity.day11.review;

import java.time.LocalDate;

/**
 * @author Queue-ri
 */
public class ItemTest {
    public static void main(String[] args) {
        Item item1 = new Item(
                "양평군, 한국의 별장 전체",
                62,
                LocalDate.of(2024, 10, 20),
                LocalDate.of(2024, 10, 25),
                527938,
                "https://a0.muscache.com/im/pictures/hosting/Hosting-962166410706461229/original/cd3ed5a6-7588-47a2-aec5-d53dc3b8c5a1.jpeg?im_w=720",
                4.97
        );

        System.out.println(item1.toString());
    }
}

class Item {
    static Long itemId = 0L;
    String title;
    int distance;
    LocalDate startDate;
    LocalDate endDate;
    int price;
    String imgUrl;
    double rate;

    public Item(String title, int distance, LocalDate startDate, LocalDate endDate, int price, String imgUrl, double rate) {
        ++itemId;
        this.title = title;
        this.distance = distance;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.imgUrl = imgUrl;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId + ", " +
                "title='" + title + '\'' +
                ", distance=" + distance +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", price=" + price +
                ", imgUrl='" + imgUrl + '\'' +
                ", rate=" + rate +
                '}';
    }
}