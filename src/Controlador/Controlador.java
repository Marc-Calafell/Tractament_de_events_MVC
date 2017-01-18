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

public class Controlador{

    private Model m;
    private VistaLlista v;

    
        public Controlador(Model m, VistaLlista v) {
        this.m = m;
        this.v = v;
        this.v.setVisible(true);
        v.getItemField().setText("Element 1");
        control1(m,v);
        
    }

    
        
        public void control1(Model m, VistaLlista v) {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    m.setItemList(String.valueOf(v.getItemField()));
                    v.getItemList().setSelectedValue(e, true);
                } catch (NumberFormatException ex) {
                    v.getItemField().setText("No es correcte");
                }

            }

        };
        v.getAddButton().addActionListener(al);

    }
    
}
