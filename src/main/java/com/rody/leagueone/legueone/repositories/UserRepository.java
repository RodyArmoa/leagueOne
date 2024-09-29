
package com.rody.leagueone.legueone.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository<User> extends JpaRepository<User, Integer> {
    // Puedes añadir métodos personalizados si es necesario, por ejemplo:
    User findByUsername(String username);
    User findByEmail(String email);
}
