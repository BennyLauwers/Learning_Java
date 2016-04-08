import java.util.*;
public class arrlist {
  
    public static void main(String[] args) {
        ArrayList alist = new ArrayList();
        alist.add("Brugge");
        alist.add("Gent");
        alist.add("Oostkamp");
        alist.add("Aartrijke");
        
        System.out.println(alist);
        System.out.println(alist.contains("Oostkamp"));
        
        alist.remove(2);
        
        System.out.println(alist);
        System.out.println(alist.contains("Oostkamp"));
        
        Collections.sort(alist);
        System.out.println(alist); 
    }   
}
