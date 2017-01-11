/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Model.Model;
import Vista.VistaLlista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mark
 */

public class Controlador {
    private Model m;
    private VistaLlista v;
    
    
    public Controlador(Model m, VistaLlista v){
        this.m=m;
        this.v=v;
        
        this.v.setVisible(true);
       v.getItemField().setText("your TODO here");
    
    
       addtodo(m,v);
       }
       
    
    public void addtodo(Model m, VistaLlista v){
       
       ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                    m.setTodo(String.valueOf(v.getItemField().getText()));
                   // v.llista.addElement(m.getTodo());
                   
                   v.getResultat().setText("= " + m.getTodo());
                    
                     //m.setTodo(v.ItemField.getText());
         
         //llista.addElement(Item);
                
            }

        };
        
        
        
        
        
    }
       
    
    
       
       
    }
