package FixItNow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @PostMapping("/test-echo")
    public ResponseEntity<String> echo(@RequestBody String body) {
        return ResponseEntity.ok("received: " + body);
    }
}