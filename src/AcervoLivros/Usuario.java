package AcervoLivros;

//Classe Usuário que herda de Id.
public class Usuario extends Id{
    
    //Atributos de Usuário.
    //Nome do usuário.
    private String nome;
    //Email do usuário.
    private String email;
    //Senha do usuário.
    private String senha;

    //Metodos setters e getters para os atributos de Usuário.
    //Getter do atributo nome.
    public String getNome() {
        return nome;
    }
    
    //Setter do atributo nome.
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getter do atributo Email.
    public String getEmail() {
        return email;
    }

    //Setter do atributo Email.
    public void setEmail(String email) {
        this.email = email;
    }

    //Getter do atributo senha.
    public String getSenha() {
        return senha;
    }

    //Setter do atributo senha.
    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Contrutor vazio.
    public Usuario() {
    }

    //Contrutor para o atributo nome.
    public Usuario(String nome) {
        setNome(nome);
    }

    //Polimorfismo por sobrecarga.
    public Usuario(String nome, String email, String senha, int id) {
        super(id);
        setNome(nome);
        setEmail(email);
        setSenha(senha);
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
                "Nome: " + nome + "\nEmail: " + email + "\nSenha: " + senha + "\n";
    }
    
    
    
}
