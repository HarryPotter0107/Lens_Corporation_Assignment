package com.LensAssignment.service;

import com.LensAssignment.entity.User;
import com.LensAssignment.repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> allUsers() {
        return new ArrayList<>(userRepository.findAll());
    }

    public void logoutUser(HttpServletRequest request) {
        // Create an instance of SecurityContextLogoutHandler
        SecurityContextLogoutHandler logoutHandler = new SecurityContextLogoutHandler();

        // Invalidate the HTTP session during logout
        logoutHandler.setInvalidateHttpSession(true);


        // Perform logout using the logout handler
        logoutHandler.logout(request, null, null);

        // Clear the security context holder after logout
        SecurityContextHolder.clearContext();
    }

}
