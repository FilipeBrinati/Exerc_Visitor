package visitor;

class XMLVisitor implements BibliotecaVisitor {
 @Override
 public String visit(Livro livro) {
     if (livro.isDisponivel()) {
         return "<livro>\n" +
                "  <titulo>" + livro.getTitulo() + "</titulo>\n" +
                "  <autor>" + livro.getAutor().getNome() + "</autor>\n" +
                "  <status>Disponível</status>\n" +
                "</livro>";
     } else {
         return "<livro>\n" +
                "  <titulo>" + livro.getTitulo() + "</titulo>\n" +
                "  <autor>" + livro.getAutor().getNome() + "</autor>\n" +
                "  <status>Indisponível</status>\n" +
                "</livro>";
     }
 }

 @Override
 public String visit(Autor autor) {
     return "<autor>\n" +
            "  <nome>" + autor.getNome() + "</nome>\n" +
            "  <biografia>" + autor.getBiografia() + "</biografia>\n" +
            "</autor>";
 }

 @Override
 public String visit(Membro membro) {
     if (membro.isElegivel()) {
         return "<membro>\n" +
                "  <nome>" + membro.getNome() + "</nome>\n" +
                "  <id>" + membro.getId() + "</id>\n" +
                "  <status>Elegível</status>\n" +
                "</membro>";
     } else {
         return "<membro>\n" +
                "  <nome>" + membro.getNome() + "</nome>\n" +
                "  <id>" + membro.getId() + "</id>\n" +
                "  <status>Não Elegível</status>\n" +
                "</membro>";
     }
 }
}