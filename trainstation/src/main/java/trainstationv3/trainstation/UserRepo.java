package trainstationv3.trainstation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{
    void createNewUser(String email, String pass);
    boolean find(String email);
}