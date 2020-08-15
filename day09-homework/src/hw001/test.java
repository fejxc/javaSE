package hw001;

/**
 * 1、计算1000以内所有不能被7整除的整数之和
 */
public class test {
   public int add(int n){
       for(int i=0;i<1000;i++){
           if(i%7!=0){
               n=n+i;
           }
       }
        return n;

   }
    public static void main(String[] args) {
       test t=new test();
       int sum=0;
        System.out.println(t.add(sum));
    }
}


