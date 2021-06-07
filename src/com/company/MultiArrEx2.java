package com.company;

import java.util.*;

public class MultiArrEx2 {
    public static void main(String[] args)
    {
        final int BINGO_SIZE = 5;

        int[][] BingoBoard = new int[BINGO_SIZE][BINGO_SIZE];
        boolean[] check = new boolean[BINGO_SIZE * BINGO_SIZE];

        for (int i = 0; i < BINGO_SIZE; i++)
        {
            for (int j = 0; j < BINGO_SIZE; j++)
            {
                while (true)
                {
                    int temp = (int)(Math.random() * (BINGO_SIZE * BINGO_SIZE) + 1);

                    if (check[temp - 1] != true)
                    {
                        BingoBoard[i][j] = temp;
                        check[temp - 1] = true;
                        System.out.printf("%-3d ", BingoBoard[i][j]);
                        break;
                    }
                }
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("좌표를 입력하세요");
            String input = scanner.nextLine();
            if (input.length() != 2)
            {
                System.out.println("invalid input");
                continue;
            }

            int x = (int)(input.charAt(0) - '0');
            int y = (int)(input.charAt(1) - '0');
            if(x > BINGO_SIZE || y > BINGO_SIZE)
            {
                System.out.println("invalid value");
                continue;
            }

            BingoBoard[x - 1][y - 1] = 0;
            for (int k = 0; k < BINGO_SIZE; k++)
            {
                for (int l = 0; l < BINGO_SIZE; l++)
                {
                    System.out.printf("%-3d ", BingoBoard[k][l]);
                }
                System.out.println();
            }
        }
    }
}
