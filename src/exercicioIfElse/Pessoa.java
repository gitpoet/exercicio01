package exercicioIfElse;

import java.util.Calendar;

public class Pessoa {

     private String nome;
     private int anoNascimento;


    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;

    }
    public int verificaIdade(){

        Calendar data = Calendar.getInstance();
        int anoAtual =  data.get(Calendar.YEAR);
        int idade = anoAtual - anoNascimento;
        if(idade < 18 ){
            System.out.println(nome + ", vc tem " + idade + " anos, portanto é menor de idade" );
        }else {
            System.out.println(nome + ", vc tem " + idade + " anos, portanto é maior de idade" );
        }
        return idade;
    }
}
