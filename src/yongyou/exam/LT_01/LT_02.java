package yongyou.exam.LT_01;

import java.util.Scanner;

public class LT_02 {
    public String a;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println(a);
        String reg = "\"";
        String[] str =a.split(reg);
        System.out.println(str[0]);
    }
}
