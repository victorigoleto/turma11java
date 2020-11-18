package com.GeneUnion.LeriGo.Security;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.GeneUnion.LeriGo.model.modelUsuario;
import com.GeneUnion.LeriGo.repository.repositoryUsuario;


@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private repositoryUsuario userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
		
		Optional<modelUsuario> user = userRepository.findByNome(userName);
		user.orElseThrow(()-> new UsernameNotFoundException(userName + " not found."));
		
		return user.map(UserDetailsImpl:: new).get();
	}

}
