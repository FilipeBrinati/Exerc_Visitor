package visitor;

public class Membro implements BibliotecaElement {
    private String nome;
    private String id;
    private boolean elegivel;

    public Membro(String nome, String id, boolean elegivel) {
        this.nome = nome;
        this.id = id;
        this.elegivel = elegivel;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public boolean isElegivel() {
        return elegivel;
    }

    @Override
    public String accept(BibliotecaVisitor visitor) {
        return visitor.visit(this);
    }
}