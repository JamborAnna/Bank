
package bankoop.bankiszolgaltatas.szamla;

import tulajdonos.Tulajdonos;

public class MegtakaritasiSzamla extends Szamla{

    private double kamat;
    
    public static double alapertelmezettKamat=0.04;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapertelmezettKamat;
    }
    
    public void kamatJovairas(){
        super.egyenleg += (super.egyenleg*this.kamat);
    }
    
    @Override
    public boolean kiVesz(int osszeg) {
        
        boolean sikeresPenzFelvetel = false;
        
        if((super.egyenleg) >= osszeg){
            super.egyenleg -= osszeg;
            sikeresPenzFelvetel = true;
        }       
        return sikeresPenzFelvetel;
    }
    
    
    
}
