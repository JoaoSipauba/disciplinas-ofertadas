public abstract class Presencial extends Oferta {
    protected String diaSemana;
    protected int hora;
    protected int duracao;
    protected Sala sala;

    protected final void alocarSala(Sala sala){
        this.sala = sala;
        sala.adicionarDisciplina(this);
    }
}
