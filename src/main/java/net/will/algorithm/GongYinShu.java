package net.will.algorithm;

import java.util.Scanner;

public class GongYinShu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        GongYinShu obj = new GongYinShu();
        int result = obj.gongyinshu(a, b);

        System.out.println("最大公因数：" + result);
        System.out.println("最小公倍数：" + a * b / result);
    }

    private int gongyinshu(int largerNum, int smallerNum) {
        if (largerNum < smallerNum) {
            int tmp = smallerNum;
            smallerNum = largerNum;
            largerNum = tmp;
        }

        while (smallerNum != 0) {
            if (largerNum == smallerNum) {
                return largerNum;
            }
            int tmp = smallerNum;
            smallerNum = largerNum % smallerNum;
            largerNum = tmp;
        }
        return largerNum;
    }
}
