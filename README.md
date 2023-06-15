# spring-boot-next-study

<ol>
  <li>Adicionar ao pom.xml as dependências do JPA, do MySQL e do H2 (para uso futuro).</li>
  <li>Adicionar ao application.properties as propriedades de conexão com o banco de dados.</li>
  <li>Criar tabela USR_USER no banco de dados.</li>
  <li>Através de anotações, estabelecer a relação entre a classe User e a tabela USR_USER.</li>
  <li>Criar interface UserRepository, que herda de JpaRepository<User,Long></li>
  <li>Declarar como atributo de UserController o UserRepository e anotar ele como @Autowired.</li>
  <li>Alterar os métodos de UserController para usar o repositório em vez do array list.</li>
</lo>
