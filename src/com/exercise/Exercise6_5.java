package com.exercise;

class Exercise6_5 {
    public static void main(String args[]) {
        Student6_5 s = new Student6_5("홍길동",1,1,100,60,76);
        System.out.println(s.info());
    }
}

class Student6_5 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student6_5 (String name, int ban, int no, int kor, int eng, int math)
    {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    String info()
    {
        return name + " ," + Integer.toString(ban) + " ," + Integer.toString(no) + " ," +
            Integer.toString(kor) + " ," + Integer.toString(eng) + " ," + Integer.toString(math) + " ," + Integer.toString(getTotal()) + " ," + Float.toString(getAverage());
    }
    int getTotal()
    {
        int sum = kor + eng + math;
        return sum;
    }

    float getAverage()
    {
        int sum = getTotal();
        float avg = sum / 3.0f;
        avg = Math.round(avg * 10) / 10.0f;

        return avg;
    }
}