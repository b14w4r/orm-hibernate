package org.example.service;

import org.springframework.stereotype.Service;
import org.example.repository.UserRepository;
import org.example.entity.User;
import java.util.List;

@Service
public class SeedService {
    private final UserRepository repo;

    public SeedService(UserRepository repo) {
        this.repo = repo;
    }

    public void seed() {
        if (repo.count() == 0) {
            repo.saveAll(List.of(
                new User("Alice", "alice@example.com"),
                new User("Bob", "bob@example.com")
            ));
        }
    }
}
