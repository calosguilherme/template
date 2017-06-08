### 3.5.3	SELECT DAS VISÕES COM PRIMEIROS 10 REGISTROS<br>

#### Visão 1
  create view visao_avaliador as select * from ARQUIVO where aprovado = 'Deferido'<br>
Exibi somente atividades que ainda não foram aprovadas, é uma view operacional visto que se fossem exibidas todas as atividades para o avaliador iria retardar o processo e deixar a pagina confusa, por o avaliador não precisar de ver as já aprovadas<br>
  Select * from visao_avaiador limit 10;<br>
![Alt text](https://github.com/calosguilherme/template/blob/master/visoes/view-a.png?);
