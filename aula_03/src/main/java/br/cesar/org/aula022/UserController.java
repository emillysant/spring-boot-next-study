package br.cesar.org.aula022;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping ("/user")
    public String getUser(
        @RequestParam (value = "name", defaultValue = "none") String name,
        @RequestParam (value = "age", defaultValue = "0") int age) {
        return "USUARIO: " + name + " IDADE: " + age;
    }

    @GetMapping ("/user/{id}")
    public User getUserById(@PathVariable (value = "id") int id) {
        return new User(id, "Cesar", "123456789", "123456");
    }

    @GetMapping("/user/signin")
    public String signin(

        @RequestParam (value = "name") String name,
        @RequestParam (value = "cpf") String cpf,
        @RequestParam (value = "password") String password,
        @RequestParam (value ="id") int id) {
            
        User temp = new User(id, name, cpf, password);

        return "";

    }
}
