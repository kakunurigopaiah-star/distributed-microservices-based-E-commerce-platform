
	package com.ecommerce.authservice;

	import com.ecommerce.auth_entity.User;
	import com.ecommerce.auth_Repository.UserRepository;
	import org.springframework.stereotype.Service;

	@Service
	public class authservice {

	    private final UserRepository userRepository;

	    public authservice(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    public String register(User user) {

	        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
	            return "Email already registered";
	        }

	        userRepository.save(user);

	        return "Registration successful";
	    }

	    public String login(String email, String password) {

	        User user = userRepository.findByEmail(email).orElse(null);

	        if (user == null) {
	            return "User not found";
	        }

	        if (!user.getPassword().equals(password)) {
	            return "Invalid password";
	        }

	        return "Login successful";
	    }
	}

