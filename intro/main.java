package intro;
	
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        
        // yorum
        
        String internetSubeButonu = "İnternet Şubesi";
        double dolarDun = 8.18;
        double dolarBugün = 8.17;
        int vade = 36;
        boolean dustuMu = true;
        
        
        System.out.println(internetSubeButonu);
            
        if(dolarBugün<dolarDun) {
            System.out.println("Dolar Düştü");
            }
        else if (dolarBugün>dolarDun) {
                System.out.println("Dolar Yükseldi");
            }
        else {
            System.out.println("Değişiklik Olmadı");
        }
        
        String kredi1 ="Hızlı Kredi";
        String kredi2 ="Mutlu Emekli Kredisi";
        String kredi3 ="Konut Kredisi";
        String kredi4 ="Çiftçi Kredisi";
        String kredi5 ="MSB Kredisi";
        System.out.println(kredi1);
        System.out.println(kredi2);
        System.out.println(kredi3);
        System.out.println(kredi4);
        System.out.println(kredi5);
        
        String [] krediler = 
            {
                    "Hızlı Kredi",
                    "Mutlu Emekli Kredisi",
                    "Konut Kredisi",
                    "Çiftçi Kredisi",
                    "MSB Kredisi",
                    "Meb Kredisi",
                    "Kültür Bakanlığı Kredisi"
            };
        
        //foreach
        for(String kredi : krediler) {
            System.out.println(kredi);
        
    }
        
        for(int i = 0; i<krediler.length ; i=i+1) {
            System.out.println(krediler[i]);
        }
        
        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1);
        
        int[] sayilar1 = {1,2,3,4,5};
        int[] sayilar2 = {10,20,30,40,50};
        sayilar1 = sayilar2;
        sayilar2 [0] = 100;
        System.out.println(sayilar1[0]);
        
}
}






