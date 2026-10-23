package DAO;

import Dominio.Professor;
import FakeDB.ProfessorFakeDB;

public class ProfessorDAO extends BaseGenericaDAO<Professor> {

    @Override
    public Professor create(Professor novo) {
        int codigoAtual = this.repositorio.getLast().getCodigo();
        int codigoNovo = codigoAtual + 1;
        novo.setCodigo(codigoNovo);
        this.repositorio.add(novo);
        return novo;
    }

    @Override
    public Professor delete(Professor apagado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Professor deletePorID(int codigo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Professor readOne(int codigo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Professor update(Professor alterado) {
        // TODO Auto-generated method stub
        return null;
    }
    
    public ProfessorDAO(){
        this.fonteDados = new ProfessorFakeDB();
        this.repositorio = this.fonteDados.getDados();
    }
    
}
