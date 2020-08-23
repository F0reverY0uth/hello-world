package yongyou.exam.LT_01;

import java.util.Arrays;
        import java.util.Scanner;

public class LT_01 {
    /*给定一个字符串，质保函大小写英文字母，a-z，
    利用自负连续出现的次数，编写一种压缩算法，
    实现字符串压缩。
    比如"abbccdddaaaa"->"a1b2c2d3a4"
    要求压缩后长度必须小于原字符串长度，否则返回原字符串；
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        char b[] = a.toCharArray();
        char[] c = new char[a.length()];
        char count = 1;
        int j = 1;
        for (int i = 1; i < a.length(); i++) {
            if (b[i] == b[i - 1]) {
                count += 1;
                c[j-1] = b[i];
                c[j] = (char) count;
            } else {
                count = 1;
                c[j] = b[i - 1];
                c[j + 1] = (char) count;
                j+=2;
            }
        }
        System.out.println(Arrays.toString(c));

    }
}
