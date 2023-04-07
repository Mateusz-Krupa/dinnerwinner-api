package app.dinnerwinner.api.dao;
import app.dinnerwinner.api.entitles.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

