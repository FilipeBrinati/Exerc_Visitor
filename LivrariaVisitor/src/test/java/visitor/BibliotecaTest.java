package visitor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BibliotecaTest {

    @Test
    void testLivroCSVDisponivel() {
        Autor autor = new Autor("George Orwell", "Autor de 1984 e A Revolução dos Bichos.");
        Livro livro = new Livro("1984", autor, true);
        CSVVisitor csvVisitor = new CSVVisitor();

        String resultado = livro.accept(csvVisitor);
        assertEquals("CSV Livro: 1984,George Orwell,Disponível", resultado);
    }

    @Test
    void testLivroCSVIndisponivel() {
        Autor autor = new Autor("J.K. Rowling", "Autora da série Harry Potter.");
        Livro livro = new Livro("Harry Potter e a Pedra Filosofal", autor, false);
        CSVVisitor csvVisitor = new CSVVisitor();

        String resultado = livro.accept(csvVisitor);
        assertEquals("CSV Livro: Harry Potter e a Pedra Filosofal,J.K. Rowling,Indisponível", resultado);
    }

    @Test
    void testAutorCSV() {
        Autor autor = new Autor("George Orwell", "Autor de 1984 e A Revolução dos Bichos.");
        CSVVisitor csvVisitor = new CSVVisitor();

        String resultado = autor.accept(csvVisitor);
        assertEquals("CSV Autor: George Orwell,Autor de 1984 e A Revolução dos Bichos.", resultado);
    }

    @Test
    void testMembroCSVElegivel() {
        Membro membro = new Membro("João Silva", "M001", true);
        CSVVisitor csvVisitor = new CSVVisitor();

        String resultado = membro.accept(csvVisitor);
        assertEquals("CSV Membro: João Silva,M001,Elegível", resultado);
    }

    @Test
    void testMembroCSVNaoElegivel() {
        Membro membro = new Membro("Maria Oliveira", "M002", false);
        CSVVisitor csvVisitor = new CSVVisitor();

        String resultado = membro.accept(csvVisitor);
        assertEquals("CSV Membro: Maria Oliveira,M002,Não Elegível", resultado);
    }

    @Test
    void testLivroJSONDisponivel() {
        Autor autor = new Autor("George Orwell", "Autor de 1984 e A Revolução dos Bichos.");
        Livro livro = new Livro("1984", autor, true);
        JSONVisitor jsonVisitor = new JSONVisitor();

        String resultado = livro.accept(jsonVisitor);
        assertEquals("JSON Livro: {\"titulo\": \"1984\", \"autor\": \"George Orwell\", \"status\": \"Disponível\"}", resultado);
    }

    @Test
    void testLivroJSONIndisponivel() {
        Autor autor = new Autor("J.K. Rowling", "Autora da série Harry Potter.");
        Livro livro = new Livro("Harry Potter e a Pedra Filosofal", autor, false);
        JSONVisitor jsonVisitor = new JSONVisitor();

        String resultado = livro.accept(jsonVisitor);
        assertEquals("JSON Livro: {\"titulo\": \"Harry Potter e a Pedra Filosofal\", \"autor\": \"J.K. Rowling\", \"status\": \"Indisponível\"}", resultado);
    }

    @Test
    void testAutorJSON() {
        Autor autor = new Autor("George Orwell", "Autor de 1984 e A Revolução dos Bichos.");
        JSONVisitor jsonVisitor = new JSONVisitor();

        String resultado = autor.accept(jsonVisitor);
        assertEquals("JSON Autor: {\"nome\": \"George Orwell\", \"biografia\": \"Autor de 1984 e A Revolução dos Bichos.\"}", resultado);
    }

    @Test
    void testMembroJSONElegivel() {
        Membro membro = new Membro("João Silva", "M001", true);
        JSONVisitor jsonVisitor = new JSONVisitor();

        String resultado = membro.accept(jsonVisitor);
        assertEquals("JSON Membro: {\"nome\": \"João Silva\", \"id\": \"M001\", \"status\": \"Elegível\"}", resultado);
    }

    @Test
    void testMembroJSONNaoElegivel() {
        Membro membro = new Membro("Maria Oliveira", "M002", false);
        JSONVisitor jsonVisitor = new JSONVisitor();

        String resultado = membro.accept(jsonVisitor);
        assertEquals("JSON Membro: {\"nome\": \"Maria Oliveira\", \"id\": \"M002\", \"status\": \"Não Elegível\"}", resultado);
    }
}

