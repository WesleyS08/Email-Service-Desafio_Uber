# Email-Service-Desafio_Uber


Este repositório contém um serviço de e-mail que oferece uma abstração eficiente entre diversos provedores de serviços de e-mail. Desenvolvido para fornecer flexibilidade e resiliência, o Unified Email Service permite o envio de e-mails através de provedores populares, como SendGrid, Mailgun, SparkPost e Amazon SES.

## Principais Recursos

- **Abstração de Provedores:** Escolhe automaticamente o provedor de e-mail disponível para garantir a entrega eficiente de mensagens.
  
- **Failover Rápido:** Se um provedor estiver inativo, o serviço realiza uma transição suave para um provedor alternativo, sem impacto perceptível para os usuários finais.

- **Configuração Simples:** Utilize o arquivo de configuração `config.json` para inserir as credenciais dos provedores de e-mail desejados.

- **Testes Integrados:** Inclui testes unitários e de integração para garantir a robustez e a confiabilidade do serviço.

## Como Usar

1. **Configuração:**
   - Clone este repositório.
   - Execute `npm install` para instalar as dependências.
   - Configure as credenciais dos provedores de e-mail no arquivo `config.json`.

2. **Execução:**
   - Inicie o serviço com `npm start`.
   - Acesse [http://localhost:3000](http://localhost:3000) para interagir com a API do serviço.

3. **Envio de E-mails:**
   - Utilize a API do serviço para enviar e-mails, com parâmetros como destinatário, assunto e corpo do e-mail.

## Configuração do Arquivo `config`
```json
{

  "amazonSES": {
    "accessKeyId": "sua_access_key_aws",
    "secretAccessKey": "sua_secret_key_aws",
    "region": "sua_região_aws"
  }
}
