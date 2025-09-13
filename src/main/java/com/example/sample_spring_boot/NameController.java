package com.example.sample_spring_boot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class NameController {

    private final NameService nameService;

    public NameController(NameService nameService) {
        this.nameService = nameService;
    }

    /**
     * GET /api/random-name
     * Returns JSON: { "name": "..." }
     */
    @GetMapping("/random-name")
    public ResponseEntity<Map<String, String>> randomName() {
        String name = nameService.getRandomName();
        return ResponseEntity.ok(Map.of("name", name));
    }

    /**
     * Optional: GET /api/names - returns the full static list
     */
    @GetMapping("/names")
    public ResponseEntity<?> allNames() {
        return ResponseEntity.ok(nameService.getAllNames());
    }
}
