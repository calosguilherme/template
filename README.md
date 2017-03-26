# TRABALHO INTEGRADO: Atividade Complementares

Trabalho desenvolvido durante as disciplinas de:
- Banco de Dados 2, 
- Engenharia de Software, 
- Programação Orientada a Objetos 2,
- Projeto de Sistemas


**INTEGRANTES DO GRUPO:** 
- Cassiano Kunsch
- Carlos Guilherme F. Pedroni<br>

        
# Sumário


# Gerência de Requisitos

## 1	Motivação e Propósitodo Sistema <br>
Com o avanço da tecnologia hoje em dia, as empresas estão cada vez mais investindo em softwares para melhorar o desenvolvimento da própria empresa e também para agilizar o trabalho de muitos de seus empregados. Mas ainda há algumas empresas que não se adaptaram a essas tecnologias. Este sistema visa melhorar e agilizar o trabalho de contagem e verificação de atividades complementares de alunos do curso superior. Com o apoio da equipe pedagógica foi possível desenvolver esse sistema de atividades complementares. Um sistema de informação que auxilie o núcleo pedagógico a controlar as atividades complementares dos alunos do curso superior, facilitando o envio por parte de alunos, agilizando o processo e o deixando mais flexivel.<br>.

## 2	Personas<br>
 | Persona | Descrição |
 | --- | --- |
 | Aluno | O aluno necessita de um sistema que fique aberto durante todo o periodo para envio de atividades, além de poder acompanhar sua situação e realizar as solicitações de crédito de maneira online.|
 | Secretaria | A secretaria necessita de receber os documentos de comprovação de crédito de forma digital.|
 | Cordenador | O cordenador necessita de relatórios referente as atividades e aos alunos.|
 | Colegiado | O colegiado necessita de fazer as avaliações de maneira digital e integrada com o academico, além de ter todos os dados de maneira digital para realizar a validação.|
<br>

## 3	Minimundo<BR> 
O sistema desenvolvido será para gerenciar e melhorar o processo de controle de atividades complementares. A principal atividade realizada é o envio de atividades dos alunos de maneira eletrônica e de fluxo continuo, a confirmação dos documentos referente as atividades realizadas pela secretaria e a avaliação feita de maneira eletrônica pelo colegiado. As atividades são divididas em Ensino, Pesquisa, Extensão e Representação Estudantil, devendo respeitar o limite máximo de 10 créditos por categoria, os resultados finais emitidos pelo colegiado seram sempre divulgados a cada final de periodo para os alunos poderem recorrer se necessário. Sobre as atividades complementares, deseja-se saber todas as subatividades de cada categoria. De alunos, deseja-se saber o ano em que possivelmente irá se formar. 
Alunos enviam arquivos. Um aluno pode enviar varios arquivos de diversas atividades complementares, respeitando o maximo de creditos por categoría. Quando um aluno envia um arquivo, o arquivo é salvo no sistema lincando-se a matricula do aluno. Para o aluno, é fundamental saber os creditos ja alcançados e a situação dos pedidos enviados.
Secretaria verifica os documentos enviados por alunos. A secretaria juntamente com o aluno verifica pelo sistema se todos os arquivos enviados estao de acordo com os arquivos apresentados pelo aluno. Ao fazer a verificaçao dos documentos, é aprovodao ou reprovado pela secretaria.
Colegiado aprova ou reprova atividades enviadas. O colegiado verifica se o documento enviado está dentro dos criterios de atividades complementares e se a quantidade solicita de créditos condiz com o documento apresentado podendo ser alterada. Caso esteja dentro dos criterios é lançando a pontuaçao da atividade diretamente no sistema. Para o colegiado é importante saber o ano/semestre em que o aluno realizou aquela atividade e que haja uma data especifica para fazer essa verificaçao pois o colegiado precisa abrir um periodo para recursos.
O coordenador verifica a situaçao de cada aluno. O coordenador tem acesso total ao sistema, podendo ver o que cada aluno ja fez de atividades complementares. Para o coordenado, é importante ter um relatorio que mostra qual a atividade mais e menos feita pelos alunos e tambem os alunos que estao finalizando o curso.
Consultas sobre as atividades complementares podem ser feitas pela internet, tanto das já realizadas quanto da situação das atividades requisitadas <br>

