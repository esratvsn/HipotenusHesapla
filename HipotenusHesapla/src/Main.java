import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int x,y;
    double z;

    Scanner input=new Scanner(System.in);
    System.out.print("1.kenarı giriniz:");
    x= input.nextInt();

    System.out.print("2.kenarı giriniz:");
    y= input.nextInt();

    z=Math.sqrt( x*x + y*y );
    System.out.println("Hipotenüs uzunluğu:"+ z );

    //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        //çevresini hesapla
        double u=(x+y+z)/2;
        // Üçgenin alanını hesapla
        double alan = Math.sqrt(u * (u - x) * (u - y) * (u - z));
        System.out.print("Üçgenin alanı: "+ alan);
    }
}