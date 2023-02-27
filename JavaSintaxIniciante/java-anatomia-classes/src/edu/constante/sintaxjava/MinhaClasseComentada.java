package edu.constante.sintaxjava;
public class MinhaClasseComentada {      /*PADRÃO DE NOMECLATURA:
                                   1) Arquivo.java:
                                        Tdod arquivo.java deve começar com letra MAIÚSCULA.
                                        Se a palavra for composta, a segunda palavra deve, também, ser  MAIÚSCULA.
                                            Exemplo: Calculadora.java
                                                     CalculadoraCientifica.java
     
                                   2) Nome da classse no arquivo: 
                                        A classe deve possuir o mesmo nome do arquivo.
                                            Exemplo:  aquivo >>> CalculadoraCientifica.java
                                            public class >>> Calculadoracientifica  */

//public static void main(String[] args) {

                                /*NOME DE VARIÁVEL:
                                    Toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra
                                    da segunda palavra deverá ser MAIÚSCULA.
                                    Exemplo: ano e anoFabricacao
                                             O nome dessa prática para nomear variáveis é "camelCase". 
       
                                    OBS: Existe uma regra adicional para variáveis quando queremos que ela não sofra alterações durante a
                                    codagem.
                                         Exemplo: Uma variável com o nome "br" sempre representará "Brasil".*/

                                /*RECOMENDAÇÕES PARA NOMEAR UMA VARIÁVEL:
                                    1) Deve conter apenas letras, _ (UNDERLINE), $ (símbolo do cifrão) ou números inteiros;
                                    2) Deve começar SEMPRE por uma letra minúscula;
                                    3) Não pode conter espaços;
                                    4) Não pode usar palavras reservadas (palavras-chave);
                                    5) O nome deve ser único dentro do escopo do código;
                                    6) Clareza na nomeclatura: evite criar abreviações (salvo as já existentes e de conhecimento comum),
                                       SEJA O MAIS CLARO POSSÍVEL;
                                    7) Sempre no SINGULAR, exceto se a variável se tratar de um array, que reune dados do mesmo tipo;
                                    8) Idioma único: se a estrutura do seu código estiver em Pt-BR siga esse padrão até o fim. Ocódigo 
                                       não admite qu evocê seja poliglota, isso dixa tudo confuso; */

                                /*DECLARAÇÃO DE VARIÁVEIS:
                                    tipo nomeBemDefinidi = Atribuição (atribuição é opcional em alguns casos).
                                        Exemplo: int idade = 23;
                                                 double = alturaMedia = 1.62;
                                                 Dog spike (exemplo dado pelo professor: NÃO FICOU CLARO).*/

                                /*CONSTANTES:
                                    Grosseiramente falando, é uma "variável" que não se altera. Ficou confuso? Entenda: é a essência de 
                                    uma variável - reperesentar um determinado dano na memória do computador - com a capacidade de NÃO 
                                    SER ALTERADO FUTURAMENTE ao contrário de uma variável comum. Portanto, constante é uma variável de 
                                    valor FIXO!
                                        A peculiaridade das CONSTANTES  em relação às VARIÁVEIS se extende, também, a forma de declaração
                                        toda constante de ter o termo FINAL antes das demais atribuições e o identificador de nome deverá 
                                        ser em  CAIXA ALTA (LETRA MAIÚSCULA).
                                        Exemplo: int idade = 33  >>> essa estrutura representa uma VARIÁVEL, pois pode ser alterada;
                                                 final int IDADE = 33  >>> Já essa é uma CONSTANTE, por algum motivo ese valor não pode 
                                                 ser alterado.
                                 */
//final String BR = "Brasil";
//final double PI = 3.14;
//final float PI = 3.14;
//final int ESTADOS_BRASILEIROS = 27
//final int ANO = 2023                                           


                                /*MÉTODOS:
                                    Um método em Java é equivalente a uma FUNÇÃO, SUBROTINA ou PROCEDIMENTO em outras linguagens de 
                                    programação.
                                         Não existe em Java o conceito de métodos globais.
                                             Todos os métodos devem sempre ser definidos dentro de uma classe. */   

                                /*DECLARAÇÃO DE MÉTODOS:
                                    Estrutura: tipoDoRetorno nomeObjetivoNoInfinitivo (parametros)
                                        Exemplo:   int somar (int primeiroNumero, int segundoNumero)
                                                   Sting formatarCep (long cep). */
//String primeiroNome = "Constante";
//String segundoNome = "Binoya";

//String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

//System.out.println(nomeCompleto);
//}

//public static String nomeCompleto(String primeiroNome, String segundoNome) {
//return primeiroNome.concat(" ").concat(segundoNome);
//return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
//}

                                /*IDENTAÇÃO:
                                    Hierarquia das linhas de código (conceito de "pai e filho").
                                        Por boas práticas a identação não deve passar de 6 níveis.
                                            Se ocorrer essa estrapolação revise seu código. */
//public class BoletimEstudantil {}
    public static void main(String[] args) {
        int mediaFinal = 6;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6);
            System.out.println ("PROVA MINERVA");
    }



}
