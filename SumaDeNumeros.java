/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Matuz
 */

import java.awt.Color;
import javax.swing.JFrame; //Para la ventana
import javax.swing.JLabel; //Datos de salida
import javax.swing.JButton; //Para botones
import javax.swing.JTextField; //Para caja de texto
import java.awt.event.ActionListener; //Para el escuchador
import java.awt.event.ActionEvent; //Eventos
import javax.swing.JOptionPane;

public class SumaDeNumeros extends JFrame implements ActionListener{
    
    private JLabel mensaje;
    private JButton boton;
    private JTextField caja;
    private JTextField caja2;
    
    public SumaDeNumeros(){
        super();
        configurarVentana();
        crearComponentes();
    }
    
    private void configurarVentana(){
        this.setTitle("Hello World"); //Titulo de la ventana
        this.setSize(300,300); //Tamaño con ancho y altura
        this.setLocationRelativeTo(null); //Para que la colocacion de la pantalla sea relativa
        this.setLayout(null); //Para la acomodación de las cosas dentro de la ventana
        this.setResizable(true); //Modificación del tamaño de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar ventana
    }
    
    private void crearComponentes(){
        mensaje = new JLabel(); //Se crea el objeto JLabel
        mensaje.setText("Ingrese 2 numeros para su suma."); // Se crea el texto a mostrar
        mensaje.setBounds(50,50, 300, 30); // Posición X e Y del texto y su tamaño.
        mensaje.setForeground(Color.ORANGE); //Color del texto
        this.add(mensaje); //Añadir el texto a la ventana
        
        caja = new JTextField();
        caja.setBounds(50,120,100,30);
        this.add(caja);
        
        caja2 = new JTextField();
        caja2.setBounds(50,160,100,30);
        this.add(caja2);
        
        boton = new JButton();
        boton.setText("Hazme click :D");
        boton.setBounds(50,80,150,30);
        boton.addActionListener(this);
        this.add(boton);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String resultado = caja.getText(); //Obtiene el texto que se encuentra en la cajita de texto 
        String resultado2 = caja2.getText();
        //JOptionPane.showMessageDialog(this, "El valor es: " + resultado);
        float numero1 = java.lang.Float.parseFloat(resultado);
        float numero2 = java.lang.Float.parseFloat(resultado2);
        float total = numero1+numero2;
        String suma = "" + total;
        
        JOptionPane.showMessageDialog(this, "El valor es: " + suma ,"Resultado.", 1);
    }
    
    public static void main(String[] args){
        SumaDeNumeros ventana = new SumaDeNumeros();
        ventana.setVisible(true);
    }
    
}
