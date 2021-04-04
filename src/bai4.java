import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner snt = new Scanner(System.in) ;

        System.out.println("nhap so: ");
        int a = snt.nextInt();

        if(a<2) {
            System.out.println(" day khong phai snt");
        }else if(a ==2 || a==3 ) {
            System.out.println(a + " la snt");
        }else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(a) ; i++) {
                         if (a% i == 0){
                             check = false;
                             System.out.println(a + " ko la so nguyen to");
                             break;
                         }
                     }

                     if (check){
                         System.out.println(a + " la so nguyen to");
                     }
                     else {
                         System.out.println(a + " khong la snt");
                     }
        }
    }
}
