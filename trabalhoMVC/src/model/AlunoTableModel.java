
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Aluno;

/**
 *
 * @author andreqbs
 */
public class AlunoTableModel extends AbstractTableModel{
    
    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private static final int COL_ENDERECO = 2;
    private static final int COL_TELEFONE = 3;
    private static final int COL_CPF = 4;
    private static final int COL_DESCONTO = 5;
    
    List<Aluno> linhas;
    private final String[] colunas = new String[] {"Id", "Nome", "Endereco", "Telefone", "Cpf", "Desconto"};
 
    public AlunoTableModel(List<Aluno> alunos) {
        this.linhas = new ArrayList<>(alunos);
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
        Aluno a = linhas.get(row);
        switch (column) {
            case COL_ID:
                return a.getCod();
            case COL_NOME:
                return a.getNome();
            case COL_ENDERECO:
                return a.getEndereco();
            case COL_TELEFONE:
                return a.getTelefone();
            case COL_CPF:
                return a.getCpf();
            case COL_DESCONTO:
                return a.getDesconto();
            default:
                break;
        }
        return "";
    }
 
    @Override
    public void setValueAt(Object aValue, int row, int column) {
        Aluno a = linhas.get(row);
        switch (column) {
            case COL_ID:
                a.setCod((Integer) aValue);
            case COL_NOME:
                a.setNome(aValue.toString());
            case COL_ENDERECO:
                a.setEndereco(aValue.toString());
            case COL_TELEFONE:
                a.setTelefone(aValue.toString());
            case COL_CPF:
                a.setCpf(aValue.toString());
            case COL_DESCONTO:
                a.setDesconto((float) aValue);
            default:
                break;
        }
    }
 
    public Aluno getAluno(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
 
    public void addAluno(Aluno aluno) {
        linhas.add(aluno);
        fireTableDataChanged();
 
    }
 
    public void updateAluno(int indiceLinha, Aluno aluno) {
        linhas.set(indiceLinha, aluno);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
 
    }
 
    public void removeAluno(int indiceLinha) {
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
 
    }
}
