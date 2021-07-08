import java.util.ArrayList;

public class Disciplina {
    private String codigo;
    private int nome;
    private ArrayList<Oferta> ofertas;

    public Disciplina(String codigo, int nome){
        this.codigo = codigo;
        this.nome = nome;
    }
}
