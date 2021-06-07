package com.company;

public class Main {

    public static void main(String[] args) {
        if (args.length < 3)
        {
            System.out.println("the number of args is less than 3");
            System.exit(0);
        }

        int num1 = Integer.parseInt(args[0]);
        char op = args[1].charAt(0);
        int num2 = Integer.parseInt((args[2]));
        int result = 0;

        switch(op)
        {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("지원되지 않는 연산입니다.");
        }

        System.out.println("결과 : " + result);
    }
}
