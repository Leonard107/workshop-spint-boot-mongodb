package com.leonard.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonard.workshopmongo.domain.Post;
import com.leonard.workshopmongo.domain.User;
import com.leonard.workshopmongo.repository.PostRepository;
import com.leonard.workshopmongo.services.exception.ObjectNotFoundException;

@Service	
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public List<Post> findAll() {
		return repo.findAll();
	}
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
