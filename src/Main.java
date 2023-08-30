public class Main {
    public static void main(String[] args) {
        // Classe objetivo   Construtor
        Turista mochileiro = new Turista("Flavin do pineu");
        // Definir formato do objeto
        mochileiro.setNome("Agnes");
        mochileiro.setCpf(Validacao.cpf("123"));
        Turista mochileira = new Turista();
        mochileira.setNome("Tomas");


    }
}