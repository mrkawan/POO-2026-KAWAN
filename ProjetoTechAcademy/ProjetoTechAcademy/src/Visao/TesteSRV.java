package Visao;

import Dominio.Colaborador;
import Servico.*;

public class TesteSRV {

    private Colaborador colab;
    private ColaboradorSRV srv;
    
    public void executar(){
        this.listar();
        this.criar();
        this.listar();
        this.alterar();
        this.listar();
        this.excluirPorID();
        this.listar();
    }

    private void listar(){
        System.out.println("\n\n\n\n\n");
        System.out.println("\n********* lISTANDO TUDO ************\n");
        for (Colaborador item : srv.listar()) {
        item.exibir();
      }
    }

    private void criar(){
        System.out.println("\n\n\n");
        System.out.println("\n********* CRIANDO REGISTO ************\n");
        this.colab = new Colaborador(101, "Lula", "555.555.555.555.55", "GAITEIRO");
        srv.criar(colab);
    
    }

    private void alterar(){
        System.out.println("\n\n\n");
        System.out.println("\n********* ALTERANDO REGISTRO ************\n");
        this.colab.setNome("Bolsonaro");
        this.colab = this.srv.alterar(this.colab);
        this.colab.exibir();
    }

    private void excluirPorID(){
        System.out.println("\n\n\n");
        System.out.println("\n********* EXCLUINDO REGISTRO ************\n");
        this.colab = srv.excluirPorID(colab.getCodigo());
        this.colab.exibir();
    }

    public TesteSRV(){
        this.srv = new ColaboradorSRV();
    }
}