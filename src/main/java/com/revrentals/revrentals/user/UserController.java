package com.revrentals.revrentals.user;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService=new UserService();

    @GetMapping
    public ResponseEntity<Map<String,User>> getAllUsers()
    {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping
    public ResponseEntity<User> getUserId(@PathVariable String id)
    {
        User user=userService.getUserById(id);
        if(user!=null)
        {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user)
    {
        return ResponseEntity.ok(userService.AddUser(user));
    }

    @PostMapping
    public ResponseEntity<User> deleteUser(@PathVariable String id )
    {
        return ResponseEntity.ok(userService.deleteUser(id));
    }
}
