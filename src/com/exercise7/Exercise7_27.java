package com.exercise7;

class Outer7_22 {
    int value=10;
    class Inner {
        int value=20;
        void method1() {
            int value=30;
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer7_22.this.value);
        }
    } // Inner클래스의 끝
} // Outer7_22클래스의 끝
class Exercise7_27 {
    public static void main(String args[]) {
/*
(4) 알맞은 코드를 넣어 완성하시오.
*/
        Outer7_22 outer = new Outer7_22();
        Outer7_22.Inner inner = outer.new Inner();
        inner.method1();
    }
}
