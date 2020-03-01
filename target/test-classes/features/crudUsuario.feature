#language: pt
Funcionalidade: CRUD usuários

  Contexto: Acessar a aplicação
    Dado que o usuário acessa a home da aplicação

    Cenário: Incluir um usuário com sucesso
      E clica na opção Usuários no menu
      E clica no botão "Novo Usuário"
      E preencher o login com "jhonatas"
      E preencher o nome completo com "jhonatas matos"
      E preencher o email com "jhonatas@impacta.com"
      E preencher a idade com 26
      Quando clicar em "Salvar"
      Então o usuário deve ver a mensagem "Usuário foi criado com sucesso."

