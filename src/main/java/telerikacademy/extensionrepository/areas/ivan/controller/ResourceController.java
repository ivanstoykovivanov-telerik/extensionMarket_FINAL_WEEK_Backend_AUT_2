
package telerikacademy.extensionrepository.areas.ivan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import telerikacademy.extensionrepository.areas.ivan.domain.RandomCity;
import telerikacademy.extensionrepository.areas.ivan.domain.User;
import telerikacademy.extensionrepository.areas.ivan.service.GenericService;

import java.util.List;

@RestController
@RequestMapping("/springjwt")
public class ResourceController {
    @Autowired
    private GenericService userService;

    @RequestMapping(value ="/cities")
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public List<RandomCity> getUser(){
        return userService.findAllRandomCities();
    }

    @RequestMapping(value ="/users", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public List<User> getUsers(){
        return userService.findAllUsers();
    }


    //ME
//   @PreAuthorize("hasAuthority('ADMIN_USER')")
    @PostMapping("/users/add")
    public User addUser( @RequestBody User user){
        System.out.println("**************");
        System.out.println(user.toString());
        System.out.println("**************");
        return userService.save(user);
    }

    //ME
    @PostMapping("/products/test")
    public User productTest( @RequestBody User user){
        System.out.println("**************");
        System.out.println(user.toString());
        System.out.println("**************");
        return userService.save(user);
    }
}
