import javax.swing.*;

public class Subscriptions extends JFrame {
    String [] subs = {"0xDECAFBAD", "Cafe au Lait", "Hack the Planet", "Ideoplex",
                        "Inessential", "Intertwingly", "Markpasc", "Postneo", "RC3", "Workbench"};
    JList subList  = new JList(subs);
    
    public Subscriptions() {
        super("Subscriptions");
        setSize(150, 335);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel pane = new JPanel();
        JLabel subLabel = new JLabel("RSS Subscriptions:");
        pane.add(subLabel);
        subList.setVisibleRowCount(8);
        JScrollPane scroller = new JScrollPane(subList);
        pane.add(scroller);
        
        //add panel to frame
        add(pane);
        setVisible(true);
    }
    
    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
    
    public static void main(String[] args) {
        setLookAndFeel();
        Subscriptions ff = new Subscriptions();
    }
}
