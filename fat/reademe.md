### 3.5.4	LISTA DE CODIGOS DAS FUNÇÕES, ASSERÇOES E TRIGGERS<br>

#### Trigger 1<br>
   ##### -Essa trigger impede que o aluno envio uma solicitação com menos que 0 de creditos ou menos ou que o operador do sistema não altere por engano o valor para menor que 0.<br>
   ##### -Trigger valorminimoCredito<br>

   			CREATE FUNCTION valorminimoCredito() RETURNS TRIGGER AS '
			BEGIN
			IF EXISTS (SELECT creditoAtividade from Arquivo
					   where creditoAtividade < 0)
			THEN
			RAISE EXCEPTION ''Erro: A quantidade de creditos deve ser maior que zero '';
			END IF;
			RETURN NULL;
			END
			'
			LANGUAGE plpgsql;
			CREATE TRIGGER checkCredito
			AFTER INSERT OR UPDATE OF creditoAtividade ON Arquivo
			FOR EACH ROW
			EXECUTE PROCEDURE valorminimoCredito()

#####Impedindo que aluno cadastre arquivos com valores negativos<br>

INSERT INTO arquivo (creditoatividade, arquivodocumento, dtrealizada, codarquivo, codaluno, codatividade, codestado)
VALUES (-2, 'asodijasoij.pdf', '2017-01-12', 1500002, 31957, 11,1)<br>
![Alt text](https://raw.githubusercontent.com/calosguilherme/template/master/exemplo2.png?raw=true "Pós Index")<br>

#### Trigger 2<br>
   ##### -Essa trigger impede que o operador do sistema crie alguma atividade complementar com valor maximo de créditos menor ou igual a 0.<br>
   ##### -Trigger valorminimoAtividade<br>
   
			CREATE FUNCTION valorminimoAtividade() RETURNS TRIGGER AS '
			BEGIN
			IF EXISTS (SELECT valorCredito from Atividade
					   where valorCredito <= 0)
			THEN
			RAISE EXCEPTION ''Erro: A quantidade de creditos deve ser maior que zero '';
			END IF;
			RETURN NULL;
			END
			'
			LANGUAGE plpgsql;
			CREATE TRIGGER checkCredito
			AFTER INSERT OR UPDATE OF valorCredito ON Atividade
			FOR EACH ROW
			EXECUTE PROCEDURE valorminimoAtividade()
			
##### Tentando inserir o valor de -5 no valor do crédiro. a Trigger acima retorna mensagem de erro para valores negativos neste campo.<br>
INSERT into ATIVIDADE(codAtividade, valorCredito, anoRegistro, tipoAtividade, codCat, unidAvali, ativo)
values (12, -5, '2012/01/01', 'Estágio extracurricular na instituição', 1, 'Semestre', True);
![Alt text](https://raw.githubusercontent.com/calosguilherme/template/master/exemplo1.png?raw=true "Pós Index")<br>

#### Asserção 1<br>
   ##### -Essa asserção impede que os alunos solicitem creditos maior que a quantidade maxima que cada categoria permite, que no caso é 10.<br>
   ##### -Asserção LIMITE_CREDITO<br>
   
			create LIMITE_CREDITO check (not exists (select * from ARQUIVO where creditoAtividade>10);
			
##### [PRINTAQUI]<br>

#### Asserção 2<br>
   ##### -Essa asserção impede que os alunos solicitem creditos maior que a quantidade maxima que a Atividade pode concede.<br>
   ##### -Asserção LIMITE_ATIVI<br>   

			create LIMITE_ATIVI check (not exists (select * from ARQUIVO inner join ATIVIDADE on ATIVIDADE.valorCredito where creditoAtividade>ATIVIDADE.valorCredito);
			
##### [PRINTAQUI]<br>

