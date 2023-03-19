
public class Dikdortgen extends Sekiller{
    private int kisa_kenar;
    private int uzun_kenar;
    
    public Dikdortgen(String isim,int kisa_kenar,int uzun_kenar) {
        super(isim);
        this.kisa_kenar = kisa_kenar;
        this.uzun_kenar = uzun_kenar;
    }

    @Override
    void alan_hesapla() {
        
        System.out.println(getIsim() + " in alani " + kisa_kenar*uzun_kenar + " dir..");
        
    }

    @Override
    void cevre_hesapla() {
        
         System.out.println(getIsim() + " in cevresi " + (kisa_kenar*2 + uzun_kenar*2) + " dir..");
        
    }
    
}
