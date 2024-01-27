import java.util.*;

public class HipotenusBulma {
     public static void main(String[] args) {

double a , b, c;
Scanner input = new Scanner(System.in);

         System.out.print("Birinci uzunluğu giriniz : ");
         a = input.nextDouble();

         System.out.print("İkinci uzunluğu giriniz : ");
         b = input.nextDouble();

         c = Math.sqrt((a*a) + (b*b));
         System.out.println("Hipotenüs kenarı uzunluğu : " + c);
}
    }