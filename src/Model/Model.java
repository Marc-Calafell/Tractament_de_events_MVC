/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.*;
import javax.swing.AbstractListModel;

/**
 *
 * @author mark
 */
public class Model extends AbstractListModel{
    
    
public final List<String> todo = new ArrayList<>();


    public Model(){
        
        String el1 = "Todo 1";
        String el2 = "Todo 2";
        
        todo.add(el1);
        todo.add(el2);
    }
    
 
@Override
    public int getSize() {
        return todo.size();
    }
    
@Override
    public Object getElementAt(int index){
        
        return todo.get(index);
    }
    
    
    
    public void addElement(String x){
        
        todo.add(x);
       fireContentsChanged(this, 0, todo.size());
    }
    
    
    
    public void dropTodo(Object o) {
        try {
            todo.remove(o);
           fireContentsChanged(this, 0, todo.size());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No has seleccionat cap Item");
        }
    }

    public void clearAll() {
        todo.removeAll(todo);
       fireContentsChanged(this, 0, todo.size());
    }

    public void exitTodo() {
        System.exit(0);
    }

}