## 4    Requisitos de Usuários
### 4.1 Requisistos Funcionais (Histórias de Usuário)<br>
 | ID | Descrição | Prioridade |
 | --- | --- | --- |
 | RF01 | Eu, como aluno, desejo atualizar minhas informações sobre atividades complementares a qualquer momento, para ter uma maior flexibilidade na entrega. | Must |
 | RF02 | Eu, como secretária, desejo verificar se os documentos enviados pelo sistema coincidem com os documentos apresentados pelos alunos de maneira online, para não precisar de armazenar papéis de cópias de documentos.| Must |
 | RF03 | Eu, como colegiado, desejo lançar automaticamente os resultados no sistema após a validação, para tornar o processo mais ágil e dessobrecarregar a secretaria.| Must |
 | RF04 | Eu, como colegiado, desejo validar os documentos solicitados pelos alunos diretamente pelo sistema, para atender de forma mais rápida e menos trabalhosa.| Must |
 | RF05 | Eu, como colegiado, desejo verificar a situação de todos os alunos matriculados no curso de sistema de informação, para impedir que alunos perto de se formar não tenham concluído a carga horária complementar.| Must |
 | RF06 | Eu, como colegiado, desejo notificar o aluno sobre datas referentes as atividades complementares e outras informações importantes, para que o mesmo possa recorrer o mais rápido possível caso necessário e fique sempre ciente das coisas.| Could |
 | RF07 | Eu, como colegiado, desejo poder gerar relatório das atividades mais e menos realizadas, para reformular atividades complementares juntamente com colegiado. | Must |
 | RF08 | Eu , como aluno, desejo consultar meus créditos a qualquer momento, para ficar ciente da minha situação atual | Should |
 | RF09 | Eu, como colegiado, desejo inserir/desativar/editar atividades complementares que podem ser realizadas, para disponibilizar novas ou realizar alterações nas existentes. | Must |
 | RF10 | Eu, como aluno, desejo ser sugerido atividades que mais combinem com meu perfil, para facilitar a escolha das atividades que irei realizar. | Want |
 | RF11 | Eu , como aluno, desejo consultar a situação das atividades complementares enviadas a qualquer momento, para me organizar sobre  os prazos. | Could |

### 4.2	Requisitos Não Funcionais
 | ID | Descrição | Prioridade | Categoria | Escopo |
 | --- | --- | --- | --- | --- |
 | RNF01 | O sistema deve estar disponível pela Internet para o aluno, a partir dos principais navegadores disponíveis no mercado. | Must | Portabilidade | Funcionalidade |
 | RNF02 | O sistema deve conter o logo da instituição, além de suas cores no seu layout | Could | Designer | Sistema |
 | RNF03 | O sistema deve estar integrado ao correio eletrônico para o aluno ser notificado via email de novas informações  | Could | Interoperabilidade | Funcionalidade |
 | RNF04 | O sistema deve ser responsivo para que possa ser acessado de aparelhos mobiles | Must | Portabilidade | Funcionalidade |
 | RNF05 | O tempo para a realização das funções de lançamento de resultados por parte do colegiado deve ser inferior a trinta segundos, a partir da confirmação. | Must | Eficiência em relação ao tempo | Funcionalidade |
 | RNF06 | O sistema deve ter autenticação. |Must| Segurança de Acesso | Sistema |
 | RNF07 | O sistema deve evitar SQL injection . |Must| Segurança de Banco | Segurança |
 | RNF08 | O site deve assegurar a troca informações entre o sistema e os personas. |Must| Segurança de dados | Segurança |

