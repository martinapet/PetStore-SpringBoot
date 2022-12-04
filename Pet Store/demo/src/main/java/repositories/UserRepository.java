package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.User;

public interface UsersRepository extends JpaRepository<User, Long>{

    Object addUser(Object object);
    
}
