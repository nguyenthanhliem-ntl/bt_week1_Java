import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner tamGiac = new Scanner(System.in) ;

        System.out.println("Nhap canh a: ");
        int a = tamGiac.nextInt();

        System.out.println("nhap canh b: ");
        int b = tamGiac.nextInt();

        System.out.println("Nhap canh c: ");
        int c = tamGiac.nextInt();

        if(a>=0 && b>=0 && c>=0) {
            if(a*a == (b*b)+(c*c) || b*b == (a*a)+(c*c) || c*c == (a*a)+(b*b) ) {
                System.out.println("day la cac canh cua 1 tam giac vuong");
            }else {
                System.out.println("day khong phai cac canh cua 1 tam giac vuong");
            }
        }else {
            System.out.println("day khong phai cac canh cua 1 tam giac vuong");
        }

    }
}
