package acessarCofrinho;

//"euro" herda "moeda".
public class Euro extends Moeda {
	//construtor = recebe um valor e envia para a classe "moeda".
    public Euro(double valor) {
        super(valor);
    }
    //exibe "euro: valor" 
    @Override
    public void info() {
        System.out.println("Euro: " + valor);
    }
    //converte o valor do "euro" em "reais"
    //considerando = 1 real em "eur" para 6 reais em "br".
    @Override
    public double converter() {
        return valor * 6.0; // Exemplo de cotação
    }
}
