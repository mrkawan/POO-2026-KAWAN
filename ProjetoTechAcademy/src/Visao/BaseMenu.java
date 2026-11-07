package Visao;

import java.util.Scanner;

public abstract class BaseMenu {
    protected Scanner scan;


    protected int exibirMenuPai(String dominio){
        System.out.println("\n\n");
        System.out.println("----- MENU PRINCIPAL ["+ dominio +"] ------");
        System.out.println("1 - Listar Todos");
        System.out.println("2- Pesquisar por Código");
        System.out.println("3 - Incluir");
        System.out.println("4 - Alterar");
        System.out.println("5 - Excluir");
        System.out.println("9 - Finalizar");
        System.out.print("Escolha uma opção: ");
        int opcao = this.scan.nextInt();
        this.scan.nextLine();
        return opcao;
    }

    protected void pausar(){
        System.out.println("Clique <ENTER> para continuar...");
        this.scan.nextLine();
    }
}
