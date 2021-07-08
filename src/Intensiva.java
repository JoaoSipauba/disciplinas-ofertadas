public class Intensiva extends Presencial {
    private String dataInic;
    private String dataFim;

    public Intensiva(int ano, int semestre, int turma, String dataInic, String dataFim){
        this.ano = ano;
        this.semestre = semestre;
        this.turma = turma;
        this.dataInic = dataInic;
        this.dataFim = dataFim;
    }
}
