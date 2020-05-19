package AcervoLivros;

//Classe Livro que herda de Id.
public class Livro extends Id{

    //Atributos da classe Livro.
    //Título do livro.
    private String titulo;
    //Título do autor.
    private String autor;
    //Edição do livro.
    private String edicao;
    //Editora do livro;
    private String editora;
    //Cidade em que o livro foi publicado.
    private String cidade;
    //Ano em que o livro foi publicado.
    private int anoPublicacao;

    //Metodos setters e getters para os atributos de Livro.
    //Getter do atributo titulo.
    public String getTitulo() {
        return titulo;
    }

    //Setter do atributo titilo.
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Getter do atributo autor.
    public String getAutor() {
        return autor;
    }

   //Setter do atributo autor.
    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Getter do atributo edicao.
    public String getEdicao() {
        return edicao;
    }

    //Setter do atributo edicao.
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    //Getter do atributo editora.
    public String getEditora() {
        return editora;
    }

    //Setter do atributo editora.
    public void setEditora(String editora) {
        this.editora = editora;
    }

    //Getter do atributo cidade.
    public String getCidade() {
        return cidade;
    }

    //Setter do atributo cidade.
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    //Getter do atributo anoPublicacao.
    public int getAnopublicacao() {
        return anoPublicacao;
    }

    //Setter do atributo anoPublicacao.
    public void setAnoPublicacao(int anoPublicacao) {
        if(anoPublicacao <= 2020)
        this.anoPublicacao = anoPublicacao;
        else
            System.out.println("Ano de publicação inválido.");
    }

    //Construtore vazio.
    public Livro() {
    }

    //Construtor para o atributo titulo.
    public Livro(String titulo) {
        setTitulo(titulo);
    }

    //Polimorfismo por sobrecarga.
    public Livro(String titulo, String autor, String edicao, String editora, String cidade, int anoPublicacao, int id) {
        super(id);
        setTitulo(titulo);
        setAutor(autor);
        setEdicao(edicao);
        setEditora(editora);
        setCidade(cidade);
        setAnoPublicacao(anoPublicacao);
    }

    //Polimorfismo por sobreposição reescrevendo método da classe abstrata Id.
    @Override
    public int getId() {
        return super.id;
    }

    //Polimorfismo por sobreposição.
    @Override
    public String toString() {
        return super.toString() +
                "Título: " + titulo + "\nAutor: " + autor + "\nEdição: " + edicao + "\nEditora: " + editora + "\nCidade: " + cidade + "\nAno de Publicação: " + anoPublicacao + "\n";
    }
    
    
    
}
