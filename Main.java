
import java.util.Scanner;


public class Main {
    
    
    public static void islemler(){
        
        System.out.println("islemler:\n"
                + "0.islem islemleri bastir\n"
                + "1.islem ucgen\n"
                + "2.islem dikdortgen\n"
                + "3.islem daire\n"
                + "4.islem cikis");
        
    }
    
    
    public static void main(String[] args) {
        
        System.out.println("alan hesaplama islemine hosgeldiniz...");
        
        islemler();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {  
            System.out.println("lutfen bir islem giriniz");
            String islem = scanner.nextLine();
            
            
            if(islem.equals("4")){
                
                System.out.println("programdan cikiliyor...");
                break;
            }
            if(islem.equals("0")){
                islemler();
            }
            if(islem.equals("1")){
                
                System.out.println("lutfen alt kenar uzunlugu giriniz:");
                
                int altkenar=scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("lutfen yukseklik giriniz:");
                
                int yukseklik = scanner.nextInt();
                scanner.nextLine();
                
                Ucgen ucgen = new Ucgen("ucgen", altkenar, yukseklik);
                
                ucgen.alan_hesapla();
                ucgen.cevre_hesapla();
                
            }
            if(islem.equals("2")){
                
                System.out.println("lutfen kisa kenar giriniz:");
                
                int kisakenar = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("lutfen uzun kenar giriniz:");
                
                int uzunkenar=scanner.nextInt();
                scanner.nextLine();
                
                Dikdortgen dikdortgen = new Dikdortgen("dikdortgen", kisakenar, uzunkenar);
                
                dikdortgen.alan_hesapla();
                dikdortgen.cevre_hesapla();
                
            }
            if(islem.equals("3")){
                System.out.println("lutfen yari cap uzunlugunu giriniz:");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                
                Daire daire = new Daire("daire", yaricap);
                
                daire.alan_hesapla();
                daire.cevre_hesapla();
                
            }
            else {
                System.out.println("gecersiz bir islem girdiniz...");
            }
        }
        
        
        
    }
}
