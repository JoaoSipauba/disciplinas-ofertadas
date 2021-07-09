public abstract class Presencial extends Oferta {
    protected String diaSemana;
    protected int hora;
    protected int duracao;
    protected Sala sala;

    protected final void alocarSala(Sala sala){
        this.sala = sala;
        sala.adicionarDisciplina(this);
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
