package aiqiyi.AiQiYi_01;

import java.util.Scanner;

public class AiQiYi {
    /**
     * 正整数n的阶乘(n!)中的末尾有多少个0?
     *
     * 例如：n = 5, n! = 120.末尾有1个0
     *
     * 实现：int CountZero(int n);
     *
     * 例如 输入31
     *     输出7
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        System.out.println(CountZero(a));
        System.out.println(countzero(a));
        for (int i=1;i<=a;i++){
            if (CountZero(a)!=countzero(a)){
                System.out.println("出错！");
                break;
            }
        }
    }
    public static int CountZero(int n){
//        第一种方法
        int m = n/25;
        n/=5;
        n+=m;
        return n;
    }
    public static int countzero(int n){
//        第二种方法：for循环
        int count = 0;
        int i;
        for (i = 5; i <= n; i += 5)   // 循环从5开始，以5的倍数为步长
        {
            count++;                    // 若为5的倍数，计数器加1
            if (i % 25 == 0)
                count++;                // 若为25的倍数，计数器再加1
        }
        return count;
    }
}
