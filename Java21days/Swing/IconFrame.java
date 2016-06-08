import javax.swing.*;

public class IconFrame extends JFrame {
    JButton load, save, subscribe, unsubscribe;
    
    public IconFrame() {
        super("Icon Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        
        //create icons
        ImageIcon loadIcon = new ImageIcon("load.gif");
        ImageIcon saveIcon = new ImageIcon("save.gif");
        ImageIcon subscribeIcon = new ImageIcon("subscribe.gif");
        ImageIcon unsubscribeIcon = new ImageIcon("unsubscribe.gif");
        
        //create buttons
        load = new JButton("Load", loadIcon);
        save = new JButton("Save", saveIcon);
        subscribe = new JButton("Subscribe", subscribeIcon);
        unsubscribe = new JButton("Unsubscribe", unsubscribeIcon);
        
        //add buttons to panel
        pane.add(load);
        pane.add(save);
        pane.add(subscribe);
        pane.add(unsubscribe);
        
        //add panel to frame
        add(pane);
        pack();
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
        IconFrame ike = new IconFrame();
    }
}
