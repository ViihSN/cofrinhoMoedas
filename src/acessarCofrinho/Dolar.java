package acessarCofrinho;

//Classe public = "dolar" vai herdar "moeda", assim posso acessar os atributos e métodos dela.
public class Dolar extends Moeda {
	//construtor de "dolar" chamada "super(valor)", envia o valor para p construtor da classe "moeda".
    public Dolar(double valor) {
        super(valor);
    }
    //@Override = referência o método "info" e exibe "dolar - valor".
    @Override
    public void info() {
        System.out.println("Dólar: " + valor);
    }
    //aqui esta convertendo o valor do dolar em reais.
    //esta considerando a cotação fixa de 1 real "usd" para 5 reais "br".
    @Override
    public double converter() {
        return valor * 5.0; // Exemplo de cotação
    }
}

