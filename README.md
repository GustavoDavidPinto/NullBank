# 🏦 NullBank

**Sistema bancário digital desenvolvido com Java, Spring Boot, HTML, CSS e MySQL.**

O NullBank é um projeto de portfólio inspirado em plataformas bancárias digitais, criado com o objetivo de praticar e aprofundar conhecimentos em desenvolvimento de software, programação orientada a objetos, desenvolvimento web e persistência de dados.

A aplicação tem como proposta simular funcionalidades de um banco digital, oferecendo uma experiência intuitiva para gerenciamento de contas e realização de operações bancárias.

> 🚧 **Status do projeto:** Em desenvolvimento.

---

## 🎯 Objetivo do projeto

O principal objetivo do NullBank é aplicar conhecimentos teóricos em um projeto prático, explorando o desenvolvimento de uma aplicação web desde a interface do usuário até as regras de negócio e a integração com o banco de dados.

O projeto também busca desenvolver habilidades relacionadas a:

- Programação orientada a objetos com Java.
- Desenvolvimento de aplicações web com Spring Boot.
- Construção de interfaces com HTML5 e CSS3.
- Modelagem e persistência de dados com MySQL.
- Organização de código utilizando arquitetura em camadas.
- Implementação de regras de negócio e validações.
- Aplicação de boas práticas de desenvolvimento.
- Versionamento de código utilizando Git e GitHub.

## ✨ Funcionalidades

O sistema contará com funcionalidades inspiradas em operações comuns de um banco digital.

### 👤 Gerenciamento de usuários
- [ ] Cadastro de usuários.
- [ ] Autenticação e login.
- [ ] Logout.
- [ ] Consulta e atualização de dados cadastrais.
- [ ] Proteção de páginas e controle de acesso.

### 💳 Gerenciamento de contas
- [ ] Criação de contas bancárias.
- [ ] Consulta de dados da conta.
- [ ] Consulta de saldo disponível.
- [ ] Associação de contas aos respectivos usuários.

### 💰 Operações bancárias
- [ ] Depósitos.
- [ ] Saques.
- [ ] Transferências entre contas.
- [ ] Validação de saldo disponível.
- [ ] Registro das operações financeiras.

### 📊 Dashboard e extrato
- [ ] Dashboard com resumo da conta.
- [ ] Exibição do saldo atual.
- [ ] Histórico de transações.
- [ ] Identificação de depósitos, saques e transferências.
- [ ] Consulta de movimentações anteriores.

### 🔐 Segurança e qualidade
- [ ] Criptografia de senhas por meio de hash seguro.
- [ ] Autenticação e autorização com Spring Security.
- [ ] Validação de dados de entrada.
- [ ] Tratamento centralizado de exceções.
- [ ] Testes automatizados.
- [ ] Controle de transações para preservar a consistência dos saldos.

*As funcionalidades listadas representam o planejamento do projeto e serão implementadas gradualmente.*

---

## 🛠️ Tecnologias utilizadas

### Backend
- **Java** — linguagem principal para implementação das regras de negócio.
- **Spring Boot** — framework para desenvolvimento da aplicação.
- **Spring Data JPA** — persistência e acesso aos dados.
- **Spring Security** — segurança, autenticação e autorização, conforme a evolução do projeto.
- **Maven** — gerenciamento de dependências e construção da aplicação.

### Frontend
- **HTML5** — estruturação das páginas.
- **CSS3** — estilização, identidade visual e responsividade.

### Banco de dados
- **MySQL** — sistema gerenciador de banco de dados relacional utilizado para armazenar usuários, contas bancárias e transações.

### Ferramentas
- **Git** — controle de versão.
- **GitHub** — hospedagem do código-fonte e documentação.
- **IntelliJ IDEA ou outra IDE compatível** — ambiente de desenvolvimento.

*As tecnologias serão incorporadas conforme as etapas de implementação avançarem.*

---

## 🏗️ Arquitetura da aplicação

O NullBank será organizado utilizando uma arquitetura em camadas, separando as responsabilidades da aplicação para facilitar a manutenção, os testes e a evolução do código.

A estrutura conceitual será composta pelas seguintes camadas:

| Camada | Responsabilidade |
|---|---|
| Controller | Receber requisições HTTP e coordenar as respostas da aplicação. |
| Service | Implementar regras de negócio e validações bancárias. |
| Repository | Realizar operações de acesso e persistência de dados. |
| Entity/Model | Representar as entidades e os conceitos do domínio. |
| Frontend | Apresentar informações e disponibilizar a interface de interação. |
| Database | Armazenar os dados relacionais utilizando MySQL. |

### Fluxo de funcionamento

1. O usuário interage com uma página HTML.
2. A aplicação recebe a requisição por meio de um controller.
3. O service executa as validações e as regras de negócio.
4. O repository acessa ou modifica os dados persistidos no MySQL.
5. A aplicação retorna o resultado para a interface do usuário.

Essa separação permite manter as regras bancárias independentes da apresentação visual e do acesso direto aos dados.

## 🗄️ Banco de dados — MySQL

O MySQL será utilizado como banco de dados principal do NullBank, responsável pela persistência das informações necessárias ao funcionamento do sistema.

Entre as principais entidades previstas estão:

