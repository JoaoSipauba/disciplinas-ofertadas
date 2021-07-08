import java.util.ArrayList;

public class Disciplina {
    private int codigo;
    private String nome;
    private ArrayList<Oferta> ofertas = new ArrayList<Oferta>();

    public Disciplina(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public void AdicionarOferta(Oferta oferta){
        this.ofertas.add(oferta);
    }

    public void RemoverOferta(Oferta oferta){
        this.ofertas.remove(ofertas.indexOf(oferta));
    };

    public void mostrarDados(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Ofertas: " + ofertas);
    }
}
