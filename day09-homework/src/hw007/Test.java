package hw007;

/**
 * 7、一个数如果恰好等于它的因子之和，这个数就是完数，例如 6 = 1 + 2 + 3，编程
 * 找出1000内所有的完数。
 *
 * 2 1   for(i=1;i<n;i++) {n=n/i}
 * 3 1
 * 4 1 2
 * 5 1
 * 6 1 2 3
 * 7 1
 * 8 1 2 4
 * 9 1 3
 * 10 1 2 5
 * 11 1
 * 12 1 2 6 3 4
 * 13 1
 * 14 1 2 7
 *
 */
public class Test {
    public static void main(String[] args) {
        int sum;
        for(int i=1;i<1000;i++){
            sum=0;  //每次清0
            for(int j=1;j<i;j++){

                if(i%j==0){
                    sum+=j;
                }

            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }

}
