package repositories;

import models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepositoryTest extends JpaRepository<User, Long> {
    
}
