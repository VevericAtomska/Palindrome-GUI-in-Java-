package dz09;

import javax.swing.*;
import java.awt.event.*;

public class Dz09 {
    
    
    
    static JTextField textUlaz;
    static JTextField textIzlaz;
    static JFrame okvirPane;
    static boolean palindrom = false;
    static String ulaz = "";
    static String obrnuto = "";
    static String temp = "";

    public static void main(String[] args) {
        
        JFrame okvir = new JFrame("Palindrom GUI");
        okvir.setSize(650, 400);
        okvir.setLayout(null);
        okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel labelUlaz = new JLabel("Ulazna recenica: ");
        JLabel labelIzlaz = new JLabel ("Obrnuta recenica: ");
        
        labelUlaz.setBounds(10, 50, 120, 30);
        labelIzlaz.setBounds(10, 100, 120, 30);
        
        okvir.add(labelUlaz);
        okvir.add(labelIzlaz);
        
        textUlaz = new JTextField();
        textIzlaz = new JTextField();
        
        textUlaz.setBounds(150,50,450,30);
        textIzlaz.setBounds(150,100,450,30);
        textIzlaz.setEditable(false);
        
        okvir.add(textUlaz);
        okvir.add(textIzlaz);
        
        
        
        textUlaz.addActionListener(new ActionListener() 
        {
        @Override
            public void actionPerformed(ActionEvent event) 
            {
                String ulaz = textUlaz.getText();
        
                for(int i = ulaz.length() - 1; i >= 0; i--)
                    {
                        obrnuto += ulaz.charAt(i);
                    }
        
                textIzlaz.setText(obrnuto);
                
                ulaz = ulaz.replace(" ", "");
                obrnuto = obrnuto.replace(" ", "");
                
                for(int i = 0; i < ulaz.length(); i++)
                {
                    if(ulaz.charAt(i) == obrnuto.charAt(i))
                    {
                        palindrom = true;
                    }
                }
                if(ulaz.equalsIgnoreCase(obrnuto))
                {
                    okvirPane = new JFrame();
        JOptionPane.showMessageDialog(okvirPane, "Ulazna recenica jeste palindrom", "Rezultat", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    okvirPane = new JFrame();
        JOptionPane.showMessageDialog(okvirPane, "Ulazna recenica nije palindrom", "Rezultat", JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
        });
        
        okvir.setVisible(true);
        
    }
    
}
