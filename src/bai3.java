import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner soK = new Scanner (System.in);

        System.out.println("nhap so k :" );
        long so = soK.nextLong();

        if(so %3 ==0 && so %5 == 0) {
            System.out.println("FIzzBuzz");
        }else if(so %3 == 0) {
            System.out.println("Fizz");
        }else if(so %5 == 0) {
            System.out.println("Buzz");

        }
    }
}
