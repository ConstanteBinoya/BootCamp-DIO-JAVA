public class MinhaClasse {    /*PADRÃO DE NOMECLATURA:
    1) Arquivo.java:
        Tdod arquivo.java deve começar com letra MAIÚSCULA.
        Se a palavra for composta, a segunda palavra deve, também, ser  MAIÚSCULA.
            Exemplo: Calculadora.java
                     CalculadoraCientifica.java
     
     2) Nome da classse no arquivo: 
         A classe deve possuir o mesmo nome do arquivo.
             Exemplo:  aquivo >>> CalculadoraCientifica.java
                       public class >>> Calculadoracientifica  */

public static void main(String[] args) {

 /*NOME DE VARIÁVEL:
      Toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra
      da segunda palavra deverá ser MAIÚSCULA.
          Exemplo: ano e anoFabricacao
                   O nome dessa prática para nomear variáveis é "camelCase". 
       
       OBS: Existe uma regra adicional para variáveis quando queremos que ela não sofra alterações durante a
            codagem.
                Exemplo: Uma variável com o nome "br" sempre representará "Brasil".*/

 /*RECOMENDAÇÕES PARA NOMEAR UMA VARIÁVEL:
    1) Deve conter apenas letras, _ (UNDERLINE), $ ou números inteiros;
    2) Deve começar SEMPRE por uma letra minúscula;
    3) Não pode conter espaços;
    4) Não pode usar palavras reservadas (palavras-chave);
    5) o nome deve ser único dentro do escopo do código;*/

 /*DECLARAÇÃO DE VARIÁVEIS:
      tipo nomeBemDefinidi = Atribuição (atribuição é opcional em alguns casos).
          Exemplo: int idade = 23;
                   double = alturaMedia = 1.62;
                   Dog spike (exemplo dado pelo professor: NÃO FICOU CLARO).*/
//String BR = "Brasil";
//double PI = 3.14;
//float PI = 3.14;
//int ESTADOS_BRASILEIROS = 27
//int ANO = 2023                                           


 /*MÉTODOS:
      Um método em Java é equivalente a uma FUNÇÃO, SUBROTINA ou PROCEDIMENTO em outras linguagens de 
      programação.
          Não existe em Java o conceito de métodos globais.
              Todos os métodos devem sempre ser 
              definidos dentro de uma classe. */   

 /*DECLARAÇÃO DE MÉTODOS:
      Estrutura: tipoDoRetorno nomeObjetivoNoInfinitivo (parametros)
      Exemplo:   int somar (int primeiroNumero, int segundoNumero)
                 Sting formatarCep (long cep). */
String primeiroNome = "Constante";
String segundoNome = "Binoya";

String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

System.out.println(nomeCompleto);
}

public static String nomeCompleto(String primeiroNome, String segundoNome) {
//return primeiroNome.concat(" ").concat(segundoNome);
return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);

}

}
