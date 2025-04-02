package acessarCofrinho;

//a classe "real" herda a classe "moeda".
public class Real extends Moeda {
	//construtor = recebe um "valor" e envia para "moedas".
    public Real(double valor) {
        super(valor);
    }
    //exibe = "real: valor".
    @Override
    public void info() {
        System.out.println("Real: " + valor);
    }
    //apenas retorna o valor original.
    @Override
    public double converter() {
        return valor;
    }
}

