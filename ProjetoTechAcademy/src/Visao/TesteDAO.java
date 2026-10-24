package Visao;

import DAO.*;
import Dominio.*;


public class TesteDAO {

    private Colaborador colab;
    private ColaboradorDAO dao;
    
    public void executar(){
        this.listar();
        this.criar();
        this.listar();
        this.alterar();
        this.listar();
        this.excluir();
        this.listar();
    }

    private void listar(){
        System.out.println("\n\n\n\n\n");
        System.out.println("\n********* lISTANDO TUDO ************\n");
        for (Colaborador item : dao.readAll()) {
        item.exibir();
      }
    }

    private void criar(){
        System.out.println("\n\n\n");
        System.out.println("\n********* CRIANDO REGISTO ************\n");
        this.colab = new Colaborador(101, "Lula", "555.555.555.555.55", "GAITEIRO");
        dao.create(colab);
    
    }

    private void alterar(){
        System.out.println("\n\n\n");
        System.out.println("\n********* ALTERANDO REGISTRO ************\n");
        this.colab.setNome("Bolsonaro");
        this.colab = this.dao.update(this.colab);
        this.colab.exibir();
    }

    private void excluir(){
        System.out.println("\n\n\n");
        System.out.println("\n********* EXCLUINDO REGISTRO ************\n");
        this.colab = dao.delete(colab);
        this.colab.exibir();
    }

    public TesteDAO(){
        this.dao = new ColaboradorDAO();
    }

}
