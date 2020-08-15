package hw004;

import java.util.Scanner;

/**
 * 4、从控制台接收一个正整数，判断该数字是否为质数
 * 质数（质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数）
 * 3/2
 *
 */
public class Test {
    public void isPrime(int n){
        boolean flag = true;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0){
                flag = false;
                System.out.println("不是素数");
                break;
            }
        }
        if (flag){
            System.out.println("是素数");
        }

    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Test test = new Test();
        while (true){
                System.out.println("请输入正数：");
                int n=sn.nextInt();
                if(n==1 || n<=0 ){
                    System.out.println("请输入大于2的正数！");
                    break;
                }
                test.isPrime(n);
        }




    }
}
