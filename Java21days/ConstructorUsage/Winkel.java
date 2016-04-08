public class Winkel {
    
    public Winkel() {
    }
    
    public static void main(String[] args) {
        Meubel kast = new Meubel ();
        Meubel stoel = new Meubel (100);
        
        Meubel.zetTekst("Onze meubels zijn niet te overtreffen");
        
        kast.zetPrijs(200.99);
        
        
        Meubel.toonTekst();
        kast.toonTekst();
        kast.toonPrijs();
        stoel.toonPrijs();
        
        System.out.println(kast.berekenKorting(20));
        System.out.println(stoel.berekenKorting(50));
    }
}
