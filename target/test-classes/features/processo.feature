#language: pt
Funcionalidade: Incluir processo com sucesso

  Cenário: Adicionar um novo processo com sucesso.
    Dado que o usuário está na página Agapito Software Testing
    E clica na opção Processos no menu
    E o usuário clicar no botão novo processo
    E o usuário digitar no campo "processo_vara" o valor "99"
    E o usuário digitar no campo "processo_numero_processo" o valor "98765"
    E o usuário digitar no campo "processo_natureza" o valor "Treta"
    E o usuário digitar no campo "processo_partes" o valor "Fred x Jason"
    E o usuário digitar no campo "processo_data_entrada" o valor "20/03/2020"
    E o usuário digitar no campo "processo_status" o valor "Agendado"
    E o usuário seleciona no campo urgencia o valor "Sim"
    E o usuário clica no campo arbitramento com o valor Sim
    Quando o usuário clicar no botão "btn-save" na página de inclusão de processos
    Então o usuário deveria visualizar a mensagem "Processo foi criado com sucesso."