import java.util.Scanner;

public class ucakBileti {

	public static void main(String[] args) {
		double km, indirimOrani, yas, tip;
		Scanner input = new Scanner(System.in);

		System.out.println("Mesafeyi km t�r�nden giriniz : ");
		km = input.nextInt();

		System.out.println("Yas�n�z� giriniz:");
		yas = input.nextInt();

		System.out.println("Yolculuk tipini giriniz (1 => Tek Y�n , 2 => Gidi� D�n�� ):");
		tip = input.nextInt();
		
		double normalTutar = km  * 0.10;
		
        if (12 > yas) {
            indirimOrani = 0.50;
        } else if (yas <= 24) {
            indirimOrani = 0.90;
        } else if (65 < yas) {
            indirimOrani = 0.70;
        } else indirimOrani =1;

        if((!(tip == 1 || tip ==2)) || (km < 0) || (0 > yas)) {
            System.out.println("Hatal� Veri Girdiniz!");
        }else
            if(tip == 2){
            System.out.println("U�ak bileti �cretiniz : " + normalTutar * indirimOrani * 0.80 *2 + "TL");

                }else {
            System.out.println(" U�ak bileti �cretiniz : " + normalTutar * indirimOrani + "TL");
                }


		
	}

}
