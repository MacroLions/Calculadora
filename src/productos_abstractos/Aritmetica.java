/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_abstractos;

import fabricas_abstractas.FactoryAritmetica;
import fabricas_abstractas.Operacion;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Aritmetica extends JPanel{
    FactoryAritmetica facAri = new FactoryAritmetica();
    

    public int WIDTH = 500, widthTF=120, widthB=50;
    public int HEIGHT = 120, heightTF=30, heightB=30;
    public JTextField textF1,textF2,textF3;
    public JButton button,button2,button3,button4;
    
    public Aritmetica(){
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(10,40,widthTF,heightTF));
        
        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(180,40,widthTF,heightTF));
        
        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(350,40,widthTF,heightTF));
        
        button = new JButton("+");
        button.setBounds(new Rectangle(30,80,widthB,heightB));
        
        button2 = new JButton("-");
        button2.setBounds(new Rectangle(90,80,widthB,heightB));
        
        button3 = new JButton("*");
        button3.setBounds(new Rectangle(150,80,widthB,heightB));
        
        button4 = new JButton("/");
        button4.setBounds(new Rectangle(210,80,widthB,heightB));
        
        
        textF1.setEditable(true);
        textF2.setEditable(true);
        textF3.setEditable(false);
        
        
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Operacion suma= facAri.CrearAritmetica(1);
                
                int a = Integer.parseInt(textF1.getText());
                int b = Integer.parseInt(textF2.getText());
                int c = suma.Calcular(a,b);
                
                textF3.setText(String.valueOf(c));
            }
        });
        
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Operacion resta= facAri.CrearAritmetica(2);
                
                int a = Integer.parseInt(textF1.getText());
                int b = Integer.parseInt(textF2.getText());
                int c = resta.Calcular(a,b);
                
                textF3.setText(String.valueOf(c));
            }
        });
        
        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Operacion mult= facAri.CrearAritmetica(3);
                
                int a = Integer.parseInt(textF1.getText());
                int b = Integer.parseInt(textF2.getText());
                int c = mult.Calcular(a,b);
                
                textF3.setText(String.valueOf(c));
            }
        });
        
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Operacion div= facAri.CrearAritmetica(4);
                
                int a = Integer.parseInt(textF1.getText());
                int b = Integer.parseInt(textF2.getText());
                int c = div.Calcular(a,b);
                
                textF3.setText(String.valueOf(c));
            }
        });
        
        add(textF1);
        add(button);
        add(button2);
        add(button3);
        add(button4);
        add(textF2);
        add(textF3);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        
}