- **User:** dados cadastrais e informações relacionadas à autenticação.
- **Account:** informações da conta bancária, titularidade e saldo.
- **Transaction:** registros de depósitos, saques e transferências.

O relacionamento entre essas entidades será definido durante a etapa de modelagem do banco de dados.

A integração com Java será realizada utilizando Spring Data JPA, com mapeamento objeto-relacional das entidades.

Para garantir a consistência financeira, as operações que envolvem múltiplas alterações no banco deverão utilizar transações, assegurando que uma operação seja concluída integralmente ou revertida em caso de falha.

---

## 🚀 Como executar o projeto

As instruções abaixo representam a configuração inicial prevista. Poderão ser ajustadas conforme a estrutura definitiva do projeto.

### Pré-requisitos

Antes de iniciar, certifique-se de ter instalado:

- JDK compatível com a versão Java utilizada.
- MySQL Server.
- Maven ou Maven Wrapper.
- Git.

### 1. Clonar o repositório

```bash
git clone https://github.com/SEU-USUARIO/NullBank.git
```

Acesse a pasta do projeto:

```bash
cd NullBank
```

### 2. Criar o banco de dados

Acesse o MySQL e execute:

```sql
CREATE DATABASE nullbank;
```

### 3. Configurar a conexão

Configure as variáveis de ambiente utilizadas pela aplicação:

- `DB_URL`: endereço JDBC do banco de dados.
- `DB_USERNAME`: usuário do MySQL.
- `DB_PASSWORD`: senha do usuário do MySQL.

Exemplo de configuração no arquivo `application.properties`:

```properties
spring.datasource.url=${DB_URL:jdbc:mysql://localhost:3306/nullbank}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

As variáveis de ambiente devem estar configuradas antes da inicialização da aplicação.

**Importante:** não armazene senhas reais ou outras credenciais sensíveis no repositório.

A propriedade `spring.jpa.hibernate.ddl-auto=update` é uma configuração possível para o desenvolvimento inicial. Em etapas posteriores, o gerenciamento do esquema poderá ser feito com uma ferramenta de migração, como Flyway.

### 4. Executar a aplicação

No Linux ou macOS:

```bash
./mvnw spring-boot:run
```

No Windows:

```powershell
mvnw.cmd spring-boot:run
```

O comando deverá ser executado no diretório que contém o arquivo `pom.xml` e o Maven Wrapper.

*As instruções finais de execução serão confirmadas quando a estrutura do projeto estiver implementada.*

---

## 🧪 Testes e qualidade de código

A qualidade do sistema será aprimorada por meio de testes e validações durante o desenvolvimento.

Estão previstos:

- Testes unitários para regras de negócio.
- Testes de integração para persistência de dados.
- Validação de operações financeiras.
- Tratamento de erros e exceções.
- Verificação de consistência em transferências.
- Testes de autenticação e autorização.

O objetivo é reduzir falhas, aumentar a confiabilidade e garantir que as operações sejam executadas conforme as regras estabelecidas.

## 📚 Conhecimentos desenvolvidos

O desenvolvimento do NullBank permitirá praticar e consolidar conhecimentos em diferentes áreas da engenharia de software.

- Programação orientada a objetos.
- Estruturação de projetos Java.
- Inversão de controle e injeção de dependências.
- Desenvolvimento web com Spring Boot.
- Criação e gerenciamento de endpoints HTTP.
- Mapeamento objeto-relacional com JPA.
- Modelagem de bancos de dados relacionais.
- Consultas e manipulação de dados com MySQL.
- Validação e tratamento de exceções.
- Transações e consistência de operações financeiras.
- Segurança de aplicações web.
- Testes automatizados.
- Controle de versão com Git.

## 🗺️ Roadmap

O desenvolvimento será dividido em etapas para permitir uma evolução gradual e organizada.

- [ ] **Etapa 1:** configuração do ambiente e criação do projeto Spring Boot.
- [ ] **Etapa 2:** definição da arquitetura e estrutura de pacotes.
- [ ] **Etapa 3:** modelagem e configuração do banco de dados MySQL.
- [ ] **Etapa 4:** implementação das entidades e dos repositórios.
- [ ] **Etapa 5:** cadastro de usuários e autenticação.
- [ ] **Etapa 6:** criação e consulta de contas bancárias.
- [ ] **Etapa 7:** implementação de depósitos, saques e transferências.
- [ ] **Etapa 8:** desenvolvimento do dashboard e do extrato bancário.
- [ ] **Etapa 9:** implementação dos testes e aprimoramento da segurança.
- [ ] **Etapa 10:** documentação final e preparação para apresentação no portfólio.

---

## 🔒 Aviso de segurança

O NullBank é um projeto educacional que simula funcionalidades bancárias. Não representa uma instituição financeira real e não deve ser utilizado para movimentar dinheiro real ou armazenar informações financeiras sensíveis.

As funcionalidades serão desenvolvidas com foco em aprendizado, boas práticas de programação e evolução contínua da segurança da aplicação.

## 👨‍💻 Autor

Desenvolvido por **Gustavo David Pinto** como projeto de estudo e portfólio, com foco em Java, Spring Boot, HTML, CSS e MySQL.

---

**NullBank — aprendizado, desenvolvimento e evolução contínua.**