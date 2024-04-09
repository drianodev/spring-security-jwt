# Spring Security JWT

Este é um projeto de exemplo que demonstra como usar autenticação JWT (JSON Web Token) com o Spring Security.

## Descrição

Este projeto foi desenvolvido para explorar a integração de autenticação JWT em uma aplicação Spring Boot. Ele demonstra como configurar o Spring Security para autenticação baseada em token JWT e como proteger endpoints da API com diferentes níveis de autorização.

## Tecnologias Utilizadas

- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- H2 Database

## Configuração

Antes de executar o projeto, é necessário configurar a chave secreta JWT no arquivo `application.properties`:

```properties
security.config.prefix=Bearer
security.config.key=YOUR_KEY
security.config.expiration=3600000
```

Substitua `YOUR_KEY` pela sua chave secreta JWT. Esta chave é usada para assinar e verificar os tokens JWT.

## Instalação e Execução

1. Clone o repositório:

   ```bash
   git clone https://github.com/drianodev/spring-security-jwt.git
   ```

2. Acesse o diretório do projeto:

   ```bash
   cd spring-security-jwt
   ```

3. Execute o projeto usando Maven:

   ```bash
   mvn spring-boot:run
   ```

O servidor estará acessível em [http://localhost:8080](http://localhost:8080).

## Endpoints

- `/`: Endpoint de boas-vindas.
- `/login`: Endpoint para autenticação de usuários. Recebe um JSON com `username` e `password` e retorna um token JWT.
- `/users`: Endpoint para criar usuários. Requer autenticação e aceita um JSON com detalhes do usuário.
- `/managers`: Endpoint protegido acessível apenas para usuários com a role `MANAGERS`.
o e qualquer outra informação relevante.