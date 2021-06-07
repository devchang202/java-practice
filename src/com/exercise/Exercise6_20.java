package com.exercise;

class Exercise6_20
{
    /*
    (1) shuffle메서드를 작성하시오.
    */
    static int[] shuffle(int[] arr)
    {
        int idx;
        int tmp;
        if (arr == null || arr.equals(""))
        {
            return arr;
        }
        for (int i = 0; i < arr.length; i++)
        {
            idx = (int)(Math.random() * arr.length);
            tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        return arr;
    }
    public static void main(String[] args)
    {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}