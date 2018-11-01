/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 07379853139
 */
public class DBConexao {
    
    private static final String USUARIO= "root";
    private static final String SENHA= "";
    private static final String DATABASE= "agenda";
    private static final String DRIVER_CONEXAO= "com.mysql.jdbc.Driver";
    private static final String STR_CONEXAO= "jdbc:mysql://localhost:3306/";
    
    public static Connection getConexao() throws SQLException, ClassNotFoundException{
        Connection conn= null;
        
        try{
            Class.forName(DRIVER_CONEXAO);
            conn= DriverManager.getConnection(STR_CONEXAO + DATABASE, USUARIO, SENHA);
            
            return conn;
        }catch(ClassNotFoundException e){
            throw new ClassNotFoundException("Driver MySql não foi encontrado " + e.getMessage());
        }catch(SQLException e){
            throw new SQLException("Erro ao conectar " + "com a base de dados" + e.getMessage());
        }
    }
    
    
    public static void fechaConexao(Connection conn){
        try{
           
            if(conn != null){
                conn.close();
                System.out.println("Connection fechado com sucesso");
            }
        } catch (Exception e){
            System.out.println("Não foi possível fechar o Connection" + e.getMessage());
        }
    }
    
    public static void fechaConexao(Connection conn, PreparedStatement stmt){
        try{
            if(conn != null || stmt !=null){
                fechaConexao(conn);
            }
            if(stmt != null){
                stmt.close();
                System.out.println("PreparedStatement fechado com sucesso");
            }
        } catch (Exception e){
            System.out.println("Não foi possível fechar o PreparedStatement" + e.getMessage());
        }
    }
    
    public static void fechaConexao(Connection conn, PreparedStatement stmt, ResultSet rs){
        try{
            if(conn != null || stmt !=null){
                fechaConexao(conn, stmt);
            }
            if(rs != null){
                rs.close();
                System.out.println("ResultSet fechado com sucesso");
            }
        } catch (Exception e){
            System.out.println("Não foi possível fechar o ResultSet" + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        try {
            DBConexao.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(DBConexao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
