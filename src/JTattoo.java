import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JTattoo {
    public static void main(String[] args) {
        try {
        	
        	UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        	//UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
        	//UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        	//UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
        	//UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
        	//UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        	//UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        	//UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
        	//UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        	//UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        	//UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
        	//UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
        	//UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

        	//UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");       /* Não funcionou */
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        	//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        	//UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        	//UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        	//UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        	
        	
        	JOptionPane.showMessageDialog(null, "LookAndFell Modified !!");
        } catch (InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException | ClassNotFoundException e) {
            System.out.println("Erro : " + e.getMessage());
        }
    }
}