### 4.3	Regras de Negócio
 | ID | Descrição | Prioridade | 
 | --- | --- | --- |
 | RN01 | Cada aluno tem limite maximo de 10(dez) de credito maximo por categoria. | Must |
 | RN02 | O aluno precisa cumprir um total de 15(quinze) creditos para ser aprovado | Must |
 | RN03 | O sistema precisa manter um registro do periodo e dos valores antigos de créditos caso seja alterado futuramente o valor em uma atividade complementar. | Must |
 | RN04 | As atividades enviadas devem ter seus resultados divulgados uma semana antes da data do recurso | Must |



# Desenvolvimento do Sistema
## 1.    Análise de Sistemas:
### 1.1  Subsistemas
|inserir diagrama dos subsistemas UML
### 1.2  Modelagem de Casos de uso 
inserir diagramas dos Casos de Uso (UML) e descrever brevemente.

### 1.3  Modelagem Estrutural (Modelo Conceitual)
** ATENÇO: USAR Notação Entidade-Relacionamentos se estiver fazendo BD2 e o diagrama de classes se estiver fazendo Projeto de Sistemas**
![Alt text](https://github.com/Cassianokunsch/template/blob/master/conceitual.jpg?raw=true "Modelo Conceitual")
###1.4  Modelagem Comportamental
inserir principais diagramas comportamentais da análise (principalmente, estados)
###1.5  Dicionário de Dados
[classe/entidade]: [descrição da classe]
    
    EXEMPLO:
    CLIENTE: classe/entidade que representa as informações relativas ao cliente<br>
    CPF: atributo que representa o número de Cadastro de Pessoa Física para cada cliente da empresa.<br>
    
## 2.    Projeto de Sistemas:
### 2.1  Projeto Arquitetural 
#### 2.1.1   Plataforma de Implementação e Tecnologias
O sistema será desenvolvido utilizando C#, Css, JavaScript e Bootstrap, essas ferramentas foram escolhidas pois o sistema será web para facilitar o acesso para o aluno visto a necessidade de acesso a qualquer momento e por qualquer plataforma.

#### 2.1.2   Atributos de Qualidade e Táticas
 CATEGORIAS | RNF'S | TÁTICAS | 
| --- | --- | --- |
| Facilidade de Operação | RNF05 | Prover ao usuário a capacidade de entrar com comandos que permitam operar o sistema de modo mais eficiente. Para melhorar o tempo será feito um treinamento das funcionalidades| 
| Segurança de Acesso| 	RNF06 | Identificar usuários usando login e autenticá-los por meio de senha. Dividir as permissões no sistema através de grupo de usuários|
| Portabilidade | RNF01 RNF04 | No desenvolvimento só seram utilizadas ferramentas suportadas pelos navegadores mais populares, não utilizar ferramentas como JAVA e outras que atualmente nas versões mais atuais dos navegadores não possui suporte. O site deverá ter layout pre-definidos pra telas de resoluções equivalentes a Desktop, Celular e Tablet, para isso usaremos bootstrap, Javascript e CSS que ajudaram na responsividade da tela. |
| Designer | RNF02 | Será utilizado as cores do instituto no Layout do site e suas logos |
| Interoperabilidade | RNF03 | Será utilizado uma aplicação que enviara a mensagem escrita no sistema através de um email próprio do sistema para o email de um usuário ou grupo de usuários|
| Segurança de Banco | RNF07 | Será utilizado um framework de comunicação com o banco que dará essa segurança ao sistema, como por exemplo Entity do C# |
| Segurança de dados | RNF08 | Será usado protocolo Https com SSL |

#### 2.1.3   Arquitetura de Software
Foi decidido dividir o sistema em dois subsistema, o subsistema SubAluno onde os alunos teriam acesso a uma interface propria e  somente as informações necessarias para o mesmo e o controleAtividade onde somente os administradores teriam acesso a uma intercafe propria e as informações pertinentes aos mesmo, foi decidido reparoveitar o utilitarioPersistencias para evitar a reescrita de funções que seriam utilizada em ambos as fazendo somente uma vez. Foi utilizado o utilitarioEmail para de maneira a parte do sistema encaminhar as notificações escritas dentro do sistemas para os emails dos destinatarios das notificações
![Alt text](https://github.com/Cassianokunsch/template/blob/master/proj.PNG?raw=true "Modelo Conceitual")

### 2.2. Projeto Detalhado
OBS: repetir as seções abaixo para cada subsistema
#### 2.2.1.   Projeto da Lógica de Negócio
##### Projeto do Domínio
apresentar diagrama de classes do domínio
##### Projeto da Aplicação
apresentar diagramas de sequência e mapeamento dos casos de uso para classes
#### 2.2.2.  Projeto da Interface com Usuário
##### Projeto da Visão
#### Caso queira acessar o modelo completo clique [AQUI](https://github.com/Cassianokunsch/template/blob/master/CA.pdf)
![Alt text](https://github.com/Cassianokunsch/template/blob/master/c1.PNG?raw=true "Mockup")

##### Projeto da Interação Humana
apresentar diagrama de classes da IU com controladores e diagrama de sequências. Apresentar diagrama com estados de navegação.
#### 2.2.3.  Projeto da Persistência de Dados
apresentar classes de acesso ao banco de dados. apresentar diagramas de sequência.

#### 2.4.   Padrões
##### Padrões Arquiteturais
##### Padrões de Projeto

No diagrama abaixo é destacado o padrão de projeto método fábrica que foi utilizado para melhorar a coesão e diminiuir o acoplamento entre as clases do sistema. O pode-se notar a classe FabricaDeFormatos cria os objetos FormatoPng, FormatoJpeg e FormatoGif tirando a dependencia entre a classes Main e essas classes. Vale ressaltar que o padrão utiliza um Interface Formato para diminiuir o acoplamento entre as classes.

![Alt text](https://github.com/felipefo/poo2/blob/master/Padroes_de_Projeto/Cria%C3%A7%C3%A3o/metodo_fabrica/ImagemMetodoFabrica/padrao_metodo_fabrica_conversao_imagem.png)


O padrão foi utilizado para resolver o problema de .....

O padrão foi utilizado para resolver o problema de .....


## 3.    Banco de Dados (BD)


### 3.1 Decisões do Projeto 
 **Tabela Aluno com Herança de Pessoa:** em nosso projeto optamos por utilizar a Herança do campo pessoa pois caso se necessário realizar relatórios ou consultas que envolvam além dos alunos os administradores não precisar "mesclar" duas tabelas para realizar essas operações.<br>
 **Campo valorCredito na Tabela Atividade:** foi optado por transformar uma tabela onde contia os valores dos creditos em um atributo na tabela atividade, visto que a quantidade de referencias que a tabela anterior iria fazer não ser em grande quantidade e acabar gerando um impacto negativo em vez de fornecer algum beneficio.<br>


### 3.2	Modelo Lógico<br>
![Alt text](https://github.com/Cassianokunsch/template/blob/master/logic.jpg?raw=true  "Modelo Logico")

### 3.3	MODELO FÍSICO<br>
        
        CREATE TABLE CATEGORIA (
	codCat INTEGER PRIMARY KEY,
	tipoCat VARCHAR(60)
	);

	CREATE TABLE ATIVIDADE (
	valorCredito INTEGER,
	anoRegistro DATE,
	codAtividade INTEGER PRIMARY KEY,
	tipoAtividade VARCHAR(100),
	codCat INTEGER,
	unidAvali VARCHAR(150),
	FOREIGN KEY(codCat) REFERENCES CATEGORIA (codCat)
	);

	CREATE TABLE ALUNO (
	dtConclusao DATE,
	creditos INTEGER,
	matricula VARCHAR(15) PRIMARY KEY,
	codPessoa INTEGER,
	FOREIGN KEY(codPessoa) REFERENCES PESSOA (codPessoa)
	);

	CREATE TABLE ARQUIVO (
	codArquivo INTEGER PRIMARY KEY,
	observacao VARCHAR(300),
	creditoAtividade INTEGER,
	arquivoDocumento VARCHAR(300),
	dtRealizada DATE,
	matricula VARCHAR(15),
	codAtividade INTEGER
	);

	CREATE TABLE PESSOA (
	senha VARCHAR(30),
	codPessoa INTEGER PRIMARY KEY,
	nome VARCHAR(60),
	email VARCHAR(60),
	permissõesADM BOOLEAN,
	telefone VARCHAR(15)
	);

	CREATE TABLE ADICIONA (
	codAtividade INTEGER,
	codPessoa INTEGER,
	codCat INTEGER,
	PRIMARY KEY(codAtividade,codPessoa,codCat)
	);
	
	ALTER TABLE ARQUIVO ADD FOREIGN KEY(matricula) REFERENCES ALUNO (matricula);
	ALTER TABLE ARQUIVO ADD FOREIGN KEY(codAtividade) REFERENCES ATIVIDADE (codAtividade);

        
### 3.4	INSERT APLICADO NAS TABELAS DO BANCO DE DADOS<br>
#### 3.4.1 DETALHAMENTO DAS INFORMAÇÕES
        Detalhamento sobre as informações e processo de obtenção ou geração dos dados.
        Referenciar todas as fontes referentes a:
        a) obtenção dos dados
        b) obtenção de códigos reutilizados
        c) fontes de estudo para desenvolvimento do projeto
        
####3.4.2 INCLUSÃO DO SCRIPT PARA CRIAÇÃO DE TABELAS E INSERÇÃO DOS DADOS (ARQUIVO ÚNICO COM):
        a) inclusão das instruções para criação das tabelas e estruturas de amazenamento do BD
        b) inclusão das instruções de inserção dos dados nas referidas tabelas
        c) inclusão das instruções para execução de outros procedimentos necessários

