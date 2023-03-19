
public class Ucgen extends Sekiller{
    
    private int alt_kenar;
    private int yukseklik;
    
    
    public Ucgen(String isim,int alt_kenar,int yukseklik) {
        
        super(isim);
        this.alt_kenar = alt_kenar;
        this.yukseklik = yukseklik;
    }

    @Override
    void alan_hesapla() {
        
        System.out.println(getIsim() + " in alani " + (alt_kenar*yukseklik)/2 + " dir..");
        
    }
    

    @Override
    void cevre_hesapla() {
        System.out.println(getIsim() + " in cevresi " + (alt_kenar + yukseklik + Math.sqrt(alt_kenar*alt_kenar +yukseklik*yukseklik)));
    }
    
    
    
    
}
