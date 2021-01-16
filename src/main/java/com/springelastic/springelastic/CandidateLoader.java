package com.springelastic.springelastic;

import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springelastic.springelastic.model.Candidate;
import com.springelastic.springelastic.service.CandidateService;

@Component
public class CandidateLoader {

	@Autowired
	private CandidateService service;

	@PostConstruct
	public void loadData() {
		String[] names = { "Jane Doe", "John Doe", "Will Smith" };
		for (String name : names) {
			service.create(new Candidate(UUID.randomUUID().toString(), name, "Rest API"));
		}

	}
}
