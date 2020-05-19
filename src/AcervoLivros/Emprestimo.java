package AcervoLivros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Classe Emprestimo que herda de Id.
public class Emprestimo extends Id{
    //Atributos da classe Emprestimo.
    //Id do usuário fazendo o empréstimo.
    private int idUsuario;
    //Id do livro sendo emprestado.
    private int idLivro;
    //Data em que o livro foi emprestado.
    LocalDate dataEmprestimo;
    //Data em que o livro foi devolvido, caso nao devolvido(1,1,1).
    LocalDate dataDevolucao;
    //Verificação se o livro foi devolvido ou não.
    private boolean devolvido;
    
    //Formatação de data com barras.
    DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    //Métodos getters e setters dos atributos.
    //Getter do atributo idUsuario.
    public int getIdUsuario() {
        return idUsuario;
    }

    //Setter do atributo idUsuario.
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    //Getter do atributo idLivro
    public int getIdLivro() {
        return idLivro;
    }

    //Setter do atributo idLivro.
    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    //Getter do atributo dataEmprestimo.
    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    //Setter do atributo dataEmprestimo.
    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    //Getter do atributo dataDevolucao.
    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    //Setter do atributo dataDevolucao.
    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    //Getter do atributo devolvido;
    public boolean isDevolvido() {
        return devolvido;
    }
    
    //Setter do atributo devolvido;
    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    //Construtores.
    public Emprestimo() {
    }

    //Contrustor do atributo idUsuario.
    public Emprestimo(int idUsuario) {
        setIdUsuario(idUsuario);
    }

    //Polimorfismo por sobrecarga.
    public Emprestimo(int idUsuario, int idLivro, LocalDate dataEmprestimo, LocalDate dataDevolucao, boolean devolvido, int id) {
        super(id);
        setIdUsuario(idUsuario);
        setIdLivro(idLivro);
        setDataEmprestimo(dataEmprestimo);
        setDataDevolucao(dataDevolucao);
        setDevolvido(devolvido);
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
                "Id Usuario: " + idUsuario + "\nId Livro: " + idLivro + "\nData de Emprestimo: " + dataEmprestimo.format(formatadorBarra) + 
                "\nData de Devolução: " + dataDevolucao.format(formatadorBarra) + "\nDevolvido: " + devolvido + "\n";
    }
    
    
}
