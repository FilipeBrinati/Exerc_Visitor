package visitor;

public class CSVVisitor implements BibliotecaVisitor {
    @Override
    public String visit(Livro livro) {
        if (livro.isDisponivel()) {
            return "CSV Livro: " + livro.getTitulo() + "," + livro.getAutor().getNome() + ",Disponível";
        } else {
            return "CSV Livro: " + livro.getTitulo() + "," + livro.getAutor().getNome() + ",Indisponível";
        }
    }

    @Override
    public String visit(Autor autor) {
        return "CSV Autor: " + autor.getNome() + "," + autor.getBiografia();
    }

    @Override
    public String visit(Membro membro) {
        if (membro.isElegivel()) {
            return "CSV Membro: " + membro.getNome() + "," + membro.getId() + ",Elegível";
        } else {
            return "CSV Membro: " + membro.getNome() + "," + membro.getId() + ",Não Elegível";
        }
    }
}
