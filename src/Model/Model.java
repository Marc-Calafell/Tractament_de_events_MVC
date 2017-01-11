/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author mark
 */
public class Model {
    
    private String ItemField;
    private String[] llista;

    public Model(String todo, String[] llista) {
        this.ItemField = todo;
        this.llista = llista;
    }

    public String getItemField() {
        return ItemField;
    }

    public void setItemField(String ItemField) {
        this.ItemField = ItemField;
    }

    public String[] getLlista() {
        return llista;
    }

    public void setLlista(String[] llista) {
        this.llista = llista;
    }

    
    
    
    
}
