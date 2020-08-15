package hw002;

/**
 * 2、计算 1+2-3+4-5+6-7....+100的结果
 * -3-5-7-9-11-13-15-17-19...-99
 * 1+2+4+6+....
 */
public class test {
    public static void main(String[] args) {
        int sum1=1;     //1不能被2整除，开始值为1
        for(int i=1;i<=100;i++){  //计算正数和
            if(i%2==0)
                sum1=sum1+i;

        }
        int sum2=0;   //计算负数和
        for(int i=3;i<=99;i=i+2){
            sum2+=i;
        }
       int sum=sum1-sum2;
        System.out.println(sum);
    }

}
