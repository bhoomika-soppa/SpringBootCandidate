//package com.candidate.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//
//import com.candidate.model.Model;
//import com.candidate.repository.RepoCandidate;
//
//
//@ComponentScan("com.candidate.service.Service")
//@SpringBootApplication
//@ComponentScan({"com.delivery.request"})
//@EntityScan("com.delivery.domain")
//@EnableJpaRepositories("com.delivery.repository")
//@Service("com.candidate.repository.RepoCandidate")
//public class Service {
//	@Autowired
//	RepoCandidate repository;
//	public List<Model> GetDetails(String name){
//		return repository.findAll();
//		
//	}
//	public void AddDetails() {
//		
//	}
//	public void UpdateDetails() {
//		
//	}
//	public void DeleteDetails() {
//		
//	}
//	public List<Model> getDetailsByName(String name){	
//		return repository.findByName(name);
//		
//	}
//
//}


package com.candidate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.candidate.model.Model;
import com.candidate.repository.RepoCandidate;


@SpringBootApplication
@ComponentScan("com.candidate")
@EntityScan("com.candidate.model")
@EnableJpaRepositories("com.candidate.repository")
@Service
public class Service {
	@Autowired
	RepoCandidate repository;
	
	public List<Model> getAllDetails(){
		return repository.findAll();
	}
	
	public Model addDetails(Model model) {
		return repository.save(model);
	}
	
	public Model updateDetails(Model model) {
		return repository.save(model);
	}
	
	public void deleteDetails(Model model) {
		repository.delete(model);
	}
	
	public List<Model> getDetailsByName(String name){	
		return repository.findByName(name);
	}

}

