package FakeDB;
import java.util.ArrayList;

import Dominio.*;

public class AlunoFakeDB extends BaseGenericaFakeDB<Aluno>{
    
    @Override 
    protected void autoPreencher(){
        this.dados.add(new Aluno(102, "KAWAN", "055.055.055.01", "01"));
        this.dados.add(new Aluno(103, "PEDRO", "055.055.055.02", "02")); 
        this.dados.add(new Aluno(104, "JOÃO", "055.055.055.03", "03"));
        this.dados.add(new Aluno(105, "BRENO", "055.055.055.04", "04"));
        this.dados.add(new Aluno(106, "NICOLAS", "055.055.055.05", "05"));
    }

    public AlunoFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }
}
