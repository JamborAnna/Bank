package bankoop.bankiszolgaltatas.szamla;

import tulajdonos.Tulajdonos;

public class HitelSzamla extends Szamla{
    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    @Override
    public boolean kiVesz(int osszeg) {
        
        boolean sikeresPenzFelvetel = false;
        
        if((super.egyenleg+this.hitelKeret) >= osszeg){
            super.egyenleg -= osszeg;
            sikeresPenzFelvetel = true;
        }       
        return sikeresPenzFelvetel;
    }
    
    
    
}
