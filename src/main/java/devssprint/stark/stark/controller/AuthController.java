package devssprint.stark.stark.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AuthController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/signing")
    public ResponseEntity<?> createAuthenticationToken(){
        return null;
    }
}
