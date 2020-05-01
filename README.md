# EventControl-JavaWeb
Aplicação desenvolvida Em Java Web para controle de eventos 

## Caso de implementação 
Você foi contratado para desenvolver um sistema web de controle de eventos. De acordo com o projeto, o sistema deve possuir dois módulos, um público e outro privado, que pode somente ser acessado por um administrador do sistema. Além disso, ele deve ser desenvolvido usando-se o modelo MVC de desenvolvimento Java Web.
 

O módulo público deve ser acessado através um uma URL nos moldes de:
http://localhost:8084/eventos/

Já o módulo privado pode ser acessado através de uma URL nos moldes de:
http://localhost:8084/eventos/admin/
 

O módulo público permite que alunos se inscrevam em eventos e em suas palestras. Também deve permitir que ele consulte sua situação junto a organização do evento, como, por exemplo, se a inscrição foi aceita e efetivada. Não há limites de quantas palestras um aluno pode se inscrever, contudo elas não podem coincidir no mesmo dia e horário. Uma palestra tem um número máximo de participantes, assim, um aluno não pode se inscrever no evento caso o total de inscritos seja atingido. Também deve existir uma tela que permita ao aluno atualizar suas informações cadastradas.
 

O módulo de administração deve permitir o cadastramento de eventos, palestras, estados, cidades e fazer a confirmação de inscrição de alunos. Ele deve permitir que relatórios sejam emitidos para as confirmações das informações e emissão das listas de presença para as palestras. Ele também deve permitir o gerenciamento dos usuários cadastrados com permissão de administração.
 

Em ambos os módulos deve ser feita uma autenticação de usuário, no caso da administração um usuário do sistema deve ser usado, no caso do módulo público um aluno cadastrado deve ser usado. Assim, o primeiro passo para a matrícula em um evento é o cadastramento do aluno. Uma vez cadastrado, ele poderá efetuar o login no módulo e efetuar as inscrições nos eventos/palestras.
