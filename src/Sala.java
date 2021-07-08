import java.util.ArrayList;

public class Sala {
    private String numero;
    private int capacidade;
    private ArrayList<Presencial> presenciais = new ArrayList<Presencial>();

    public Sala(String numero, int capacidade){
        this.numero = numero;
        this.capacidade = capacidade;
    }

    public void adicionarDisciplina(Presencial presencial){
        this.presenciais.add(presencial);
    }
}
