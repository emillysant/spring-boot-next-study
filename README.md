# spring-boot-next-study

1 - Adicionar ao pom.xml as dependências do JPA, do MySQL e do H2 (para uso futuro).
2 - Adicionar ao application.properties as propriedades de conexão com o banco de dados.
3 - Criar tabela USR_USER no banco de dados.
4 - Através de anotações, estabelecer a relação entre a classe User e a tabela USR_USER.
5 - Criar interface UserRepository, que herda de JpaRepository<User,Long>
6 - Declarar como atributo de UserController o UserRepository e anotar ele como @Autowired.
7 - Alterar os métodos de UserController para usar o repositório em vez do array list.
