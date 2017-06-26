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
public class javabd {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException{
        
        DataFactory df = new DataFactory();
// GERA ARQUIVO DE INSERT DE PESSOAS
//        FileWriter arq = new FileWriter("A:\\pessoa.txt");
//        PrintWriter gravarArq = new PrintWriter(arq);
//        gravarArq.printf("INSERT INTO PESSOA (senha, codpessoa, nome, email, codPermissao) VALUES\n");
//        for (int i=1; i<=100000; i++){
//            String name = df.getFirstName() + " "+ df.getLastName();
//            name = name.replace("'", "");
//            String email = name.replace(" ", "")+"@email.com";
//            String email1 = df.getEmailAddress();
//            String senha = df.getRandomText(6,6).replace(" ", "");
//            senha = senha.replace("'", "");
//            gravarArq.printf("('"+senha+"',"+i+",'" +name+ "','"+email+"',"+2+"),\n");
//        }
//         gravarArq.printf("('adminadmin', 100001, 'administrador', 'admin@email.com.br', 1);");
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

//GERA ARQUIVO DE INSERT DE HISTORICO
//       FileWriter arq = new FileWriter("A:\\historico.sql");
//       PrintWriter gravarArq = new PrintWriter(arq);
//       gravarArq.printf("INSERT into HISTORICO(codHistorico, dtAlteracao, valorCreditoOld, codAtividade) values\n");
//       for (int i=1; i<=999; i++){
//           String dtAlteracao = ""+df.getNumberBetween(1999,2011)+"/"+df.getNumberBetween(1,12)+"/"+df.getNumberBetween(1,28);
//           int valorCreditoOld =  df.getNumberBetween(1,11), codAtividade = df.getNumberBetween(1,11);
//           gravarArq.printf("("+i+",'"+dtAlteracao+"', "+valorCreditoOld+", "+codAtividade+"),\n");
//       }
//        gravarArq.printf("(1000,'2010/01/01',5,3);");
//        arq.close();   
////GERA ARQUIVO DE INSERT DE HISTORICO
 
//GERA ARQUIVO DE INSERT DE OBSERVACAO
//       FileWriter arq = new FileWriter("A:\\observacao.sql");
//       PrintWriter gravarArq = new PrintWriter(arq);
//       gravarArq.printf("INSERT into OBSERVACAO(codObservacao, informacao, codArquivo) values\n");
//       for (int i=1; i<=99999; i++){
//           String informacao = df.getRandomText(5,30).replace("'", "");
//           gravarArq.printf("("+i+",'"+informacao+"',"+i+"),\n");
//       }
//       gravarArq.printf("("+100000+",'Representdsade tursasama',"+100000+");\n");
//       arq.close();
//GERA ARQUIVO DE INSERT DE OBSERVACAO

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



//GERA ARQUIVO DE INSERT DE ARQUIVO
//        FileWriter arq = new FileWriter("A:\\arquivo.sql");
//        PrintWriter gravarArq = new PrintWriter(arq);
//        String[] aprov = {"Deferido", "Indeferido", "Em Analise"};
//        gravarArq.printf("INSERT into ARQUIVO (codArquivo, codAtividade, codAluno, codEstado, dtRealizada,creditoAtividade, arquivoDocumento) values\n");
//        for (int i=1; i<=1499999; i++){
//            int codAtividade = df.getNumberBetween(1,100000);
//            int codEstado = df.getNumberBetween(1,4);
//            int codAluno = df.getNumberBetween(1,100000), creditoAtividade =  df.getNumberBetween(1,11);
//            String observacao = df.getRandomText(5,20).replace("'", "");
//            String dtRealizada = ""+df.getNumberBetween(2014,2017)+"/"+df.getNumberBetween(1,12)+"/"+df.getNumberBetween(1,28);
//            String arquivoDocumento = "'"+df.getRandomChars(8,14)+".pdf'";
//            gravarArq.printf("("+i+","+codAtividade+","+codAluno+","+codEstado+",'"+dtRealizada+"',"+creditoAtividade+","+arquivoDocumento+"),\n");
//        }
//            gravarArq.printf("("+1500000+","+100001+","+1+","+1+",'2013/01/01',10,'21Documento.pdf');\n");
//            arq.close();
//GERA ARQUIVO DE INSERT DE ARQUIVO

    
//GERA ARQUIVO DE INSERT DE CONTATO     
//       FileWriter arq = new FileWriter("A:\\contato.txt");
//       PrintWriter gravarArq = new PrintWriter(arq);
//       gravarArq.printf("INSERT into CONTATO(codContato, codPessoa, telefone) values\n");
//       for (int i=1; i<=99999; i++){
//                String telefone = df.getNumberText(8);
//                gravarArq.printf("("+i+","+i+","+telefone+"),\n");       
//        }
//       gravarArq.printf("(100000,100000,27322156);\n");
//       arq.close();
//    
    }
}