###3.5	TABELAS E PRINCIPAIS cSULTAS<br>
####3.5.1	GERACAO DE DADOS (MÍNIMO DE 1,5 MILHÃO DE REGISTROS PARA PRINCIPAL RELAÇAO)<br>
    Data de Entrega: (Data a ser definida)
<br>
OBS: Incluir para os tópicos 9.2 e 9.3 as instruções SQL + imagens (print da tela) mostrando os resultados.<br>

####3.5.2	SELECT DAS TABELAS COM PRIMEIROS 10 REGISTROS INSERIDOS<br> 
    Data de Entrega: (Data a ser definida)
<br>
####3.5.3	SELECT DAS VISÕES COM PRIMEIROS 10 REGISTROS DA VIEW<br>
        a) Descrição da view sobre que grupos de usuários (operacional/estratégico) <br>
        e necessidade ela contempla.
        b) Descrição das permissões de acesso e usuários correlacionados (após definição <br>
        destas características)
    Data de Entrega: (Data a ser definida)
<br>
####3.5.4	LISTA DE CODIGOS DAS FUNÇÕES, ASSERÇOES E TRIGGERS<br>
        Detalhamento sobre funcionalidade de cada código.
        a) Objetivo
        b) Código do objeto (função/trigger/asserção)
        c) exemplo de dados para aplicação
        d) resultados em forma de tabela/imagem
