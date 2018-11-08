/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifms.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author andreqbs
 */
public class ContatoTableModel extends AbstractTableModel{
    
    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private static final int COL_TELEFONE = 2;
    private static final int COL_EMAIL = 3;
    
    List<Contato> linhas;
    private final String[] colunas = new String[] {"Id", "Nome", "Telefone", "Email"};
 
    public ContatoTableModel(List<Contato> contatos) {
        this.linhas = new ArrayList<>(contatos);
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
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
 
    @Override
    public Class getColumnClass(int columnIndex) {
        if (columnIndex == COL_ID) {
            return Integer.class;
        }
        return String.class;
    }
 
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
 
    @Override
    public Object getValueAt(int row, int column) {
        Contato m = linhas.get(row);
        switch (column) {
            case COL_ID:
                return m.getId();
            case COL_NOME:
                return m.getNome();
            case COL_TELEFONE:
                return m.getTelefone();
            case COL_EMAIL:
                return m.getEmail();
            default:
                break;
        }
        return "";
    }
 
    @Override
    public void setValueAt(Object aValue, int row, int column) {
        Contato u = linhas.get(row);
        switch (column) {
            case COL_ID:
                u.setId((Integer) aValue);
                break;
            case COL_NOME:
                u.setNome(aValue.toString());
                break;
            case COL_TELEFONE:
                u.setTelefone(aValue.toString());
                break;
            case COL_EMAIL:
                u.setEmail(aValue.toString());
                break;
            default:
                break;
        }
    }
 
    public Contato getContato(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
 
    public void addContato(Contato contato) {
        linhas.add(contato);
        fireTableDataChanged();
 
    }
 
    public void updateContato(int indiceLinha, Contato marca) {
        linhas.set(indiceLinha, marca);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
 
    }
 
    public void removeContato(int indiceLinha) {
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
 
    }
}
