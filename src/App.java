public class App {
    public static void main(String[] args) {
        Disciplina mtm = new Disciplina(1, "Matematica");
        Oferta oferta1 = new Distancia(2021, 1, 4, "https");
        Oferta oferta2 = new Semestral(2021, 1, 4, "Quinta", 19, 3);
        Oferta oferta3 = new Intensiva(2021, 1, 4, "05/02", "05/07");
        mtm.AdicionarOferta(oferta1);
        mtm.AdicionarOferta(oferta2);
        mtm.AdicionarOferta(oferta3);
        mtm.mostrarDados();
    }
}