<br>
####3.5.5	Administração do banco de dados<br>
        Descrição detalhada sobre como serão executadas no banco de dados as <br>
        seguintes atividades.
        a) Segurança e autorização de acesso:
        b) Estimativas de aquisição de recursos para armazenamento e processamento da informação
        c) Planejamento de rotinas de manutenção e monitoramento do banco
        d) Plano com frequencia de análises visando otimização de performance
<br>
####3.5.6	Backup do Banco de Dados<br>
        Detalhamento do backup.
        a) Tempo
        b) Tamanho
        c) Teste de restauração (backup)
        d) Tempo para restauração
        e) Teste de restauração (script sql)
        f) Tempo para restauração (script sql)
<br>

####3.5.7	APLICAÇAO DE ÍNDICES E TESTES DE PERFORMANCE<br>
    a) Lista de índices, tipos de índices com explicação de porque foram implementados
    b) Performance esperada VS Resultados obtidos
    c) Tabela de resultados comparando velocidades antes e depois da aplicação dos índices.
<br>
    Data de Entrega: (Data a ser definida)
<br>   
####3.5.8	ANÁLISE DOS DADOS COM ORANGE<br>    
    a) aplicação de algoritmos e interpretação dos resultados
<br>
    Data de Entrega: (Data a ser definida)
