import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner soNguyen = new Scanner(System.in);
        System.out.println("nhap so: ");
        long a = soNguyen.nextLong();
        if(a>0) {
            System.out.println(a + " la so nguyen duong");
        }else if(a<0) {
            System.out.println(a + " la so nguyen am");
        }else {
            System.out.println( "day la so 0");
        }
    }
}
