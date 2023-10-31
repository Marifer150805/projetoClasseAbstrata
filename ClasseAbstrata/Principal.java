package ClasseAbstrata;

public class Principal {
	public static void main (String[] args) {
	
	
	 Carro ferrari = new Carro ("00000", "Fl", "Vermelho", 2023) ;
		ferrari.ligar(); 
		ferrari.acelerar () ;
		ferrari.virar ();
		ferrari.frear () ;
		
		
		Onibus marcopolo = new Onibus ("11111", "XB1", "Prata", 2020) ;
		marcopolo.ligar() ; 
		marcopolo.acelerar();
		marcopolo.virar (); 
		marcopolo.frear ();
	}
}