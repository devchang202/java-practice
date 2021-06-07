package com.exercise7;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
//    SutdaDeck() {
///*
//(1) 배열 SutdaCard를 적절히 초기화 하시오.
//*/
//        int cardNum = 0;
//        for (int i = 0; i < CARD_NUM; i++)
//        {
//            cardNum = i % 10 + 1;
//            switch(i / 10)
//            {
//                case 0:
//                    cards[i] = new SutdaCard(cardNum, cardNum == 1 || cardNum ==3 || cardNum == 8 ? true : false);
//                    break;
//                case 1:
//                    cards[i] = new SutdaCard(cardNum, false);
//                    break;
//                default:
//                    break;
//            }
//        }
//    }

    SutdaDeck() {
        int cardNum = 0;
        for (int i = 0; i < CARD_NUM; i++)
        {
            cardNum = i % 10 + 1;
            cards[i] = new SutdaCard(cardNum, i / 10 == 0 && (
                    cardNum == 1 || cardNum == 3 || cardNum == 8));
        }
    }
}
class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    // info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}
class Exercise7_1 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();
        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");
    }
}
