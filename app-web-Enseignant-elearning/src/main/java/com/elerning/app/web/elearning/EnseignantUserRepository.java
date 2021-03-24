package com.elerning.app.web.elearning;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EnseignantUserRepository extends JpaRepository<Enseignant, Long> {
	@Query("SELECT u FROM Enseignant u WHERE u.email = ?1")
	public Enseignant findByEmail(String email);
	
}
