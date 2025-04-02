package acessarCofrinho;

//declaração de "classe abstrata".
public abstract class Moeda {
	
	//protected = declara um atributo chamado "valor" que guarda o valor da moeda.
    protected double valor;
    
    //construtor = "classe moeda", ele recebe um valor e armazena na variavel "this.valor".
    public Moeda(double valor) {
        this.valor = valor;
    }
    
    //Métodos adbstratos = forçam as classes filhas(dolar, euro e real).
    public abstract void info();
    public abstract double converter();
}
