package Dominio;

// Professor.java
public class Professor extends BasePessoa {
    private double salario;


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    // Implementação do método abstrato herdado
    @Override
    public void exibir() {
        System.out.println("[PROFESSOR] Nome: " + this.nome);
        System.out.print("| CPF: " + cpf);
        System.out.print("| Salário: R$ " + salario);
        System.out.println("| Bonificação: " + this.calcularBonificacao());
    }

    // Método próprio da classe Professor
    public double calcularBonificacao() {
        return this.salario * 0.10; // 10% de bônus padrão
    }

    public Professor(){};

    public Professor(int codigo, String nome, String cpf, double salario){
        super(codigo, nome, cpf);
        this.salario = salario;
    }
    
}