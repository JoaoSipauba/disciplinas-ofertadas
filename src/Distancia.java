public class Distancia extends Oferta{
    private String URL;

    public Distancia(int ano, int semestre, int turma, String URL){
        this.ano = ano;
        this.semestre = semestre;
        this.turma = turma;
        this.URL = URL;
        this.modalidade = "D";
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
