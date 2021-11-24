public class Filme {

	String titulo;
	String genero;
    int ano;
    int pontuacao;


    public Filme(String titulo, String genero, int ano, int pontuacao) {
		this.titulo = titulo;
		this.genero = genero;
		this.ano = ano;
		this.pontuacao = pontuacao;
	}


	public String dados() {
        String aux="";
        aux= aux+"Titulo: "+titulo +"\n";
        aux= aux+ "Genero: "+genero +"\n";
        aux= aux+ "Ano: "+ano+"\n";
        aux= aux+ "Pontuação: "+pontuacao+"\n";
     
        return aux;
    }
}
