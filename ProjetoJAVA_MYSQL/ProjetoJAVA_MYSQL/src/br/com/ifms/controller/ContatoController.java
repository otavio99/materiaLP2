/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifms.controller;

import br.com.ifms.dao.ContatoDAO;
import br.com.ifms.model.Contato;
import java.util.List;

/**
 *
 * @author andreqbs
 */
public class ContatoController {

    public void adicionar(String nome, String telefone, String email) {

        Contato c = new Contato();
        c.setNome(nome);
        c.setTelefone(telefone);
        c.setEmail(email);

        ContatoDAO dao = new ContatoDAO();
        dao.inserir(c);

    }

    public void remover(int idContato) {

        ContatoDAO dao = new ContatoDAO();
        dao.remover(idContato);
    }

    public void atualizar(int id, String nome, String telefone, String email) {

        Contato c = new Contato();
        c.setId(id);
        c.setNome(nome);
        c.setTelefone(telefone);
        c.setEmail(email);
        ContatoDAO dao = new ContatoDAO();
        dao.atualizar(c);

    }

    public List<Contato> listar() {
        ContatoDAO dao = new ContatoDAO();
        return dao.getContatos();
    }
    
    public Contato listarContato(int id) {
        ContatoDAO dao = new ContatoDAO();
        Contato contato = dao.getContatoById(id);
        return contato;
       
    }
    
    public Contato listarContato(Contato c) {
        ContatoDAO dao = new ContatoDAO();
        Contato contato = dao.getContatoNomeTel(c);
        return contato;
       
    }
}
