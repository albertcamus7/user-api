package controller;
import model.Userdto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
    public class usercontroller {

        @GetMapping("/{id}")
        public ResponseEntity<String> getUser(@PathVariable int id) {
            return ResponseEntity.ok("User with ID " + id + " fetched");
        }

        @PostMapping
        public ResponseEntity<String> createUser(@Valid @RequestBody Userdto user) {
            return ResponseEntity.ok("User created: " + user.getName() + ", Email: " + user.getEmail());
        }

        @PutMapping("/{id}")
        public ResponseEntity<String> updateUser(@PathVariable int id,
                                                 @Valid @RequestBody Userdto user) {
            return ResponseEntity.ok("User " + id + " updated");
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<String> deleteUser(@PathVariable int id) {
            return ResponseEntity.ok("User " + id + " deleted");
        }
    }


