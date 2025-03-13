package Sonicraze.sonicraze_api.controller;


import Sonicraze.sonicraze_api.user.User;
import Sonicraze.sonicraze_api.user.UserDTO;
import Sonicraze.sonicraze_api.user.UsersRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Usercontroller {

    @Autowired
    private UsersRepository repository;

    @PostMapping
    public void registerUsers(@RequestBody @Valid UserDTO userInfo){
        repository.save(new User(userInfo));
    }

}
