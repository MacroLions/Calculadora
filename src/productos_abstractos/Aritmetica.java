/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_abstractos;

import fabricas_concretas.FactoryAritmetica;
import fabricas_abstractas.Operacion;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

/**
 *
 * @author LN710Q
 */
public class Aritmetica extends JPanel{
    FactoryAritmetica facAri = new FactoryAritmetica();
    

    public int WIDTH = 500, widthTF=120, widthB=50;
    public int HEIGHT = 240, heightTF=30, heightB=30;
    public JTextField textF1,textF2,textF3,textF4,textF5;
    public JButton button,button2,button3,button4,button5;
    public JLabel Label1,Label2,Label3,Label4,Label5;
    
    public Aritmetica(){
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(10,40,widthTF,heightTF));
        
        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(180,40,widthTF,heightTF));
        
        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(350,40,widthTF,heightTF));
        
        textF4 = new JTextField();
        textF4.setBounds(new Rectangle(90,150,widthTF,heightTF));
        
        textF5 = new JTextField();
        textF5.setBounds(new Rectangle(250,150,widthTF,heightTF));
                
        button = new JButton("+");
        button.setBounds(new Rectangle(30,80,widthB,heightB));
        
        button2 = new JButton("-");
        button2.setBounds(new Rectangle(90,80,widthB,heightB));
        
        button3 = new JButton("*");
        button3.setBounds(new Rectangle(150,80,widthB,heightB));
        
        button4 = new JButton("/");
        button4.setBounds(new Rectangle(210,80,widthB,heightB));
        
        button5 = new JButton("Binario");
        button5.setBounds(new Rectangle(110,190,80,heightB));
        
        Label1 = new JLabel("Calculadora numerica");
        Label1.setBounds(new Rectangle(10,5,400,heightB));
        
        Label2 = new JLabel("Calculadora transformadora");
        Label2.setBounds(new Rectangle(10,120,400,heightB));
        
        Label3 = new JLabel("");
        Label3.setBounds(new Rectangle(150,40,widthTF,heightB));
        
        Label4 = new JLabel("=");
        Label4.setBounds(new Rectangle(320,40,widthTF,heightB));
        
        Label5 = new JLabel("=");
        Label5.setBounds(new Rectangle(225,150,widthTF,heightB));
        
        textF1.setEditable(true);
        textF2.setEditable(true);
        textF3.setEditable(false);
        textF4.setEditable(true);
        textF5.setEditable(false);
        
        
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                try{
                    Operacion suma= facAri.CrearAritmetica(1);
                    Label3.setText("+");
                    int a = Integer.parseInt(textF1.getText());
                    int b = Integer.parseInt(textF2.getText());
                    int c = suma.Calcular(a,b);
                
                    textF3.setText(String.valueOf(c));
                }catch(Exception ex){
                    System.out.println("Ingrese 2 números");
                }
            }
        });
        
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                try{
                    Operacion resta= facAri.CrearAritmetica(2);
                    Label3.setText("-");
                    int a = Integer.parseInt(textF1.getText());
                    int b = Integer.parseInt(textF2.getText());
                    int c = resta.Calcular(a,b);
                
                    textF3.setText(String.valueOf(c));
                }catch(Exception ex){
                    System.out.println("Ingrese 2 números");
                }
            }
        });
        
        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                try{
                    Operacion mult= facAri.CrearAritmetica(3);
                    Label3.setText("x");
                    int a = Integer.parseInt(textF1.getText());
                    int b = Integer.parseInt(textF2.getText());
                    int c = mult.Calcular(a,b);
                
                    textF3.setText(String.valueOf(c));
                }catch(Exception ex){
                    System.out.println("Ingrese 2 números");
                }
            }
        });
        
        button4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                try{
                    Operacion div= facAri.CrearAritmetica(4);
                    Label3.setText("/");
                    int a = Integer.parseInt(textF1.getText());
                    int b = Integer.parseInt(textF2.getText());
                    int c = div.Calcular(a,b);
                
                    textF3.setText(String.valueOf(c));
                }catch(Exception ex){
                    System.out.println("Ingrese 2 números");
                }
            }
        });
        
        button5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                try{
                    Operacion div= facAri.CrearAritmetica(4);
                    Label3.setText("/");
                    int a = Integer.parseInt(textF1.getText());
                    int b = Integer.parseInt(textF2.getText());
                    int c = div.Calcular(a,b);
                    double k=2.44;
                    Double.toString(k);
                    textF3.setText(String.valueOf(c));
                }catch(Exception ex){
                    System.out.println("Ingrese 2 números");
                }
            }
        });
        
        add(textF1);
        add(button);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(textF2);
        add(textF3);
        add(textF4);
        add(textF5);
        add(Label1);
        add(Label2);
        add(Label3);
        add(Label4);
        add(Label5);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        
    }

}
