package com.springelastic.springelastic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "candidates")
public class Candidate {

    @Id
    private String id;
    private String name;
    private String skills;
    
    public Candidate() {
    	super();
    }
    
	public Candidate(String id, String name, String skills) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
    
    
}
