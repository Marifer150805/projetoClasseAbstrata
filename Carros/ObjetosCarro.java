package Carros;

public class ObjetosCarro {

	public static void main(String[] args) {
		//Criando objetos da classe Pessoa
		Carro carro1 = new Carro();
		
		//OBJETO 1
		carro1.setModelo("Chevrolet");
		carro1.setPotencia(60);
		carro1.setCor("Preto");
		carro1.setNome("Cruze");
	
		
		//Chamando o método get() para apresentar os objetos
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getPotencia());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getNome());
	
	}

}

