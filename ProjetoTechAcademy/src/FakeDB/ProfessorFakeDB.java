package FakeDB;

import java.util.ArrayList;

import Dominio.Professor;

public class ProfessorFakeDB extends BaseGenericaFakeDB<Professor> {

    @Override 
    protected void autoPreencher(){
        this.dados.add(new Professor(201, "SOFIA", "444.444.444.01", 1500.0));
        this.dados.add(new Professor(201, "AURORA", "444.444.444.02", 2500.0));
        this.dados.add(new Professor(201, "ANA", "444.444.444.03", 3500.0));
    }

    public ProfessorFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }
}
