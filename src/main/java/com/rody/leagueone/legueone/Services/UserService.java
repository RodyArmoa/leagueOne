package com.rody.leagueone.legueone.Services;
import com.rody.leagueone.legueone.entities.User;
import com.rody.leagueone.legueone.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Obtener todos los usuarios
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Obtener un usuario por ID
    public Optional<User> getUserById(Integer id) {
        return userRepository.findById(id);
    }

    // Crear un nuevo usuario
    public User createUser(User user) {
        return (User) userRepository.save(user);
    }

    // Actualizar un usuario existente
    public User updateUser(Integer id, User updatedUser) {
        Optional<User> existingUser = userRepository.findById(id);
        if (existingUser.isPresent()) {
            User user = existingUser.get();
            user.setUsername(updatedUser.getUsername());
            user.setEmail(updatedUser.getEmail());
            user.setPassword(updatedUser.getPassword());
            return (User) userRepository.save(user);
        } else {
            return null; // O puedes lanzar una excepción personalizada
        }
    }

    // Eliminar un usuario por ID
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
