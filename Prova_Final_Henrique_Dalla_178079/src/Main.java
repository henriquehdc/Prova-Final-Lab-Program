import static java.lang.Integer.parseInt;
import  static javax.swing.JOptionPane.*;
public class Main {

	public static void main(String[] args) {

        int opcao;

        do{opcao = parseInt(showInputDialog(Opcoes.menu()));                     
            if(opcao < 1 || opcao >6) {
            showMessageDialog(null,"Opção inválida!");
            
            }else {
            	switch(opcao) {
            	
            	case 1:
            		Opcoes.registrar();
            		break;
            	case 2:
            		Opcoes.pesquisar();
            		break;
            	case 3:
            		Opcoes.atualizar();
            		break;
            	case 4:
            		Opcoes.relatorio();
            		break;
            	case 5:
            		Opcoes.relatorioD();
            		break;
            	}
            }           	
        } while(opcao!=6);       
    }
}
