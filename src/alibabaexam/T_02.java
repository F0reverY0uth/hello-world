package alibabaexam;

import java.util.Scanner;

public class T_02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int d=in.nextInt();
        int [][] a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(max<a[i][j]){
                    max=a[i][j];
                }
            }
        }
        int sum=0,k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                while(a[i][j]<max){
                    a[i][j]+=d;
                    k+=1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]!=max){
                    System.out.println("-1");
                    System.exit(0);
                }
            }
        }
        System.out.println(k);
    }
}
