package com.qriosity.day9.quiz;

import java.util.Scanner;

/**
 * @author Queue-ri
 */
public class Q4 {
    public static void main(String[] args) {
        Item burger = new Item("Burger", 5.99);
        Item fries = new Item("Fries", 2.99);
        Item soda = new Item("Soda", 1.99);
        Item[] items = {burger, fries, soda};
        Item[] orders = new Item[3];

        int orderNum = 0;
        while (true) {
            for (int i = 0; i < items.length; ++i) {
                System.out.println((i+1) + ">> " + items[i].getName() + ": $" + items[i].getPrice());
            }
            System.out.print("\n메뉴 번호를 입력, 3개 모두 주문 완료되었으면 'x'입력 >> ");
            Scanner sc = new Scanner(System.in);
            String selected = sc.nextLine();
            int selectedInt = -1;

            if (selected.equals("x")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                selectedInt = Integer.parseInt(selected);
            }

            if (0 < selectedInt && selectedInt < 4) {
                System.out.println("주문 가능한 메뉴입니다.");
                orders[orderNum++] = items[selectedInt-1];
                System.out.println("===========================");
            }
        }

        System.out.println("\nYour order:");
        for (Item i : orders) {
            System.out.println(i.getName() + ": " + i.getPrice());
        }
    }
}

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}