import java.util.*;
public class arrayklasse {
    
    public static void print(int[] a){
        for(int teller=0;teller<a.length;teller++){
            System.out.println("element " +teller +" = " +a[teller]);
        }
    }
    public static void main(String[] args) {
        int[] getallen = {8,150,23,46,5,89,75,23};
        print(getallen);
        Arrays.sort(getallen);
        print(getallen);  
    }
}
