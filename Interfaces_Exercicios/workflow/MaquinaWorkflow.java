import atividades.*;

public class MaquinaWorkflow {
    public void executar(Workflow workflow){
        for(Atividade atividade : workflow.atividades){
            atividade.executar();
        }
    }
}
