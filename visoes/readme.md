### 3.5.3	SELECT DAS VISÕES COM PRIMEIROS 10 REGISTROS<br>

#### Visão 1
 create view visao_resultados as select * from ARQUIVO where codaluno =36997;
Exibi a situaçao de todos os arquivos que o aluno ja enviou, uma view estrategica, visto que não seria interessante deixar um aluno ter acesso do andamento das atividades de outros.<br>
  Select * from visao_resultados limit 10;<br>
  ![Alt text](https://github.com/calosguilherme/template/blob/master/visoes/view-b.png?);


#### Visão 2
create view visao_avaliador as select * from ARQUIVO where aprovado = 'Deferido'<br>
Exibi somente atividades que ainda não foram aprovadas, é uma view operacional visto que se fossem exibidas todas as atividades para o avaliador iria retardar o processo e deixar a pagina confusa, por o avaliador não precisar de ver as já aprovadas<br>
  ![Alt text](https://github.com/calosguilherme/template/blob/master/visoes/view-a.png?);
