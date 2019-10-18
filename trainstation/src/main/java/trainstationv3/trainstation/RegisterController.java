package trainstationv3.trainstation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    UserRepo repo;
    @PostMapping
    public void registerUser(@RequestParam(required = true)String email, @RequestParam(required = true) String password){
        String regexp = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$";
        if(!email.matches(regexp)){

        }
        else
        {

        }
    }
}
