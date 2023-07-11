package com.finalproject.user.controller.user;


import com.finalproject.user.controller.demo.UserRest;
import com.finalproject.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/sayHello")
    public String sayHello(){
        String id = userService.getId();
        return "user management....id is " + id;
    }

    @PostMapping("/id")
    public String getId(){
        return userService.getId();
    }

    @GetMapping("/status/check")
//    @Scope("SCOPE_profile")
    public String status() {
        return "Working...";
    }

//    @PreAuthorize("hasAuthority('ROLE_USER')")
//    @Secured("ROLE_USER")
    @DeleteMapping(path = "/{id}")
    public String deleteUser(@PathVariable String id) {
        return "Deleted user with id " + id;
    }


//    @PostAuthorize("returnObject.userId == 'aaa'")
    @GetMapping(path = "/{id}")
    public UserRest getUser(@PathVariable String id) {
        System.out.println("has been executed");
        return new UserRest("Sergey", "Kargopolov",id);
    }

}