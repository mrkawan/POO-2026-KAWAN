package FakeDB;

import java.util.ArrayList;

import Dominio.ProfessorEfetivo;

public class ProfessorEfetivoFakeDB {
    private ArrayList<ProfessorEfetivo> dados;

    public ArrayList<ProfessorEfetivo> getDados() {
        return dados;
    }

    private void autoPreencher(){
        this.dados.add(new ProfessorEfetivo(01, "PAULO", "066.066.066.01", 1500.0));
        this.dados.add(new ProfessorEfetivo(01, "JOAQUIM", "066.066.066.02", 2500.0));
        this.dados.add(new ProfessorEfetivo(01, "MURILO", "066.066.066.03", 3500.0));
        
    }

    public ProfessorEfetivoFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }
}
