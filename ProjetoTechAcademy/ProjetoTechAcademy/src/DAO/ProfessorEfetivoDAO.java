package DAO;

import Dominio.ProfessorEfetivo;
import FakeDB.ProfessorEfetivoFakeDB;

public class ProfessorEfetivoDAO extends BaseGenericaDAO<ProfessorEfetivo> {

    @Override
    public ProfessorEfetivo create(ProfessorEfetivo novo) {
        int codigoAtual = this.repositorio.getLast().getCodigo();
        int codigoNovo = codigoAtual +1;
        novo.setCodigo(codigoNovo);
        this.repositorio.add(novo);
        return novo;

    }

    @Override
    public ProfessorEfetivo delete(ProfessorEfetivo apagado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProfessorEfetivo deletePorID(int codigo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProfessorEfetivo readOne(int codigo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProfessorEfetivo update(ProfessorEfetivo alterado) {
        // TODO Auto-generated method stub
        return null;
    }
    
    public ProfessorEfetivoDAO(){
        this.fonteDados = new ProfessorEfetivoFakeDB();
        this.repositorio = this.fonteDados.getDados();
    }
    
}
