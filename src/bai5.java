import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner bac2  = new Scanner(System.in);

        System.out.println("nhap a: ");
        int a = bac2.nextInt();

        System.out.println("nhap b: ");
        int b = bac2.nextInt();

        System.out.println("nhap c: ");
        int c = bac2.nextInt();
         int delta = b*b-(4*a*c);
        System.out.println("Delta = " +delta);

         if(delta < 0) {
             System.out.println("pt vo nghiem");
         }else  if( delta == 0) {
             System.out.println("pt co 1 nghiem duy nhat = " + -b/2*a );
         }else if(delta > 0 ) {
             System.out.println("pt co 2 ng phan biet x1 = "+ (-b+Math.sqrt(delta))/2*a + " va x2= " + (-b-Math.sqrt(delta))/2*a) ;
         }
     }
}
