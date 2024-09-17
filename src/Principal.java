public class Principal {
    public static void main(String[] args) {

        Filme filme1  = new Filme();
        filme1.nome = "Zumbi";
        filme1.somaDasAvaliacoes = 10;
        filme1.anoDeLancamento = 2022;
        filme1.duracaoEmMinutos = 100;
        filme1.totalDeAvaliacoes = 0;

        filme1.exibeFichaTecnica();
        filme1.avalia(9);
        filme1.avalia(8);
        filme1.avalia(10);
        System.out.println(filme1.somaDasAvaliacoes);
        System.out.println(filme1.totalDeAvaliacoes);
        System.out.println(filme1.pegaMedia());
    }
}