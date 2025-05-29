package devssprint.stark.stark.repository;

import devssprint.stark.stark.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<?> getByUsername(String username);
    Optional<?> getByEmail(String email);
    Optional<?> findByUsernameAndPassword(String username, String password);
    Optional<?> findByEmailOrUsername(String email, String username);
}
