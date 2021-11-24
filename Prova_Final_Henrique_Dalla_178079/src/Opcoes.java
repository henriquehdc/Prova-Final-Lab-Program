import static java.lang.Integer.parseInt;
import  static javax.swing.JOptionPane.*;
public class Opcoes {
	
	static int[] lista = new int [10];
	private static Filme[] filme= new Filme[10];
	private static int posicao = 0;
	
	 public static String menu(){
	        String aux = "Escolha uma opção:\n";
	        aux += "1. Registrar filme\n";
	        aux += "2. Pesquisar filme\n";
	        aux += "3. Atualizar pontuação\n";
	        aux += "4. Relatório de filmes\n";
	        aux += "5. Relatório de filmes em ordem decrescente\n";
	        aux += "6. Finalizar\n";
	        return aux;
	    }
	 
	    public static void registrar() {


	    	String titulo,genero;
			int ano,pontuacao,existe=0;
			
			if (posicao < filme.length) {
				titulo = showInputDialog("Titulo");								
					for(int i=0; i< posicao; i++) {
						if(filme[i].titulo.equalsIgnoreCase(titulo)){	
							existe = 1;												
						}
					}	
					if(existe==0) {
						genero = showInputDialog("Genero");
						ano = parseInt(showInputDialog("Ano"));
						pontuacao = parseInt(showInputDialog("Pontuação (0-5)"));
						filme[posicao] = new Filme(titulo,genero,ano,pontuacao);
						posicao++;
					}else {
						showMessageDialog(null,"Filme com esse título já cadastrado!");
					}	
					
			}else {
				showMessageDialog(null,"Numero limite de registros atingido!");
			}
		}		
	    
	    private static int busca() {

	    	int index=-1;
			String titulo = showInputDialog("Titulo");
			for(int i=0; i< posicao; i++) {
				if(filme[i].titulo.equalsIgnoreCase(titulo)){	
					index=i;
				}
			}
			if(index == -1) {
				showMessageDialog(null,titulo+" não encontrado");
			}	
		return index;	
		}		   	  
	    
	    public static void pesquisar() {

			int index = busca();
			if(index != -1) {
				showMessageDialog(null, filme[index].dados());
			}
		}
	    
		public static void atualizar() {

			int novapontuacao;
			int index = busca();
			if(index != -1) {
				novapontuacao = parseInt(showInputDialog("Nova pontuação(0-5): "));
				filme[index].pontuacao = novapontuacao;
			}
		}		
		
		public static void relatorio() {
			for(int i=0 ; i<posicao; i++) {		
				showMessageDialog(null,filme[i].dados());
			}
		}		
		
		public static void relatorioD() {

		for(int l=0 ; l<posicao; l++) {			
			lista[l]=99;
		}
			 for(int j=0 ; j<posicao; j++) { 
				 int maior=-1;
				 for(int i=0 ; i<posicao; i++) {
					 int cont =0;
					 for(int k=0 ; k<posicao; k++) { 
						 if(lista[k]!=i) {	 
							cont++;	
						 }
					 }				 	
					if(cont==posicao) {							
						if(filme[i].pontuacao>maior){
							lista[j]= i;
							maior=filme[i].pontuacao;
						}	
					}						 		
				 }	
			 }
			 
			for(int i=0 ; i<posicao; i++) {		
				showMessageDialog(null,filme[lista[i]].dados());	
			}	
		}
}
