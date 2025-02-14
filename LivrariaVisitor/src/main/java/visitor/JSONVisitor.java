package visitor;

public class JSONVisitor implements BibliotecaVisitor {
    @Override
    public String visit(Livro livro) {
        if (livro.isDisponivel()) {
            return "JSON Livro: {titulo: \"" + livro.getTitulo() + "\", autor: \"" + livro.getAutor().getNome() + "\", status: \"Disponível\"}";
        } else {
            return "JSON Livro: {titulo: \"" + livro.getTitulo() + "\", autor: \"" + livro.getAutor().getNome() + "\", status: \"Indisponível\"}";
        }
    }

    @Override
    public String visit(Autor autor) {
        return "JSON Autor: {nome: \"" + autor.getNome() + "\", biografia: \"" + autor.getBiografia() + "\"}";
    }

    @Override
    public String visit(Membro membro) {
        if (membro.isElegivel()) {
            return "JSON Membro: {nome: \"" + membro.getNome() + "\", id: \"" + membro.getId() + "\", status: \"Elegível\"}";
        } else {
            return "JSON Membro: {nome: \"" + membro.getNome() + "\", id: \"" + membro.getId() + "\", status: \"Não Elegível\"}";
        }
    }
}
