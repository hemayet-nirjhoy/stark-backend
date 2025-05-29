package devssprint.stark.stark.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AuthController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/login")
    public ResponseEntity<?> login(){
        return null;
    }
}
