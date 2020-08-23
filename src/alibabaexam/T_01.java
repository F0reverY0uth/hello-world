package alibabaexam;

import java.util.Arrays;
import java.util.Scanner;

public class T_01 {
/*输入n,d，n代表一个n行n列的数组，d是一个整数，数组里面的每个数加d
* 最终使他们数组里面所有数相等，然后输出加d的次数，如果无法实现，输出-1
* 例如：
* 2 2
* 1 2
* 3 4
* 输出：-1
* 3 1
* 1 2 3
* 4 5 6
* 7 8 9
* 输出36*/
    public static void main(String[] args) {
        int n,d;//定义两个数据
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        d=in.nextInt();//输入n，d
        int[] b =new int[n*n];//存放数据的数组
        boolean x=true;//查看数组是否有奇数的标记
        for (int i = 0;i<n*n;i++){
            b[i]=in.nextInt();
            if (b[i]%2==1&&d%2==0) x=false;

        }
        Arrays.sort(b);
//        System.out.println(Arrays.toString(b));
        int k=0;
        if (d%2==0&&x==false){
            System.out.println("-1");
        }else{
            for(int i=0;i<n*n;i++){
                int y=b[n*n-1]-b[i];
                if(y%d!=0){
                    System.out.println("-1");
                    break;
                }else {
                    k=y/d+k;
                }
            }
            System.out.println(k);
        }
    }
}
