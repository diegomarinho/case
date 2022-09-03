### Readme Case de entrevista

- Kotlin
- Spring boot
- Gradle

### Base de dados em memória

- url: http://localhost:8080/h2-console/login.do
- database: jdbc:h2:mem:testdb
- user: sa
- pwd: sa

### Desafio

- Realizar um crud do Usuário
    - Salvar
    - Atualizar
    - Recuperar o usuário pelo id
- Campos que devem ser persistidos:
    - Identificador
    - Nome
    - Documento
    - Data de criação
    - Data de atualização

## Execução

Utilize os comandos Gradle abaixo para execução da aplicação:

  #### Compilar a aplicação
  ``` ./gradlew build```
  
  #### Executar a aplicação
  ```./gradlew bootRun```
 
## H2 - Console

![plot](../case/img/h2.png)
