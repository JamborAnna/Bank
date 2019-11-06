
package bankoop.bankiszolgaltatas.kartya;

import bankoop.bankiszolgaltatas.BankiSzolgaltatas;
import bankoop.bankiszolgaltatas.szamla.Szamla;
import tulajdonos.Tulajdonos;

public class Kartya extends BankiSzolgaltatas{
    private String kartyaSzam;
    private Szamla szamla;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.kartyaSzam = kartyaSzam;
        this.szamla = szamla;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public Szamla getSzamla() {
        return szamla;
    }
    
    public boolean vasarlas(int osszeg){
        return this.szamla.kiVesz(osszeg);
    }
            
}
