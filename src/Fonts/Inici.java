/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fonts;

import Controlador.Controlador;
import Model.Model;
import Vista.VistaLlista;

/**
 *
 * @author mark
 */
public class Inici {
    
    private static final Model m=new Model();
    private static final VistaLlista v=new VistaLlista();
    private static Controlador c;
    
    
    public static void main(String[] args){
        
    c = new Controlador(m,v);    
        
    }
    
}
