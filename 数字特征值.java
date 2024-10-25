import java.util.Scanner;  
  
public class OddEvenFeatureValue {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        int number = scanner.nextInt();  
        scanner.close();  
  
        int result = 0;  
        int binaryValue = 1; // 从个位开始，二进制位值初始化为1  
  
        // 将整数转换为字符串，以便从右向左遍历每一位数字  
        String numberStr = Integer.toString(number);  
  
        // 从右向左遍历每一位数字  
        for (int i = numberStr.length() - 1; i >= 0; i--) {  
            int digit = numberStr.charAt(i) - '0'; // 将字符转换为数字  
            int position = numberStr.length() - i; // 数位，从1开始  
  
            // 检查数字和数位的奇偶性是否一致  
            if ((digit % 2 == 0 && position % 2 == 0) || (digit % 2 != 0 && position % 2 != 0)) {  
                // 如果一致，则将当前的二进制位值加到结果中  
                result += binaryValue;  
            }  
  
            // 二进制位值左移一位（乘以2）  
            binaryValue *= 2;  
        }  
  
        // 输出结果  
        System.out.println(result);  
    }  
}