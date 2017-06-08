### 3.5.4	LISTA DE CODIGOS DAS FUNÇÕES, ASSERÇOES E TRIGGERS<br>

#### Trigger 1<br>
   #####-Essa trigger impede que o aluno envio uma solicitação com menos que 0 de creditos ou menos ou que o operador do sistema não altere por engano o valor para menor que 0.<br>
   #####-Trigger valorminimoCredito<br>

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

#####[PRINTAQUI]
