public class Meubel {
    public static String meubeltekst = "Ik ben een meubelstuk";
    private double prijs;
    
    public Meubel () {
        prijs = 0;
    }
    
    public Meubel (int prijs){
        this.prijs = prijs;
    }
    
    public static void toonTekst(){
        System.out.println(meubeltekst);
    }
    
    public static void zetTekst(String nieuwemeubeltekst){
        meubeltekst = nieuwemeubeltekst;
    }
    
    public void toonPrijs(){
        System.out.println(prijs);
    }
    
    public void zetPrijs(double nieuweprijs){
        prijs = nieuweprijs;
    }
    
    public double berekenKorting(int korting){
        return prijs - prijs * korting / 100;
    }
}
