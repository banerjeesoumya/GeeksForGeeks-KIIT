
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CurrencyConverterAPP 
{
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            CurrencyConverterPanel convert = new CurrencyConverterPanel();
            frame.add(convert);

            frame.pack();
            frame.setVisible(true);
        });    
    }    
}
