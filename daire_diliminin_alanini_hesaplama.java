import java.util.Scanner;
public class daire_diliminin_alanini_hesaplama {
    public static void main(String[] args) {
        double r, π, dilim, alan;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = input.nextDouble();
        System.out.print("Taralı alan açısı: ");
        dilim = input.nextDouble();

        π = 3.14 ;
        alan = (π * (r*r) * dilim) / 360;
        System.out.println(alan);
        
    }
}