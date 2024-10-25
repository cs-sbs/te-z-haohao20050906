package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0; // 输出结果
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();
        // 你的代码逻辑
        int binaryValue = 1; // 当前二进制位值，从1开始，每次循环乘以2
        // 将输入数字转换为字符串，以便逐位检查
        String numberStr = Integer.toString(inputNumber);

        // 从字符串的最后一个字符开始遍历（即数字的个位）
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            int digit = numberStr.charAt(i) - '0'; // 将字符转换为数字
            int position = numberStr.length() - i; // 计算当前数字的位置（从1开始）

            // 检查数字和位置的奇偶性是否一致
            if ((digit % 2) == (position % 2)) {
                // 如果一致，则累加对应的二进制位值
                result += binaryValue;
            }

            // 下一位的二进制值是当前值的两倍
            binaryValue *= 2;
        }


        // 输出结果
        System.out.println(result);

        // 关闭Scanner对象
        in.close();


    }
}
