package Servico;
import java.util.ArrayList;
import DAO.ProfessorEfetivoDAO;
import Dominio.ProfessorEfetivo;

public class ProfessorEfetivoSRV extends BaseGenericaSRV<ProfessorEfetivo> {
 
    @Override 
    public ArrayList<ProfessorEfetivo> listar(){
        return this.dao.readAll();
    }

    @Override 
    public ProfessorEfetivo criar(ProfessorEfetivo novo){
        return this.dao.create(novo);
    }

    @Override 
    public ProfessorEfetivo buscar(int codigo){
        return this.dao.readOne(codigo);
    }

    @Override 
    public ProfessorEfetivo alterar(ProfessorEfetivo alterado){
        return this.dao.update(alterado);
    }

    @Override
    public ProfessorEfetivo excluirPorID(int codigo){
        return this.dao.deletePorID(codigo);
    }
    
    public ProfessorEfetivoSRV(){
        this.dao = new ProfessorEfetivoDAO();
    }
}
