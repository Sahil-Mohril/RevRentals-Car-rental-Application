package com.revrentals.revrentals.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserService {
   private  Map<String,User> userList=new HashMap<>();

   public Map<String,User> getAllUsers()
   {
    return userList;
   }
   public User getUserById(String id)
   {
    return userList.get(id);
   }
   public User AddUser(User user)
   {
     userList.put(user.getUserId(),user);
     System.out.println("Added New User");
     return user;
   }
   public User deleteUser(String id)
   {
     User user=userList.get(id);
     userList.remove(id);
     System.out.println("User Deleted");
     return user;
   }
}
