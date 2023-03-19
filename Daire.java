
public class Daire extends Sekiller{

    private int yaricap;
    
    public Daire(String isim,int yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }

    
    
    @Override
    void alan_hesapla() {
        
        System.out.println(getIsim() + " in alani " + Math.PI*(yaricap*yaricap) + " dir.");
        
    }

    @Override
    void cevre_hesapla() {
        
        System.out.println(getIsim() + " in cevresi " + Math.PI*2*yaricap + " dir..");
        
    }
    
    
    
}
