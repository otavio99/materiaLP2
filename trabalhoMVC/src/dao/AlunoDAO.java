/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.DBConexao;
import model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author andreqbs
 */
public class AlunoDAO{

    private final String INSERT = "INSERT INTO CONTATO (NOME, TELEFONE, EMAIL) "
            + "VALUES (?,?,?)";
    private final String UPDATE = "UPDATE CONTATO SET NOME=?, TELEFONE=?, EMAIL=? WHERE ID=?";
    private final String DELETE = "DELETE FROM CONTATO WHERE ID =?";
    private final String LIST = "SELECT * FROM CONTATO";
    private final String LISTBYID = "SELECT * FROM CONTATO WHERE ID=?";
    private final String CONTAR = "SELECT COUNT(*) as total FROM CONTATO";
    private final String LISTNOMEFONE = "SELECT * FROM CONTATO WHERE NOME=? AND TELEFONE=?";


    public void inserir(Contato contato) {
        if (contato != null) {
            Connection conn = null;
            try {
                conn = DBConexao.getConexao();
                PreparedStatement pstm;
                pstm = conn.prepareStatement(INSERT);

                pstm.setString(1, contato.getNome());
                pstm.setString(2, contato.getTelefone());
                pstm.setString(3, contato.getEmail());

                pstm.execute();
                JOptionPane.showMessageDialog(null, "Contato cadastrado com sucesso");
                DBConexao.fechaConexao(conn, pstm);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir contato no banco de"
                        + "dados " + e.getMessage());
            }
        } else {
            System.out.println("O contato enviado por parâmetro está vazio");
        }
    }

    public void atualizar(Contato contato) {
        if (contato != null) {
            Connection conn = null;
            try {
                conn = DBConexao.getConexao();
                PreparedStatement pstm;
                pstm = conn.prepareStatement(UPDATE);

                pstm.setString(1, contato.getNome());
                pstm.setInt(4, contato.getId());
                pstm.setString(2, contato.getTelefone());
                pstm.setString(3, contato.getEmail());

                pstm.execute();
                JOptionPane.showMessageDialog(null, "Contato alterado com sucesso");
                DBConexao.fechaConexao(conn);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar contato no banco de"
                        + "dados " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "O contato enviado por parâmetro está vazio");
        }

    }

    public void remover(int id) {
        Connection conn = null;
        try {
            conn = DBConexao.getConexao();
            PreparedStatement pstm;
            pstm = conn.prepareStatement(DELETE);

            pstm.setInt(1, id);

            pstm.execute();
            // DBConexao.fechaConexao(conn, pstm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir contato do banco de"
                    + "dados " + e.getMessage());
        }
    }

    public List<Contato> getContatos() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Contato> contatos = new ArrayList<Contato>();
        try {
            conn = DBConexao.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Contato contato = new Contato();

                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setTelefone(rs.getString("telefone"));
                contato.setEmail(rs.getString("email"));
                contatos.add(contato);
            }
            DBConexao.fechaConexao(conn, pstm, rs);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar contatos"
                    + e.getMessage());
        } catch (ClassNotFoundException e) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return contatos;
    }

    public Contato getContatoById(int id) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Contato contato = new Contato();
        try {
            conn = DBConexao.getConexao();
            pstm = conn.prepareStatement(LISTBYID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setTelefone(rs.getString("telefone"));
                contato.setEmail(rs.getString("email"));
            }
            DBConexao.fechaConexao(conn, pstm, rs);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contato;
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
            JOptionPane.showMessageDialog(null, "Erro ao listar contatos"
                    + e.getMessage());
        } catch (ClassNotFoundException e) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return valor;
    }

    public Contato getContatoNomeTel(Contato c) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Contato contato = new Contato();
        try {
            conn = DBConexao.getConexao();
            pstm = conn.prepareStatement(LISTNOMEFONE);
            pstm.setString(1, c.getNome());
            pstm.setString(2, c.getTelefone());
            rs = pstm.executeQuery();
            while (rs.next()) {
                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setTelefone(rs.getString("telefone"));
                contato.setEmail(rs.getString("email"));

            }
            DBConexao.fechaConexao(conn, pstm, rs);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contato;
    }

    public static void main(String[] args) {
        ContatoDAO cdao = new ContatoDAO();
        Contato novo = new Contato();

        novo.setNome("Andre");
        novo.setTelefone("283129");
        novo.setEmail("andre.bezerra@ifms.edu.br");

        //  cdao.inserir(novo);
        //  cdao.remover(5);
        int quantiadde = cdao.getQuantiadde();
        System.out.println(quantiadde);

    }

}
