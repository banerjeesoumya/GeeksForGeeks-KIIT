
import java.awt.GridLayout;
//import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CurrencyConverterPanel extends JPanel
{
    private JComboBox<String> sourceCurrency;
    private JComboBox<String> targetCurrency;
    private JTextField amountEntry;
    private JButton convert;
    //private JButton rconvert;
    private JLabel result;

    public CurrencyConverterPanel ()
    {
        setLayout(new GridLayout(5, 2, 0, 10));

        sourceCurrency = new JComboBox<>(new String[]{"INR", "USD", "EUR"});
        targetCurrency = new JComboBox<>(new String[]{"INR", "USD", "EUR"});
        amountEntry = new JTextField(10);
        convert = new JButton("CONVERT");
        //rconvert = new JButton("REVERSE");
        result = new JLabel();
        
        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String SourceCurrency = (String)sourceCurrency.getSelectedItem();
                String TargetCurrency = (String)targetCurrency.getSelectedItem();
                double amount = Double.parseDouble(amountEntry.getText());
                
                double c = ConvertAmount (amount, SourceCurrency, TargetCurrency);

                result.setText(String.format("%.2f %s = %.2f %s", amount, SourceCurrency, c, TargetCurrency));
            }    
        });
        
        add (new JLabel("Source  Currency"));
        add(sourceCurrency);
        add(new JLabel("Target Currency"));
        add(targetCurrency);
        add(new JLabel("Amount"));
        add(amountEntry);
        add(new JLabel());
        add(convert);
        add(new JLabel());
        add(result);
    }

    private double ConvertAmount (double amount, String SourceCurrency, String TargetCurrency)
    {
        double INR_to_USD = 0.012;
        double INR_to_EUR = 0.011;
        double USD_to_INR = 83.16;
        double USD_to_EUR = 0.92;
        double EUR_to_INR = 90.57;
        double EUR_to_USD = 1.09;
        if ((SourceCurrency.equals("INR")) && (TargetCurrency.equals("USD")))
        {
            return (amount * INR_to_USD);
        }
        if ((SourceCurrency.equals("INR")) && (TargetCurrency.equals("EUR")))
        {
            return (amount * INR_to_EUR);
        }
        if ((SourceCurrency.equals("USD")) && (TargetCurrency.equals("INR")))
        {
            return (amount * USD_to_INR);
        }
        if ((SourceCurrency.equals("USD")) && (TargetCurrency.equals("EUR")))
        {
            return (amount * USD_to_EUR);
        }
        if ((SourceCurrency.equals("EUR")) && (TargetCurrency.equals("INR")))
        {
            return (amount * EUR_to_INR);
        }
        if ((SourceCurrency.equals("EUR")) && (TargetCurrency.equals("USD")))
        {
            return (amount * EUR_to_USD);
        }
        
        return 0.0;
    }
}
 
