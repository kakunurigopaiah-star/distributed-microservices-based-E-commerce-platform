package com.ecommerce.auth_Repository;




	import com.ecommerce.auth_entity.User;
	import org.springframework.data.jpa.repository.JpaRepository;

	import java.util.Optional;

	public interface UserRepository extends JpaRepository<User, Long> {

	    Optional<User> findByEmail(String email);
	}

