package hw003;

/**
 * 3、从控制台输入一个正整数，计算该数的阶乘。例如输入5，阶乘为 5*4*3*2*1
 *
 * 递归有回溯的过程  从fu(1)=1 回退到5*fun(4)=120
 * 5*fun(4)=120
 * fun(4)=4*fun(3)=24
 * fun(3)=3*fun(2)=6
 * fun(2)=2*fun(1)=2
 * fun(1)=1
 *
 */
public class test {
    public int fun(int n){
        if(n==1){
            return 1;
        }
        else
            return n*fun(n-1);
    }

    public static void main(String[] args) {
        test t =new test();
        System.out.println(t.fun(5));
    }
}
