/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp;

/**
 *
 * @author luis Diego Jimenez Delgado  Alejandro Emanuel Rangel Mendez
 * grupo: 5IM6
 * fecha :25/08/17
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ventana extends JFrame {
    private JTextField numb ,numba;
    private JButton covertir;
    private JLabel titulo, mensaje, numbTitulo, numaTitulo;
    private JRadioButton fibonacci, factorial;
    private ButtonGroup grupo;
    private boolean opcionSeleccionada = true;
    
    public ventana(){
        
        //Se crea la ventana 
        JFrame window = new JFrame();
        window.setLayout(null);
        window.setBounds(100,100,400,400);
        window.setLayout(null);
        //window.setBackground(new Color(0,0,0,124));
        window.setResizable(false);
        
        titulo = new JLabel("<html> <font color = black size = 4 face= 'Calisto MT'>Soy un titulo ");
        titulo.setSize(350,40);
        titulo.setLocation(25, 10);
        window.add(titulo);
        
        
        numba = new JTextField();
        numba.setSize(250,20);
        numba.setLocation(125,100);
        window.add(numba);
        KeyListener B;
        B = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String event = "" + (e.getKeyChar());
                if (!(event.equals("1") || event.equals("0") || event.equals("2") || event.equals("3") || event.equals("4") ||  event.equals("5") || event.equals("6") || event.equals("7") ||  event.equals("8") || event.equals("9") ||   e.getKeyCode() == 8)){
                    System.out.println(e.getKeyCode());
                    e.consume();
                }
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
               String event = "" + (e.getKeyChar());
                if (!(event.equals("1") || event.equals("0") || event.equals("2") || event.equals("3") || event.equals("4") ||  event.equals("5") || event.equals("6") || event.equals("7") ||  event.equals("8") || event.equals("9") ||   e.getKeyCode() == 8)){
                    System.out.println(e.getKeyCode());
                    e.consume();
                }
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                String event = "" + (e.getKeyChar());
                if (!(event.equals("1") || event.equals("0") || event.equals("2") || event.equals("3") || event.equals("4") ||  event.equals("5") || event.equals("6") || event.equals("7") ||  event.equals("8") || event.equals("9") ||   e.getKeyCode() == 8)){
                    System.out.println(e.getKeyCode());
                    e.consume();
                }
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        numba.addKeyListener(B);
        
        numb = new JTextField();
        numb.setSize(250,20);
        numb.setLocation(125,150);
        window.add(numb);
     
        numb.addKeyListener(B);
        covertir = new JButton("Convertir");
        covertir.setSize(80,20);
        covertir.setLocation(160, 230);
        window.add(covertir);
        //Boton para convertir 
        covertir.addActionListener((ActionEvent e) -> {
            int numeroA =  Integer.parseInt(numba.getText());
            int numeroB = Integer.parseInt(numb.getText());
            if (!("".equals(numeroA) && "".equals(numeroB) )){
                DesarrolloBinomio binomio = new DesarrolloBinomio();
                String number = binomio.desarrolla(numeroA,numeroB);
                mensaje.setText(number);
            }
            else{
                mensaje.setText("<html><body><center><font color= 'red'>Ingresa en numero decimal");
            }
            

        });
        //Mensajes
        
        mensaje = new JLabel("");
        mensaje.setSize(350,20);
        mensaje.setLocation(25,300);
        window.add(mensaje);
        
        //Titulos
        numbTitulo = new JLabel("Coeficiente B:");
        numbTitulo.setLocation(25,150);
        numbTitulo.setSize(100,20);
        window.add(numbTitulo);
        
        numaTitulo = new JLabel("Coeficiente A:");
        numaTitulo.setLocation(25,100);
        numaTitulo.setSize(100,20);
        window.add(numaTitulo);
        

        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        window.setVisible(true);        
    }



}

