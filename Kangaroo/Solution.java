import java.util.Scanner;

public class Solution {

    public static void checkConditionAndPrint(int x1, int x2, int v1, int v2){
        while(x1 < x2){
            x1 += v1;
            x2 += v2;
            System.out.println("X1 " + x1);
            System.out.println("X2 " + x2);
        }
        if(x1 == x2){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();


        if (x1 < x2 && v1 > v2){
                checkConditionAndPrint(x1, x2, v1, v2);
        }else if (x1 > x2 && v1 < v2){
                checkConditionAndPrint(x2, x1, v2, v1);
            }
        else {
            System.out.println("NO");
        }
    }
}
