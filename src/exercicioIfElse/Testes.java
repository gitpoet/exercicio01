package exercicioIfElse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testes {
    @Test
    void deveRetornarSeEhMenorDeIdade(){

        Pessoa pessoa = new Pessoa("carlos", 2010);
        int idade = pessoa.verificaIdade();

        Assert.assertEquals(13, idade);
    }
    @Test
    void deveRetornarSeEhMaiorDeIdade(){

        Pessoa pessoa = new Pessoa("carlos", 1965);
        int idade = pessoa.verificaIdade();

        Assert.assertEquals(58, idade);
    }
}
