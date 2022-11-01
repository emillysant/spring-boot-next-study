package br.cesar.org.aula05;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {

    long idGenerate = 1;
    List<User> users = new ArrayList<User>();

    @GetMapping("/user")
    public List<User> getUsers() {
        return this.users;
    }

    @GetMapping("/user/{varId}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "varId") long id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                return new ResponseEntity<User>(users.get(i), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(value="/user")
    public ResponseEntity <User> SaveUer(@RequestBody User entity) {
        entity.setId(this.idGenerate++);
        this.users.add(entity);
        return new ResponseEntity<User>(entity, HttpStatus.CREATED);
    }

    @DeleteMapping("/user/{varId}")
    public ResponseEntity<Object> deleteUserById(@PathVariable(value = "varId") long id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                users.remove(users.get(i));
                return new ResponseEntity<>(HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    

    
}
