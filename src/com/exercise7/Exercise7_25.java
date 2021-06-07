package com.exercise7;

//class Outer {
//    class Inner {
//        int iv=100;
//    }
//}
//class Exercise7_25 {
//    public static void main(String[] args) {
///*
//(1) 알맞은 코드를 넣어 완성하시오.
//*/
//        Outer out = new Outer();
//        Outer.Inner inner = out.new Inner();
//        System.out.println(inner.iv);
//    }
//}

class Outer {
    static class Inner {
        int iv=200;
    }
}
class Exercise7_25 {
    public static void main(String[] args) {
/*
(1) 알맞은 코드를 넣어 완성하시오.
*/
        Outer.Inner inner = new Outer.Inner();
        System.out.println(inner.iv);
    }
}