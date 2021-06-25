package com.example.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;

import com.example.app.entity.User;

//@Service
public interface UserService {
	public Iterable<User> FindAll();
	public Page<User> findAll(Pageable pageable);
	public Optional<User> findbyId(Long id);
	public User save(User user);
	public void deleteById(Long id);
	
	

}
