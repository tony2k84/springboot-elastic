package com.springelastic.springelastic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springelastic.springelastic.model.Candidate;
import com.springelastic.springelastic.service.CandidateService;

@RestController
public class CandidateController {

	@Autowired
	private CandidateService service;

	@GetMapping("/candidates")
	public List<Candidate> findAll() {
		return service.findAll();
	}
}
