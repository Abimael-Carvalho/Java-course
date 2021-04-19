package br.com.abim.introducao.pooGuanabara.lutador;
    //Atributos
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria = "Categoria Leve! ";
    private int vitorias;
    private int derrotas;
    private int empates;

    //Metodos
    public void apresentar(){
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("Ganhou: "+ this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());

    }
    public void status(){
        System.out.println(this.getNome());
        System.out.println("É um atleta de " + this.getCategoria());
        System.out.println(this.getVitorias() + "-Vitórias");
        System.out.println(this.getDerrotas() + "-Derrotas");
        System.out.println(this.getEmpates() + "-Empates");
    }
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }
    public void empataLuta(){
        setEmpates(getEmpates() + 1);
    }

    // Constructor


        public Lutador(String nome, String nacionalidade, int idade, float altura,float peso, int vitorias, int derrotas, int empates) {
            this.setNome(nome);
            this.setNacionalidade(nacionalidade);
            this.setIdade(idade);
            this.setAltura(altura);
            this.setPeso(peso);
            this.setVitorias(vitorias);
            this.setDerrotas(derrotas);
            this.setEmpates(empates);
        }

        //Get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

        public float getAltura() {
            return altura;
        }

        public void setAltura(float altura) {
            this.altura = altura;
        }

        public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public void setCategoria(){
        if ((this.peso > 52.2) && (this.peso <= 70.3)) {
            categoria = "Categoria peso Leve! ";
        }else if ((this.peso > 70.3) && (this.peso <= 83.9)) {
            categoria = "Categoria peso Médio! ";
        }else if ((this.peso > 83.9) && (this.peso <= 120.2)) {
            categoria = "Categoria peso Pesado!";
        }else {
            categoria = "Categoria Inválida! ";
        }
    }
    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}

