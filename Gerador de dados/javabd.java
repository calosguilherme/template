package org.fluttercode.datafactory.impl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author calos
 */
public class main {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException{
        
        DataFactory df = new DataFactory();
// GERA ARQUIVO DE INSERT DE PESSOAS
//        FileWriter arq = new FileWriter("A:\\pessoa.txt");
//        PrintWriter gravarArq = new PrintWriter(arq);
//        gravarArq.printf("INSERT INTO PESSOA (senha, codpessoa, nome, email, permissoesADM, telefone) VALUES\n");
//        for (int i=1; i<=100000; i++){
//            String name = df.getFirstName() + " "+ df.getLastName();
//            name = name.replace("'", "");
//            String email = name.replace(" ", "")+"@email.com";
//            String email1 = df.getEmailAddress();
//            String senha = df.getRandomText(6,6).replace(" ", "");
//            senha = senha.replace("'", "");
//            String telefone = df.getNumberText(8);
//            gravarArq.printf("('"+senha+"',"+i+",'" +name+ "','"+email+"',"+false+",'"+telefone+"'),\n");
//        }
//         gravarArq.printf("('adminadmin', 100001, 'administrador', 'admin@email.com.br', TRUE, '5555-1346');");
//     arq.close();    
//GERA ARQUIVO DE INSERT DE PESSOAS

//GERA ARQUIVO DE INSERT DE ALUNOS
//       FileWriter arq = new FileWriter("A:\\alunosemcredito.txt");
//       PrintWriter gravarArq = new PrintWriter(arq);
//       gravarArq.printf("INSERT into ALUNO(codaluno, matricula, codPessoa, dtConclusao) values\n");
//        for (int i=1; i<=99999; i++){
//            String matricula = "bsi"+i;
//            String dtconclu = ""+df.getNumberBetween(2016,2025)+"/"+df.getNumberBetween(1,12)+"/"+df.getNumberBetween(1,28);
//           int creditos = df.getNumberUpTo(15);
//            gravarArq.printf("("+i+",'"+matricula+"'," +i+ ",'"+dtconclu+"'),\n");
//        }
//            gravarArq.printf("(100000,'bsi100000',100000,'2019/05/27');\n");
//            arq.close();
//GERA ARQUIVO DE INSERT DE ALUNOS           

//GERA ARQUIVO DE INSERT DE CATEGORIAS
//       FileWriter arq = new FileWriter("A:\\categoria.txt");
//       PrintWriter gravarArq = new PrintWriter(arq);
//       gravarArq.printf("INSERT into CATEGORIA(codCat, tipoCat) values\n");
//       for (int i=1; i<=99999; i++){
//           String tipocat = df.getCity().replace("'", "");
//           gravarArq.printf("("+i+",'"+tipocat+"'),\n");
//       }
//        gravarArq.printf("(100000,'Ensino'),\n");
//        gravarArq.printf("(100001,'Pesquisa'),\n");
//        gravarArq.printf("(100002,'Extensão'),\n");
//        gravarArq.printf("(100003,'Representação Estudantil');\n");
//        arq.close();   
//GERA ARQUIVO DE INSERT DE CATEGORIAS
 
//GERA ARQUIVO DE INSERT DE ATIVIDADES
//       FileWriter arq = new FileWriter("A:\\atividade.txt");
//       PrintWriter gravarArq = new PrintWriter(arq);
//       String[] avali = {"Semestre", "Publicação","Palestra", "Modulo de 30h", "Modulo de 20h", "Modulo de 50h"};
//       gravarArq.printf("INSERT into ATIVIDADE(codAtividade, valorCredito, anoRegistro, tipoAtividade, codCat, unidAvali, ativado) values\n");
//       for (int i=1; i<=99999; i++){
//           int valorcredito = df.getNumberUpTo(10);
//           String anoRegistro = ""+df.getNumberBetween(2000,2016)+"/"+df.getNumberBetween(1,12)+"/"+df.getNumberBetween(1,28);
//           String tipoAtividade = df.getRandomText(5,30).replace("'", "");
//           int codCat = df.getNumberBetween(1,100003);
//           String unidAvali = avali[df.getNumberUpTo(6)];
//           Boolean ativo = df.chance(50);
//           gravarArq.printf("("+i+","+valorcredito+",'" +anoRegistro+ "','"+tipoAtividade+"',"+codCat+",'"+unidAvali+"',"+ativo+"),\n");
//       }
//       gravarArq.printf("("+100000+","+2+",'2016/07/20','Representante turma',"+100003+",'Mandato',"+true+");\n");
//       arq.close();
//GERA ARQUIVO DE INSERT DE ATIVIDADES

//GERA ARQUIVO DE INSERT DE ADICIONA       
//       FileWriter arq = new FileWriter("A:\\adiciona.txt");
//       PrintWriter gravarArq = new PrintWriter(arq);
//       gravarArq.printf("INSERT into ADICIONA(codAtividade, codCat, codPessoa) values\n");
//       for (int i=1; i<=99999; i++){
//           int codAtividade = df.getNumberUpTo(100000);
//           int codCat = df.getNumberUpTo(100003);
//           int codPessoa = 100001;
//           gravarArq.printf("("+codAtividade+","+codCat+","+codPessoa+"),\n");
//       }
//           gravarArq.printf("(2,2,10001);\n");
//           arq.close();
//GERA ARQUIVO DE INSERT DE ADICIONA

//GERA ARQUIVO DE INSERT DE ARQUIVO 1
//        FileWriter arq = new FileWriter("A:\\arquivo1.txt");
//        PrintWriter gravarArq = new PrintWriter(arq);
//        String[] aprov = {"Deferido", "Indeferido", "Em Analise"};
//        gravarArq.printf("INSERT into ARQUIVO (codArquivo, codAtividade, codAluno, observacao, dtRealizada,creditoAtividade, arquivoDocumento, aprovado) values\n");
//        for (int i=1; i<=499999; i++){
//            int codAtividade = df.getNumberBetween(1,100000);
//            int codAluno = df.getNumberBetween(1,100000), creditoAtividade = df.getNumberUpTo(10);
//            String observacao = df.getRandomText(5,20).replace("'", "");
//            String dtRealizada = ""+df.getNumberBetween(2014,2017)+"/"+df.getNumberBetween(1,12)+"/"+df.getNumberBetween(1,28);
//            String arquivoDocumento = "'"+df.getRandomChars(8,14)+".pdf'";
//            String aprovado = aprov[df.getNumberUpTo(3)];
//            gravarArq.printf("("+i+","+codAtividade+","+codAluno+",'"+observacao+"','"+dtRealizada+"',"+creditoAtividade+","+arquivoDocumento+",'"+aprovado+"'),\n");
//        }
//            gravarArq.printf("("+500000+","+100001+","+1+",'-','2012/01/01',10,'arquivoDocumento.pdf','Deferido');\n");
//            arq.close();
//GERA ARQUIVO DE INSERT DE ARQUIVO 1    


//GERA ARQUIVO DE INSERT DE ARQUIVO 2
//        FileWriter arq = new FileWriter("A:\\arquivo2.txt");
//        PrintWriter gravarArq = new PrintWriter(arq);
//        String[] aprov = {"Deferido", "Indeferido", "Em Analise"};
//        gravarArq.printf("INSERT into ARQUIVO (codArquivo, codAtividade, codAluno, observacao, dtRealizada,creditoAtividade, arquivoDocumento, aprovado) values\n");
//        for (int i=500001; i<=999999; i++){
//            int codAtividade = df.getNumberBetween(1,100000);
//            int codAluno = df.getNumberBetween(1,100000), creditoAtividade = df.getNumberUpTo(10);        String observacao = df.getRandomText(5,20).replace("'", "");
//            String dtRealizada = ""+df.getNumberBetween(2014,2017)+"/"+df.getNumberBetween(1,12)+"/"+df.getNumberBetween(1,28);
//            String arquivoDocumento = "'"+df.getRandomChars(8,14)+".pdf'";
//            String aprovado = aprov[df.getNumberUpTo(3)];
//            gravarArq.printf("("+i+","+codAtividade+","+codAluno+",'"+observacao+"','"+dtRealizada+"',"+creditoAtividade+","+arquivoDocumento+",'"+aprovado+"'),\n");
//        }
//            gravarArq.printf("("+1000000+","+100001+","+1+",'-','2012/01/01',10,'arquivo21Documento.pdf','Deferido');\n");
//            arq.close();
//GERA ARQUIVO DE INSERT DE ARQUIVO 2   

//GERA ARQUIVO DE INSERT DE ARQUIVO 3
        FileWriter arq = new FileWriter("A:\\arquivo3.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        String[] aprov = {"Deferido", "Indeferido", "Em Analise"};
        gravarArq.printf("INSERT into ARQUIVO (codArquivo, codAtividade, codAluno, observacao, dtRealizada,creditoAtividade, arquivoDocumento, aprovado) values\n");
        for (int i=1000001; i<=1499999; i++){
            int codAtividade = df.getNumberBetween(1,100000);
            int codAluno = df.getNumberBetween(1,100000), creditoAtividade = df.getNumberUpTo(10);
            String observacao = df.getRandomText(5,20).replace("'", "");
            String dtRealizada = ""+df.getNumberBetween(2014,2017)+"/"+df.getNumberBetween(1,12)+"/"+df.getNumberBetween(1,28);
            String arquivoDocumento = "'"+df.getRandomChars(8,14)+".pdf'";
            String aprovado = aprov[df.getNumberUpTo(3)];
            gravarArq.printf("("+i+","+codAtividade+","+codAluno+",'"+observacao+"','"+dtRealizada+"',"+creditoAtividade+","+arquivoDocumento+",'"+aprovado+"'),\n");
        }
            gravarArq.printf("("+1500000+","+100001+","+1+",'-','2013/01/01',10,'21Documento.pdf','Deferido');\n");
            arq.close();
//GERA ARQUIVO DE INSERT DE ARQUIVO 3

    }
    
    
    
    
    
}
