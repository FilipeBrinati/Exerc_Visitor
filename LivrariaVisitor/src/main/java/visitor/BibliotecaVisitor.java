package visitor;

//Visitor interface
public interface BibliotecaVisitor {
 String visit(Livro livro);
 String visit(Autor autor);
 String visit(Membro membro);
}