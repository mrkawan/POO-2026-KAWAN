package Servico;
import java.util.ArrayList;

import DAO.AlunoDAO;
import Dominio.Aluno;

public class AlunoSRV extends BaseGenericaSRV<Aluno>
{

    @Override
    public ArrayList<Aluno> listar() {
        return this.dao.readAll();
    }

    @Override
    public Aluno criar(Aluno novo) {
        return this.dao.create(novo);
    }

    @Override
    public Aluno buscar(int codigo) {
        return this.dao.readOne(codigo);
    }    
    
    @Override
    public Aluno alterar(Aluno alterado) {
        return this.dao.update(alterado);
    }

    @Override
    public Aluno excluirPorID(int codigo) {
        return this.dao.deletePorID(codigo);
    }

    public AlunoSRV(){
        this.dao = new AlunoDAO();
    }

}
