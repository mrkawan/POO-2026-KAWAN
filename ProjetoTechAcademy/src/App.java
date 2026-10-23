import FakeDB.AlunoFakeDB;
import FakeDB.ColaboradorFakeDB;
import DAO.ColaboradorDAO;
import Dominio.*;

public class App {
    public static void main(String[] args) throws Exception {
      Colaborador clb = new Colaborador(101, "Lula", "555.555.555.555.55", "GAITEIRO");

      ColaboradorDAO dao = new ColaboradorDAO();
      for (Colaborador item : dao.readAll()) {
        item.exibir();
      }

      dao.create(clb);
      
      for (Colaborador item : dao.readAll()) {
        item.exibir();
      }

    }
}
