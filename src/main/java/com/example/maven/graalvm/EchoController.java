package com.example.maven.graalvm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Kuchkaroff on 15/02/24
 * @project maven-graalvm
 */

@RestController
public class EchoController {

    @GetMapping("/echo")
    public Map<String, Object> echo() {
        return Map.of("STATUS", "UP");
    }

}
