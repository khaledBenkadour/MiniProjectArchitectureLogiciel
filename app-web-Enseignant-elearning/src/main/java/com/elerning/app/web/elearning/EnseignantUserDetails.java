package com.elerning.app.web.elearning;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class EnseignantUserDetails implements UserDetails {

	private Enseignant enseignant;
	
	public EnseignantUserDetails(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return enseignant.getPassword();
	}

	@Override
	public String getUsername() {
		return enseignant.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	public String getFullName() {
		return enseignant.getFirstName() + " " + enseignant.getLastName();
	}

}
