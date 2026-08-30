package com.ecommerce.auth_controler;


	import com.ecommerce.auth_entity.User;
	import com.ecommerce.authservice.authservice;
	import org.springframework.web.bind.annotation.*;

	@RestController
	@RequestMapping("/auth")
	@CrossOrigin(origins = "*")
	public class authcontroller {

	    private final authservice authService;

	    public authcontroller(authservice authService) {
	        this.authService = authService;
	    }

	    @PostMapping("/register")
	    public String register(@RequestBody User user) {

	        return authService.register(user);
	    }

	    @PostMapping("/login")
	    public String login(
	            @RequestParam String email,
	            @RequestParam String password) {

	        return authService.login(email, password);
	    }
	}
