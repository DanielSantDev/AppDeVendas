# Gerenciamento de Vendas - Aplicação Back-End

## Descrição

Este projeto é uma aplicação back-end desenvolvida em Java para gerenciamento de vendas. A aplicação oferece funcionalidades para cadastro, atualização, exclusão e consulta de clientes e produtos. Utiliza uma arquitetura robusta e tecnologias modernas para garantir eficiência e escalabilidade.

## Tecnologias Utilizadas

- **JavaEE**: Plataforma de desenvolvimento para aplicações empresariais.
- **Docker**: Ferramenta para containerização e gerenciamento de ambientes de desenvolvimento.
- **JPA (Java Persistence API)**: API para gerenciamento de dados relacionais em Java.
- **Hibernate**: Framework de mapeamento objeto-relacional (ORM) para JPA.
- **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional.
- **DAO (Data Access Object)**: Padrão de design para abstrair o acesso a dados.
- **Singleton**: Padrão de design para garantir uma única instância de uma classe.
- **Factory**: Padrão de design para criação de objetos sem expor a lógica de criação ao cliente.

## Funcionalidades

- **Cadastro**: Adiciona novos clientes e produtos ao banco de dados.
- **Atualização**: Modifica dados de clientes e produtos existentes.
- **Exclusão**: Remove clientes e produtos do banco de dados.
- **Consulta**: Recupera informações sobre clientes e produtos.

## Como Executar

1. **Configuração do Banco de Dados**:
   - Certifique-se de que o PostgreSQL está instalado e rodando.
   - Crie um banco de dados chamado `vendas_online`.

2. **Configuração do Docker**:
   - Construa a imagem Docker:
     ```bash
     docker build -t vendas-backend .
     ```
   - Execute o contêiner:
     ```bash
     docker run -p 8080:8080 vendas-backend
     ```

3. **Configuração do Projeto**:
   - Atualize o arquivo `persistence.xml` com suas credenciais de banco de dados.

4. **Execução da Aplicação**:
   - Inicie a aplicação no ambiente de desenvolvimento ou execute o contêiner Docker conforme as instruções acima.

## Contribuição

Contribuições são bem-vindas! Para contribuir, siga estas etapas:

1. Fork o repositório.
2. Crie uma nova branch (`git checkout -b feature/MinhaNovaFuncionalidade`).
3. Faça suas alterações e adicione testes se necessário.
4. Envie um pull request com uma descrição detalhada das suas mudanças.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

## Contato

Para mais informações, entre em contato !

