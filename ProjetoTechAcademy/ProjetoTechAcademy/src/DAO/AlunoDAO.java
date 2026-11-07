package DAO;

import Dominio.Aluno;
import FakeDB.AlunoFakeDB;

public class AlunoDAO extends BaseGenericaDAO<Aluno> {

    @Override
    public Aluno create(Aluno novo) {
        int codigoAtual = this.repositorio.getLast().getCodigo();
        int codigoNovo = codigoAtual + 1;
        novo.setCodigo(codigoNovo);
        this.repositorio.add(novo);
        return novo;
    }

    @Override
    public Aluno delete(Aluno apagado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Aluno deletePorID(int codigo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Aluno readOne(int codigo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Aluno update(Aluno alterado) {
        // TODO Auto-generated method stub
        return null;
    }

    public AlunoDAO(){
        this.fonteDados = new AlunoFakeDB();
        this.repositorio = this.fonteDados.getDados();
    }
    
    

}
