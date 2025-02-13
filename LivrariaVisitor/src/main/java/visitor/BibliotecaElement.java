package visitor;

public interface BibliotecaElement {
    String accept(BibliotecaVisitor visitor);
}
