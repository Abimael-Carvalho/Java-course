package br.com.abim.introducao.pooGuanabara.PrLivro;

public class Livro implements Publicacao {

    // Atributos
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private String leitor;

    public Livro(String aprendendo_java, String josé_da_silva, int i, Pessoa pessoa) {
        this.titulo = getTitulo();
        this.autor = getAutor();
        this.totalPaginas = getTotalPaginas();
    }

    // Métodos
    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totalPaginas=" + totalPaginas +
                ", paginaAtual=" + paginaAtual +
                ", aberto=" + aberto +
                ", leitor='" + leitor + '\'' +
                '}';
    }

    //Método constructor

    public Livro(String titulo, String autor, int totalPaginas, int paginaAtual, String leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = paginaAtual;
        this.leitor = leitor;
    }

    public Livro() {

    }

    //Métodos Get and Set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear( int p) {
        this.paginaAtual = p;
    }

    @Override
    public void avancarPagina() {
        this.paginaAtual ++;
    }

    @Override
    public void voltarPagina() {
        this.paginaAtual --;

    }
}
