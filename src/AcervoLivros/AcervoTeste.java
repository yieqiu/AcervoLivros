package AcervoLivros;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Classe de teste do programa.
public class AcervoTeste {
    
    public static void main(String[] args) {
       
        //Criação de listas
        List<Usuario> usuarios = new ArrayList<>();
        List<Livro> livros = new ArrayList();
        List<Emprestimo> emprestimos = new ArrayList();
        List<Id> lista = new ArrayList<>();
        
        //Criação/Adição de objetos Usuario.
        usuarios.add(new Usuario("Pedro","pedrowang@hotmail.com","senha",837104));
        usuarios.add(new Usuario("Lucas","Lucas@gmail.com","outrasenha",459081));
        
        //Pesquisa de dados de um usuário pelo nome.
        //Ex: Pedro.
        System.out.println("Usuário pesquisado pelo nome.");
        for(Usuario u : usuarios){
            if(u.getNome().equals ("Pedro"))
            System.out.println(u);
        }        
        
        System.out.println("Lista com todos os usuários.");
        //Listar todos os usuários.
        for(Usuario u : usuarios){
            System.out.println(u);
        }
      
        //Criação/Adição de objetos Livro.
        livros.add(new Livro("Livro","Benjamin","4ed.","Editora","São Paulo",1904,203194));
        livros.add(new Livro("Livro2","Lucy","12ed.","Editora2","Ribeirao Preto",1978,391843));
        
        //Pesquisa de dados de um livro pelo Id.
        //Ex: 203194.
        System.out.println("Livro pesquisado pelo Id.");
        for(Livro l : livros){
            if(l.getId() == 203194)
            System.out.println(l);
        }
        
        //Listar todos os livros.
        System.out.println("Lista com todos os livros.");
        for(Livro l : livros){
            System.out.println(l);
        }
        
        //Realização de um empréstimo.
        emprestimos.add(new Emprestimo(418412,120391,LocalDate.of(2020,3,29), LocalDate.of(2020,4,7),true,123904));
        emprestimos.add(new Emprestimo(923764,493217,LocalDate.of(2020,4,19), LocalDate.of(1,1,1),false,491282));
        
        //Listar livros que ainda não foram devolvidos.
        System.out.println("Livros não devolvidos.");
        for(Emprestimo e : emprestimos){
            if(e.isDevolvido() == false)
            System.out.println(e);
        }
        //Listar livros que já foram devolvidos.
        System.out.println("Livros já devolvidos.");
        for(Emprestimo e : emprestimos){
            if(e.isDevolvido() == true)
            System.out.println(e);
        }
        
        //Polimorfismo por generalização.
        lista.add(new Usuario("Alessandro","Alessandro@outlook.com","senha123",492102));
        lista.add(new Livro("Livro3","Alex","2ed.","Editora3","Franca",2019,539183));
        lista.add(new Emprestimo(303823,103821,LocalDate.of(2020,5,12), LocalDate.of(2020,5,15),true,401928));
        
        //Listar os atributos distintos.
        System.out.println("Lista generelizada.");
        for(Id i : lista){
            System.out.println(i);
        }
        
        
       
        
        
        
    }
}
