package com.springelastic.springelastic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springelastic.springelastic.model.Candidate;
import com.springelastic.springelastic.repository.CandidateRepository;

@Service
public class CandidateService {

	@Autowired
	private CandidateRepository repo;

	public List<Candidate> findAll() {
		return repo.findAll();
	}

	public List<Candidate> findByTitle(String name) {
		return repo.findByName(name);
	}

	public void create(Candidate candidate) {
		repo.save(candidate);
	}
}
