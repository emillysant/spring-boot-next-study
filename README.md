# spring-boot-next-study

<ol>
  <li>1 - Adicionar ao pom.xml as dependências do JPA, do MySQL e do H2 (para uso futuro).</li>
  <li>2 - Adicionar ao application.properties as propriedades de conexão com o banco de dados.</li>
  <li>3 - Criar tabela USR_USER no banco de dados.</li>
  <li>4 - Através de anotações, estabelecer a relação entre a classe User e a tabela USR_USER.</li>
  <li>5 - Criar interface UserRepository, que herda de JpaRepository<User,Long></li>
  <li>6 - Declarar como atributo de UserController o UserRepository e anotar ele como @Autowired.</li>
  <li>7 - Alterar os métodos de UserController para usar o repositório em vez do array list.</li>
</lo>
