package br.com.drianodev.springsecurityjwt.service;

import br.com.drianodev.springsecurityjwt.model.User;
import br.com.drianodev.springsecurityjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

    public void createUser(User user) {
        String pass = user.getPassword();
        // criptografando antes de salvar no bd
        user.setPassword(encoder.encode(pass));
        userRepository.save(user);
    }
}
