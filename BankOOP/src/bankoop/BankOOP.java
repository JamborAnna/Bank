
package bankoop;

import bankoop.bankiszolgaltatas.kartya.Kartya;
import bankoop.bankiszolgaltatas.szamla.HitelSzamla;
import bankoop.bankiszolgaltatas.szamla.Szamla;
import tulajdonos.Tulajdonos;

public class BankOOP {

    public static void main(String[] args) {
            
        Bank khb = new Bank();
        Tulajdonos nyl = new Tulajdonos("Nyirő Levente"); 
        /*Szamla nylsz = new HitelSzamla(nyl,200000);*/
        Tulajdonos gizi = new Tulajdonos("Nyirőné Gizella");
        Szamla nylsz = khb.szamlaNyitas(nyl, 200000);
        Kartya gizikekartya = nylsz.ujKartya("1111");
        Kartya nylkartya = nylsz.ujKartya("2222");
        nylsz.beTesz(20000);
        nylsz.kiVesz(100000);
        System.out.println(nylsz.getEgyenleg());
    }
    
}
