public class App {
    public static void main(String[] args) {
        Disciplina mtm = new Disciplina(1, "Matematica");
        Distancia oferta1 = new Distancia(2021, 1, 4, "https");
        Semestral oferta2 = new Semestral(2021, 1, 4, "Quinta", 19, 3);
        Intensiva oferta3 = new Intensiva(2021, 1, 4, "05/02", "05/03");
        Sala sala1 = new Sala("01", 40);
        oferta2.alocarSala(sala1);
        oferta3.alocarSala(sala1);
        mtm.AdicionarOferta(oferta1);
        mtm.AdicionarOferta(oferta2);
        mtm.AdicionarOferta(oferta3);
        mtm.mostrarDados();
    }
}
