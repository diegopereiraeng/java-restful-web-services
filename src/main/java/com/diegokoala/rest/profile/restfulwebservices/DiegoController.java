package com.diegokoala.rest.profile.restfulwebservices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.diegokoala.rest.profile.restfulwebservices.DiegoService;

@RestController
@RequestMapping("/diego")
public class DiegoController {
    private final DiegoService diegoService;

    public DiegoController(DiegoService diegoService) {
        this.diegoService = diegoService;
    }
    
    @PostMapping("/newversion")
    public int getNewVersion(@RequestBody int version) {
        int newversion = diegoService.getNewVersion(version);
        return newversion;
    }

    @PostMapping("/cart")
    public List getCart(@RequestBody String user) {
        List products = diegoService.getCart(user);
        return products;
    }

    @PostMapping("/status")
    public String getStatus(@RequestBody String service) {
        String status = diegoService.getStatus(service);
        return status;
    }

    @PostMapping("/userinfo")
    public String getUserInfo(@RequestBody String user) {
        String info = diegoService.getUserInfo(user);
        return info;
    }

    @GetMapping("/users")
    public List getUsers() {
        List info = diegoService.getUsers();
        return info;
    }

    @ExceptionHandler(RuntimeException.class)
    public final ResponseEntity<Exception> handleAllExceptions(RuntimeException ex) {
        return new ResponseEntity<Exception>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}