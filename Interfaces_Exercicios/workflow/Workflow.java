import atividades.*;

import java.util.ArrayList;
import java.util.List;

public class Workflow {
    List<Atividade>atividades = new ArrayList<>();
    public void registrarAtividade(Atividade atividade) {
        this.atividades.add(atividade);
    }
}
