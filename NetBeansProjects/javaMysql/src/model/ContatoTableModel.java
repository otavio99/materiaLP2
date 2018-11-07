package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 07379853139
 */
public class ContatoTableModel extends AbstractTableModel{
    private static final int COL_ID= 0;
    private static final int COL_NOME= 1;
    private static final int COL_TELEFONE= 2;
    private static final int COL_EMAIL= 3;
    
    List<Contato> linhas;
    private final String[] colunas= {"Id", "Nome", "Telefone", "Email"};
    
    public ContatoTableModel(List<Contato> Contatos){
        this.linhas= new ArrayList<>(Contatos);
    }
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }
    
    @Override
    public Class getColumnClass(int columnIndex){
        if(columnIndex == COL_ID){
            return Integer.class;
        }
        
        return String.class;
    }

    @Override
    public Object getValueAt(int row, int column) {
       Contato m= linhas.get(row);
      
       return m;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int ColumnIndex){
        return false;
    }
    
    
}
