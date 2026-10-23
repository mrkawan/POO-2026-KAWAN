package Dominio;

// ProfessorEfetivo.java
public class ProfessorEfetivo extends Professor {
    private double trienio;

    public double getTrienio() {
        return this.trienio;
    }

    public void setTrienio(double trienio) {
        this.trienio = trienio;
    }

    @Override
    public void exibir() {
        System.out.println("[PROFESSOR EFETIVO] Nome: " + this.nome);
        System.out.print("| CPF: " + cpf);
        System.out.print("| Salário: R$ " + getSalario());
        System.out.print("| Bonificação: " + this.calcularBonificacao(300.0));
        System.out.println("| Triênio: " + this.trienio);
    }

    public double calcularBonificacao(double trienio) {
        this.trienio = trienio;
        return ((getSalario() * 0.10) + 300.0);
    }

    public ProfessorEfetivo(){};

    public ProfessorEfetivo(int codigo, String nome, String cpf, double salario) {
    super(codigo, nome, cpf, salario);
    }

}