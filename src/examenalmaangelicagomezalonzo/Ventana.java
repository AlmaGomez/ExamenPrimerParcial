/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenalmaangelicagomezalonzo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Alma Angelica Gómez Alonzo 14 de Septiembre de 2017
 */
public class Ventana extends JFrame implements ActionListener{
    
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,blimpiar,bconvertir,bpunto;
    JLabel convertidor;
    JTextField Resultado;
    public Ventana(){
        super();
        setSize(400,400);
        setTitle("Convertidor de pesos a dolares");
        setLayout(null);
        inicializarComponentes();
        formatearComponentes();
    }
    public void inicializarComponentes(){
        b1=new JButton ("1");
        b2=new JButton ("2");
        b3=new JButton ("3");
        b4=new JButton ("4");
        b5=new JButton ("5");
        b6=new JButton ("6");
        b7=new JButton ("7");
        b8=new JButton ("8");
        b9=new JButton ("9");
        b0=new JButton ("0");
        bconvertir=new JButton ("Convertir");
        blimpiar=new JButton ("Limpiar");
        bpunto=new JButton (".");
        convertidor =new JLabel("Convertidor");
        Resultado= new JTextField("");
    }
    public void formatearComponentes(){
        convertidor.setBounds(0, 0, 100, 20);
        add(convertidor);
        Resultado.setBounds(0,20,350,60);
        Resultado.setEditable(false);
        add(Resultado);
        b1.setBounds(0,100,100,40);
        b1.addActionListener(this);
        add(b1);
        b2.setBounds(120,100,100,40);
        b2.addActionListener(this);
        add(b2);
        b3.setBounds(240,100,100,40);
        b3.addActionListener(this);
        add(b3);
        b4.setBounds(0,145,100,40);
        b4.addActionListener(this);
        add(b4);
        b5.setBounds(120,145,100,40);
        b5.addActionListener(this);
        add(b5);
        b6.setBounds(240,145,100,40);
        b6.addActionListener(this);
        add(b6);
        b7.setBounds(0,190,100,40);
        b7.addActionListener(this);
        add(b7);
        b8.setBounds(120,190,100,40);
        b8.addActionListener(this);
        add(b8);
        b9.setBounds(240,190,100,40);
        b9.addActionListener(this);
        add(b9);
        b0.setBounds(0,235,100,40);
        b0.addActionListener(this);
        add(b0);
        bpunto.setBounds(120,235,100,40);
        bpunto.addActionListener(this);
        add(bpunto);
        bconvertir.setBounds(240,235,100,40);
        bconvertir.addActionListener(this);
        add(bconvertir);
        blimpiar.setBounds(0,270,100,40);
        blimpiar.addActionListener(this);
        add(blimpiar);
        
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            Resultado.setText(Resultado.getText()+"1");
        } else
        if(e.getSource()==b2){
            Resultado.setText(Resultado.getText()+"2");
        }else
        if(e.getSource()==b3){
            Resultado.setText(Resultado.getText()+"3");
        }else
        if(e.getSource()==b4){
            Resultado.setText(Resultado.getText()+"4");
        }else
        if(e.getSource()==b5){
            Resultado.setText(Resultado.getText()+"5");
        }else
        if(e.getSource()==b6){
            Resultado.setText(Resultado.getText()+"6");
        }else
        if(e.getSource()==b7){
            Resultado.setText(Resultado.getText()+"7");
        }else
        if(e.getSource()==b8){
            Resultado.setText(Resultado.getText()+"8");
        }else
        if(e.getSource()==b9){
            Resultado.setText(Resultado.getText()+"9");
        }else
            if(e.getSource()==b0){
            Resultado.setText(Resultado.getText()+"0");
        }else
        if(e.getSource()==bpunto){
            Resultado.setText(Resultado.getText()+".");
        }else
        
        if(e.getSource()==bconvertir){
            double respuesta=Double.parseDouble(Resultado.getText());
            respuesta=respuesta/20;
            Resultado.setText(String.valueOf(respuesta));
        }else
        if(e.getSource()==blimpiar){
            Resultado.setText("");
        }
    }
    
}
