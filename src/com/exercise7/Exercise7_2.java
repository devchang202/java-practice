package com.exercise7;

class SutdaDeck7_2 {
    final int CARD_NUM = 20;
    SutdaCard7_2[] cards = new SutdaCard7_2[CARD_NUM];
    SutdaDeck7_2() {
        int cardNum = 0;
        for (int i = 0; i < CARD_NUM; i++)
        {
            cardNum = i % 10 + 1;
            cards[i] = new SutdaCard7_2(cardNum, i / 10 == 0 && (cardNum == 1 || cardNum == 3 || cardNum == 8));
        }
    }
/*
(1) 위에 정의된 세 개의 메서드를 작성하시오.
*/
    void shuffle()
    {
        int pick = 0;
        SutdaCard7_2 tmp;
        for (int i = 0; i < CARD_NUM; i++)
        {
            pick = (int)(Math.random() * CARD_NUM);
            tmp = cards[pick];
            cards[pick] = cards[i];
            cards[i] = tmp;
        }
    }

    SutdaCard7_2 pick(int index)
    {
        return cards[index];
    }

    SutdaCard7_2 pick()
    {
        int idxPick = (int)(Math.random() * CARD_NUM);
        return cards[idxPick];
    }
} // SutdaDeck7_2
class SutdaCard7_2 {
    int num;
    boolean isKwang;
    SutdaCard7_2() {
        this(1, true);
    }
    SutdaCard7_2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}
class Exercise7_2 {
    public static void main(String args[]) {
        SutdaDeck7_2 deck = new SutdaDeck7_2();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");
        System.out.println();
        System.out.println(deck.pick(0));
    }
}