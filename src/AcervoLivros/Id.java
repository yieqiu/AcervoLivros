package AcervoLivros;

//Classe abstrata Id
public abstract class Id {
    
    //Atributo em comûm entre as classes.
    protected int id;

    //Setter de id
    public void setId(int id) {
        this.id = id;
    }
    
    //Método abestrato getter de id.
    public abstract int getId();

    //Construtor vazio.
    public Id() {
    }

    //Polimorfismo de sobrecarga.
    public Id(int id) {
        setId(id);
    }
    
    //Método toString para impressão
    @Override
    public String toString() {
        return "Id: " + id + "\n";
    }
    
}
