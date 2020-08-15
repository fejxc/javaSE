package hw006;

/**
 * 6、小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天
 * 或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
 *
 * 1  2.5
 * 2  5
 * 3  7.5
 * 4  10
 * 5  12.5   花 -6
 * 6  15
 * 7  17.5
 * 8  20
 * 9 22.5
 * 10 25    -6
 * .
 * .
 * .
 * 15
 * .
 * .
 * 20
 *
 */
public class Test {
    public static void main(String[] args) {
        int day=0;
        double temp=0;
        double sum =100;
        while(temp<sum){  //temp!=sum  结果是76   为什么
            temp=temp+2.5;
            day++;
            if (day % 5 == 0) {

                temp-=6;
            }

        }
        System.out.println(day);
    }



}
