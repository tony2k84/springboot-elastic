package com.springelastic.springelastic.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.springelastic.springelastic.model.Candidate;


public interface CandidateRepository extends ElasticsearchRepository<Candidate, String> {

	List<Candidate> findAll();
    List<Candidate> findByName(String name);
}
