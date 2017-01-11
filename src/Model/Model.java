/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.DefaultListModel;

/**
 *
 * @author mark
 */
public class Model {
    
    private String todo;
    private String[] llista;

    public Model(String todo, String[] llista) {
        this.todo = todo;
        this.llista = llista;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String[] getLlista() {
        return llista;
    }

    public void setLlista(String[] llista) {
        this.llista = llista;
    }

    public void addllista(){
    llista  = new DefaultListModel();
       ItemList.setModel(llista);
    
    }
    
    
    
    
}
