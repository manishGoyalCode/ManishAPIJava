package com.example.sample_spring_boot;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class NameService {
    // Static list of names - change or extend as needed
    private final List<String> NAMES = List.of(
            "Aarav", "Isha", "Rohan", "Priya", "Manish",
            "Sanya", "Krishna", "Neha", "Arjun", "Kavya"
    );

    /**
     * Returns a random name from the static list.
     */
    public String getRandomName() {
        int idx = ThreadLocalRandom.current().nextInt(NAMES.size());
        return NAMES.get(idx);
    }

    /**
     * Returns all names (useful for debugging / UI).
     */
    public List<String> getAllNames() {
        return NAMES;
    }
}
