public class Doorgeef {
    public int getalwaarde;
    
    public static int verdubbel(int waarde){
        return waarde *= 2;
    }
    
    public void verdubbelgetalwaarde(Doorgeef B){
        B.getalwaarde *= 2;
    }
    
    public void verdubbelaar(int a[]){
        for(int teller=0;teller<a.length;teller++){
            a[teller] *= 2;
        }
    }
    
    public static void main(String[] args) {
        int getal = 50;
        
        System.out.println(getal);
        System.out.println(Doorgeef.verdubbel(getal));
        System.out.println(getal);
        
        
        System.out.println("\n");
        
        Doorgeef test = new Doorgeef();
        test.getalwaarde = 60;
        System.out.println(test.getalwaarde);
        test.verdubbelgetalwaarde(test);
        System.out.println(test.getalwaarde);
        
        System.out.println("");
         
        int mijnarray[] = {1,2,3,4,5,6};
        Doorgeef test2 = new Doorgeef();
        //arrayinhoud voor verdubbelaar
        for(int teller=0;teller<mijnarray.length;teller++){
            System.out.println("mijnarray[" +teller +"] = " +mijnarray[teller]);
        }
        
        //verdubbelaar uitvoeren
        test2.verdubbelaar(mijnarray);
        System.out.println("");
        
        //arrayinhoud na verdubbelaar
        for(int teller=0;teller<mijnarray.length;teller++){
            System.out.println("mijnarray[" +teller +"] = " +mijnarray[teller]);
        }
    }
}