<br>
###3.6	ATUALIZAÇÃO DA DOCUMENTAÇÃO/ SLIDES E ENTREGA FINAL<br>
<br>
    Data de Entrega: (Data a ser definida)
<br>
###3.7	DIFICULDADES ENCONTRADAS PELO GRUPO<br>  




#Gestão de Configuração
##1.    Metodologia
descrever metodologias e políticas que serão usadas para realizar a gestão de configuração como, por exemplo, Gitflow, rastreabilidade de requisitos e mudanças. É necessário descrever em detalhes os procedimentos.
##2.    Arquitetura
descrever ferramentas e a integração dessas para a arquitetura. 
##3.    Integração Contínua e Delivery Contínua
Descrever como será aplicado esses conceitos.

#Gestão de Projetos
##1.    Project Model Canvas (PMC)
Visão geral do projeto.
##2.    Cronograma macro de sprints 
datas dos sprints.
##3.    Backlog de histórias de Usuário 
lista de histórias de usuário categorizadas, priorizadas e com o esforço. A categorização deve utilizar a técnica MoSCoW. 
Acompanhamento do projeto: o grupo deve apresentar histórico, por sprint,  do acompanhamento do projeto da seguinte forma:
- Apresentando o Burndown do projeto.
- Apresentando a velocidade do time.
- Modificações do backlog.
##4.    Burn down dos sprints
acompanhamento dos sprints. Cada Sprint deve ter uma seção descrevendo o que foi realizado e o planejado (por meio do  o gráfico e Burndown do Sprint).
##5.    Retrospectiva 
Apresentar a retrospectiva da equipe do sprint realizado.

#Gerência de Qualidade
##1.    Métricas de qualidade 
definir métricas de qualidade para cada artefato do projeto como, por exemplo, quantidade de codesmell, complexidade ciclomática e outras. 
##2.    Classes de equivalência e particionamento de equivalência 
defina as classes de equivalências para as métricas de qualidade. 

##3.    Medição 
seção que escreve como as métricas estão sendo atingidas. Essa seção deve ser atualizada por sprint. 
##4.    Testes
Técnicas utilizadas para os testes: apresentar as técnicas utilizadas para o planejamento e execução de testes como, por exemplo, teste funcional sistemático e testes estruturais. 
##5.    Cenário de Teste
apresentar todos os cenários de teste sucesso e falhas das histórias de usuário.  
##6.    Histórico  
O grupo deve apresentar a evolução da qualidade dos itens ao longo das entregas, ou seja, em outras palavras, o grupo deve apresentar o histórico de evolução da qualidade dos artefatos de software e discursar o motivo da evolução.

#Diário de Bordo

o grupo deve apresentar semanalmente um relato da atividade do grupo. O relato pode conter qualquer tipo de informação (fotos, vídeos) que possam auxiliar no entendimento das atividades do grupo. 

OBS: organize o diário para que não se misture com a documentação. de preferência, coloque-o em outra página.

**FORMATACAO NO GIT:** https://help.github.com/articles/basic-writing-and-formatting-syntax/
