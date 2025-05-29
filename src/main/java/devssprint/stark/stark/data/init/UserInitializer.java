package devssprint.stark.stark.data.init;

import devssprint.stark.stark.model.Role;
import devssprint.stark.stark.model.User;
import devssprint.stark.stark.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class UserInitializer {

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if (userRepository.findByUsername("admin").isEmpty()) {
                User admin = User.builder()
                        .username("admin")
                        .password(passwordEncoder.encode("admin123"))
                        .email("admin@example.com")
                        .roles(Set.of(Role.ADMIN, Role.USER))
                        .build();
                userRepository.save(admin);
                System.out.println("Admin user created: " + admin.getUsername());
            }
            if (userRepository.findByUsername("user").isEmpty()) {
                User user = User.builder()
                        .username("user")
                        .password(passwordEncoder.encode("user123"))
                        .email("user@example.com")
                        .roles(Set.of(Role.USER))
                        .build();
                userRepository.save(user);
                System.out.println("User created: " + user.getUsername());
            }
        };
    }
}
