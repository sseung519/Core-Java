package com.example;

import java.util.ArrayList;
import java.util.List;

public class Calc {
    private List<Product> list;
    public Calc(List<Product> list) {
        this.list = list;
    }

    public void calc() {
        /*
            1) 판매금액 = 수량 * 판매단가
            2) 매입금액 = 수량 * 매입단가
            3) 이익금 =판매금액 - (매입금액 + 운송료)
            4) 이익율 = 이익금 / 매입금액 * 100
         */
        for(Product p  : this.list) {
            int sellMoney = p.getQuantity() * p.getSellPrice();
            int buyMoney = p.getQuantity() * p.getBuyPrice();
            int benefit = sellMoney - (buyMoney + p.getTransport());
            double rate = (double)benefit / buyMoney * 100;
            p.setBenefit(benefit);
            p.setRate(rate);
        }
    }
}
