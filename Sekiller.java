
public abstract class Sekiller {
    
    private String isim;

    public Sekiller(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    abstract void alan_hesapla();
    
    abstract void cevre_hesapla();
    
    
}
