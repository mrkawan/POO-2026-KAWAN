package DAO;

import Dominio.Colaborador;
import FakeDB.ColaboradorFakeDB;

public class ColaboradorDAO extends BaseGenericaDAO<Colaborador> {

    @Override
    public Colaborador create(Colaborador novo) {
        int codigoAtual = this.repositorio.getLast().getCodigo();
        int codigoNovo = codigoAtual + 1;
        novo.setCodigo(codigoNovo);
        this.repositorio.add(novo);
        return novo;
    }

    @Override
    public Colaborador readOne(int codigo) {
        for (Colaborador item : this.repositorio) {
            if (item.getCodigo() == codigo){
                return item;
            }
        }
        return null;
    }

    @Override
    public Colaborador update(Colaborador alterado) {
        int codigoProcurado = alterado.getCodigo();
        if(this.readOne(codigoProcurado) != null){
            int indice = this.repositorio.indexOf(alterado);
            this.repositorio.set(indice, alterado);
            return alterado;
        }
        return null;
    }

        @Override
    public Colaborador delete(Colaborador apagado) {
        int codigoParaApagar = apagado.getCodigo();
        return this.deletePorID(codigoParaApagar);
    }

    @Override
    public Colaborador deletePorID(int codigo) {
        Colaborador paraApagar = this.readOne(codigo);
        if(paraApagar != null){
            this.repositorio.remove(paraApagar);
            return paraApagar;
        }
        return null;
    }

    public ColaboradorDAO(){
        this.fonteDados = new ColaboradorFakeDB();
        this.repositorio = this.fonteDados.getDados();
    }
    
}
