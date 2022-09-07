import java.util.Scanner;

public class ucakBileti {

	public static void main(String[] args) {
		double km, indirimOrani, yas, tip;
		Scanner input = new Scanner(System.in);

		System.out.println("Mesafeyi km türünden giriniz : ");
		km = input.nextInt();

		System.out.println("Yasýnýzý giriniz:");
		yas = input.nextInt();

		System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiþ Dönüþ ):");
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
            System.out.println("Hatalý Veri Girdiniz!");
        }else
            if(tip == 2){
            System.out.println("Uçak bileti ücretiniz : " + normalTutar * indirimOrani * 0.80 *2 + "TL");

                }else {
            System.out.println(" Uçak bileti ücretiniz : " + normalTutar * indirimOrani + "TL");
                }


		
	}

}
