package acessarCofrinho;

import java.util.ArrayList;

//"classe cofrinho".
public class Cofrinho {
	//guarda uma lista de moedas.
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();
    //adiciona uma moeda na lista (listaMoedas).
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }
    //aqui "remove" uma moeda pelo incice dela.
    //e verifica também se o indice é valido antes de remover.
    public void remover(int index) {
        if (index >= 0 && index < listaMoedas.size()) {
            listaMoedas.remove(index);
        } else {
            System.out.println("Índice inválido!");
        }
    }
    //aqui lista as moedas do cofrinho
    //mostra o indice.
    public void listagemMoedas() {
        for (int i = 0; i < listaMoedas.size(); i++) {
            System.out.print(i + " - ");
            listaMoedas.get(i).info();
        }
    }
    //aqui faz o calculo total do cofrinho em reais. 
    public double totalConvertido() {
        double total = 0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        return total;
    }
}
