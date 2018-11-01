/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.Contato;
import banco.DBConexao;
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
 * @author 07379853139
 */
public class ContatoDAO {
    
    private final String INSERT= "INSERT INTO contato(nome, telefone, email) VALUES(?,?,?)";
    private final String LIST= "SELECT * FROM contato";
    private final String LISTBYID= "SELECT * FROM contato WHERE id=?";
    private final String DELETE= "DELETE FROM contato WHERE id=?";
    private final String UPDATE= "UPDATE CONTATO SET nome=?, telefone=?, email=? WHERE id=?";
    private final String CONTAR= "SELECT COUNT(*) as total FROM contato";
    
    
    
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
     
    public List<Contato> getContatos(){
        Connection conn = null;
        PreparedStatement pstm;
        ResultSet rs= null;
        ArrayList<Contato> contatos= new ArrayList<Contato>();
        
        try {
            conn = DBConexao.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs= pstm.executeQuery();
            
            while(rs.next()){
                Contato contato= new Contato();
                
                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setTelefone(rs.getString("telefone"));
                contato.setEmail(rs.getString("email"));
                contatos.add(contato);
            }
            DBConexao.fechaConexao(conn, pstm, rs);
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
        } catch(ClassNotFoundException e){
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return contatos;
    }
    
    public Contato getContatosById(int id){
        Connection conn = null;
        PreparedStatement pstm;
        ResultSet rs= null;
        ArrayList<Contato> contatos= new ArrayList<Contato>();
        Contato contato= new Contato();
        try {
            conn = DBConexao.getConexao();
            pstm = conn.prepareStatement(LISTBYID);
            pstm.setInt(1, id);
            pstm.execute();
            rs= pstm.executeQuery();
            
            
            rs.next();
            contato.setId(rs.getInt("id"));
            contato.setNome(rs.getString("nome"));
            contato.setTelefone(rs.getString("telefone"));
            contato.setEmail(rs.getString("email"));
          
            DBConexao.fechaConexao(conn, pstm, rs);
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
        } catch(ClassNotFoundException e){
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return contato;
    }
     
    public void remover(int id){
        Connection conn= null;
        try{
            conn= DBConexao.getConexao();
            PreparedStatement pstm;
            pstm= conn.prepareStatement(DELETE);
            pstm.setInt(1, id);
            pstm.execute();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir contato do bancode dados" + e.getMessage());
        }
    }
    
    public void atualizar(Contato contato){
        if (contato != null) {
            Connection conn = null;
            try {
                conn = DBConexao.getConexao();
                PreparedStatement pstm;
                pstm = conn.prepareStatement(UPDATE);

                pstm.setString(1, contato.getNome());
                pstm.setString(2, contato.getTelefone());
                pstm.setString(3, contato.getEmail());
                pstm.setInt(4, contato.getId());
                pstm.execute();

                JOptionPane.showMessageDialog(null, "Contato atualizado com sucesso");

               DBConexao.fechaConexao(conn, pstm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar contato no banco de"
                        + "dados " + e.getMessage());
            }

        } else {

            System.out.println("O contato enviado por parâmetro está vazio");
        }
    }
    
    public int contar(){
        Connection conn = null;
        PreparedStatement pstm;
        ResultSet rs= null;
        ArrayList<Contato> contatos= new ArrayList<Contato>();
        int total= 0;
        try {
            conn = DBConexao.getConexao();
            pstm = conn.prepareStatement(CONTAR);
            rs= pstm.executeQuery();
            
            rs.next();
            total= rs.getInt("total");
               
            
            DBConexao.fechaConexao(conn, pstm, rs);
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage());
        } catch(ClassNotFoundException e){
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return total;
    }
    
    public static void main(String args[]){
        ContatoDAO cdao= new ContatoDAO();
        Contato contato = new Contato();
        List<Contato> contatos= cdao.getContatos();
        contato.setNome("ana");
        contato.setTelefone("12323");
        contato.setEmail("otavio@gmail.com");
        //cdao.inserir(contato);
        //cdao.remover(5);
        
        /*for(int i=0; i<contatos.size(); i++){
            contato= contatos.get(i);
            System.out.println(contato.getId()+"-"+contato.getNome());
        }*/
        
        /*for(Contato x : contatos) {
            System.out.println(x.getId()+"-"+x.getNome());
        }*/
        
        /*Contato novo= cdao.getContatosById(2);
        novo.setNome("elizandra");
        novo.setTelefone("12323");
        novo.setEmail("eli@gmail.com");
        cdao.atualizar(novo);*/
        
        System.out.println(cdao.contar());
    }

}
