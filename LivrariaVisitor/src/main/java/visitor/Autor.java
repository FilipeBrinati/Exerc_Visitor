package visitor;

public class Autor implements BibliotecaElement {
    private String nome;
    private String biografia;

    public Autor(String nome, String biografia) {
        this.nome = nome;
        this.biografia = biografia;
    }

    public String getNome() {
        return nome;
    }

    public String getBiografia() {
        return biografia;
    }

    @Override
    public String accept(BibliotecaVisitor visitor) {
        return visitor.visit(this);
    }
}