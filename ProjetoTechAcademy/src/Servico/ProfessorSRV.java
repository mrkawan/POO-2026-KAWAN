package Servico;
import java.util.ArrayList;
import DAO.ProfessorDAO;
import Dominio.Professor;

public class ProfessorSRV extends BaseGenericaSRV<Professor> {
    
    @Override
    public ArrayList<Professor> listar() {
        return this.dao.readAll();
    }

    @Override
    public Professor criar(Professor novo) {
        return this.dao.create(novo);
    }

    @Override
    public Professor buscar(int codigo) {
        return this.dao.readOne(codigo);
    }
    
    @Override
    public Professor alterar(Professor alterado) {
        return this.dao.update(alterado);
    }

    @Override
    public Professor excluirPorID(int codigo) {
        return this.dao.deletePorID(codigo);
    }

    public ProfessorSRV(){
        this.dao = new ProfessorDAO();
    }
}
