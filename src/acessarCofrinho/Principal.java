package acessarCofrinho;

import java.util.Scanner;

//"classe principal" = que executa o cofrinho.
public class Principal {

	public static void main(String[] args) {

		//cria um "scanner" = le a entrada do usuario.
		Scanner scanner = new Scanner(System.in);
		//cria um "cofrinho" = armazenar as moedas.
		Cofrinho cofrinho = new Cofrinho();
		
		//começo de um loop infinito
		while(true) {
			//mostra o menu de opções.
			System.out.println("\n Menu: ");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Calcular total convertido em Real");
			System.out.println("5 - Sair");
			System.out.println("Escolha uma Opção: ");
			
			int opcao = scanner.nextInt();
			
			//decisão = baseado na opção escolhida pelo usuario.
			switch (opcao) {
			case 1:
				//o usuario escolhe qual moeda quer "adicionar".
                System.out.println("Escolha a moeda: \n 1-Dólar \n 2-Euro \n 3-Real");
                int tipo = scanner.nextInt();
                //o usuario digita o valor.
                System.out.print("Digite o valor: ");
                double valor = scanner.nextDouble();
                //o programa adiciona a moeda no cofrinho.
                if (tipo == 1) cofrinho.adicionar(new Dolar(valor));
                else if (tipo == 2) cofrinho.adicionar(new Euro(valor));
                else if (tipo == 3) cofrinho.adicionar(new Real(valor));
                else System.out.println("Tipo inválido!");
                break;
                
			 case 2:
				 //remove as moedas por indice.
                 System.out.println("Informe o índice da moeda a remover:");
                 //mostra a lista de moedas.
                 cofrinho.listagemMoedas();
                 int indice = scanner.nextInt();
                 cofrinho.remover(indice);
                 break;
             
             case 3:
            	 //mostra todas as moedas no cofrinho
                 System.out.println("Moedas no cofrinho:");
                 cofrinho.listagemMoedas();
                 break;
                 
             case 4:
            	 //converte todas as moedas para reais.
            	 //exibe o total convertido.
                 System.out.println("Total convertido para Real: " + cofrinho.totalConvertido());
                 break;
             
             case 5:
            	 //aqui sai do programa.
                 System.out.println("Saindo...");
                 //fecha o scanner.
                 scanner.close();
                 return;
             //aqui mostra a mensagem"opção invalida" se o usuario digitar um numero que não exista no menu.
             default:
                 System.out.println("Opção inválida!");
			}
		}
	}
}
