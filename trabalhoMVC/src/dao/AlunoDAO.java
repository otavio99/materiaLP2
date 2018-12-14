/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.DBConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Aluno;

/**
 *
 * @author andreqbs
 */
public class AlunoDAO{

    private final String INSERT = "insert into pessoa(nome, endereco, telefone, cpf)"
            + "values(?,?,?,?); "
            + "insert into aluno(codPessoa,desconto)"
            + "values(?,?);";
     
    private final String UPDATE = "UPDATE aluno SET NOME=?, TELEFONE=?, EMAIL=? WHERE ID=?";
    private final String DELETE = "DELETE FROM aluno WHERE ID =?";
    private final String LIST = "SELECT * FROM aluno";
    private final String LISTBYID = "SELECT * FROM aluno WHERE ID=?";
    private final String CONTAR = "SELECT COUNT(*) as total FROM aluno";
    private final String LISTNOMEFONE = "SELECT * FROM aluno WHERE NOME=? AND TELEFONE=?";


    public void inserir(Aluno aluno) {
        if (aluno != null) {
            Connection conn = null;
            try {
                conn = DBConexao.getConexao();
                PreparedStatement pstm;
                pstm = conn.prepareStatement(INSERT);
                String idAnterior= "LAST_INSERT_ID()";
                pstm.setString(1, aluno.getNome());
                pstm.setString(2, aluno.getEndereco());
                pstm.setString(3, aluno.getTelefone());
                pstm.setString(4, aluno.getCpf());
                pstm.setString(5, idAnterior);
                pstm.setFloat(6, aluno.getDesconto());
                
            
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso");
                DBConexao.fechaConexao(conn, pstm);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir aluno no banco de"
                        + "dados " + e.getMessage());
            }
        } else {
            System.out.println("O aluno enviado por parâmetro está vazio");
        }
    }

    public void atualizar(Aluno aluno) {
        if (aluno != null) {
            Connection conn = null;
            try {
                conn = DBConexao.getConexao();
                PreparedStatement pstm;
                pstm = conn.prepareStatement(UPDATE);

                pstm.setInt(1, aluno.getCod());
                pstm.setString(2, aluno.getNome());
                pstm.setString(3, aluno.getEndereco());
                pstm.setString(4, aluno.getTelefone());
                pstm.setString(5, aluno.getCpf());
                pstm.setFloat(6, aluno.getDesconto());

                pstm.execute();
                JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso");
                DBConexao.fechaConexao(conn);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar aluno no banco de"
                        + "dados " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "O aluno enviado por parâmetro está vazio");
        }

    }

    public void remover(int cod) {
        Connection conn = null;
        try {
            conn = DBConexao.getConexao();
            PreparedStatement pstm;
            pstm = conn.prepareStatement(DELETE);

            pstm.setInt(1, cod);

            pstm.execute();
            // DBConexao.fechaConexao(conn, pstm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir aluno do banco de"
                    + "dados " + e.getMessage());
        }
    }

    public List<Aluno> getAlunos() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        try {
            conn = DBConexao.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Aluno aluno = new Aluno();

                aluno.setCod(rs.getInt("cod"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setTelefone(rs.getString("telefone"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setDesconto(rs.getFloat("desconto"));
                alunos.add(aluno);
            }
            DBConexao.fechaConexao(conn, pstm, rs);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar aluno"
                    + e.getMessage());
        } catch (ClassNotFoundException e) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return alunos;
    }

    public Aluno getAlunoById(int id) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Aluno aluno = new Aluno();
        try {
            conn = DBConexao.getConexao();
            pstm = conn.prepareStatement(LISTBYID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                aluno.setCod(rs.getInt("cod"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setTelefone(rs.getString("telefone"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setDesconto(rs.getFloat("desconto"));
            }
            DBConexao.fechaConexao(conn, pstm, rs);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar aluno" + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aluno;
    }

    public int getQuantiadde() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs;
        int valor = 0;
        try {
            conn = DBConexao.getConexao();
            pstm = conn.prepareStatement(CONTAR);
            rs = pstm.executeQuery();
            while (rs.next()) {

                valor = rs.getInt("total");
            }
            DBConexao.fechaConexao(conn, pstm, rs);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao calcular"
                    + e.getMessage());
        } catch (ClassNotFoundException e) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return valor;
    }

/*
    public Aluno getAlunoNomeTel(Aluno c) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Aluno aluno = new Aluno();
        try {
            conn = DBConexao.getConexao();
            pstm = conn.prepareStatement(LISTNOMEFONE);
            pstm.setString(1, c.getNome());
            pstm.setString(2, c.getTelefone());
            rs = pstm.executeQuery();
            while (rs.next()) {
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setTelefone(rs.getString("telefone"));

            }
            DBConexao.fechaConexao(conn, pstm, rs);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar aluno" + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aluno;
    }
    */

    public static void main(String[] args) {
        AlunoDAO cdao = new AlunoDAO();
        Aluno novo = new Aluno("oo0","ooi","ihkuhkj","kkjll","jhbj",23423);

        novo.setDesconto(100);


         cdao.inserir(novo);
        //  cdao.remover(5);
        //int quantiadde = cdao.getQuantiadde();
        //System.out.println(quantiadde);

    }

}
