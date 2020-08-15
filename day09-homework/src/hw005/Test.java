package hw005;

import java.util.Scanner;

/**
 * 从键盘接收一个正整数，该正整数作为行数，输出以下图形
 *     * 4  1 0
 *    *** 3  3 1
 *   *****  2  5 2
 *  ******* 1   7 3
 * ********* 0   9 4
 * 例如：输入5，则打印如上图5行。
 */
public class Test {
    public void Print(int n){
        for(int i =1;i<=n;i++){ //控制行 5行
            for (int j=0;j<n-i;j++)  //内循环控制打印" "
            {
                System.out.print(" ");
            }
            for (int k=0;k<i*2-1;k++){ //内循环控制打印*
                System.out.print("*");

            }
            //以上两个for循环都结束之后，表示一行就结束了
            //在这里换行
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Test test = new Test();
        Scanner sn = new Scanner(System.in);
        System.out.println("请输入行数：");
        int row=sn.nextInt();
        test.Print(row);
    }
}
