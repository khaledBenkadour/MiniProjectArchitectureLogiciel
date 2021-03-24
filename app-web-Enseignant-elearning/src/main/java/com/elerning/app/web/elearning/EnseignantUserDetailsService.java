package com.elerning.app.web.elearning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
public class EnseignantUserDetailsService implements UserDetailsService {

	@Autowired
	private EnseignantUserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Enseignant user = userRepo.findByEmail(username);
		if (user == null) {
			throw new UsernameNotFoundException("Enseignant not found");
		}
		return new EnseignantUserDetails(user);
	}

}
