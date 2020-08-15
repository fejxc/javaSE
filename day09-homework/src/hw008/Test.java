package hw008;

/**
 * 8、给一个不多于5位的正整数，
 * 12345   5  54321
 *
 * 12345/10=1234
 * 1234   4  4321
 *
 *
 * 要求：
 * 一、求它是几位数
 * 二、逆序打印出各位数字
 */
public class Test {
    public void Fun(int n){
        int count=0;

        while(n>0){
            n/=10;
            count++;
        }
        System.out.println("该数是"+count+"位数");

    }
    public void Fun2(int n,int count){

        int arr []=new int[count];
        for(int i=0;i<arr.length;i++){
            arr[i]=n%10;
            n=n/10;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.Fun(12345);
        test.Fun2(10000,5);
    }
}
