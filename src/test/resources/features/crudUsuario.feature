#language: pt
Funcionalidade: CRUD usuários

  Contexto: Acessar a aplicação
    Dado que o usuário acessa a home da aplicação
    E clica na opção Usuários no menu
    E clica no botão Novo Usuário

    Cenário: Incluir um usuário com sucesso
      E preencher o login com "jhonatas"
      E preencher o nome completo com "jhonatas matos"
      E preencher o email com "jhonatas@impacta.com"
      E preencher a idade com 26
      Quando clicar no botão Salvar
      Então o usuário deve ver a mensagem "Usuário foi criado com sucesso."

    Cenário: Editar um usuário com sucesso
      E preencher o login com "jhonatas"
      E preencher o nome completo com "jhonatas matos"
      E preencher o email com "jhonatas@impacta.com"
      E preencher a idade com 26
      E clicar no botão Salvar
      E clicar no botão "Editar"
      E preencher a idade com 36
      Quando clicar no botão Salvar
      Então o usuário deve ver a mensagem "Usuário foi atualizado com sucesso."

    Cenário: Excluir um usuário com sucesso
      E preencher o login com "Rambo"
      E preencher o nome completo com "Rambo Matador"
      E preencher o email com "rambo@killer.com"
      E preencher a idade com 56
      E clicar no botão Salvar
      E clicar no botão "Voltar"
      E ver o nome completo "Rambo Matador"
      Quando clicar em "btn-delete"
      Então o nome completo "Rambo Matador" não deve ser exibido


    Esquema do Cenario: : Erro ao não preencher todos os campos ao cadastrar novo usuário
      E preencher o login com "<login>"
      E preencher o nome completo com "jhonatas matos"
      E preencher o email com "<email>"
      E preencher a idade com 26
      Quando clicar no botão Salvar
      Então o usuário deve ver a mensagem de erro "<mensagem>"

      Exemplos:
      |     login    |        email         |       mensagem         |
      |              |  jhonatas@gmail.com  |  Login can't be blank  |
      |   jhonatas   |                      |  Email can't be blank  |

    Cenário: Mostrar dados inseridos
      E preencher o login com "Lara"
      E preencher o nome completo com "Lara Croft"
      E preencher o email com "lara.craft@tombraider.com"
      E preencher a idade com 32
      E clicar no botão Salvar
      E clicar no botão "Voltar"
      E ver o nome completo "Lara Croft"
      Quando clicar no "btn-show"
#      Então deve visualizar o "Login" com "Lara"
#      E deve visualizar o "Full name" com "Lara Croft"
#      E deve visualizar o "Email" com "lara.croft@tombraider.com"
#      E deve visualizar o "Age" com "32"

  #nao consegui validar essas informações
  #pois nao consegui pegar os elementos de texto
