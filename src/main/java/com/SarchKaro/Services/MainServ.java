package com.SarchKaro.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SarchKaro.Entities.MainDetails;
import com.SarchKaro.Entities.MainRepo;

@Service
public class MainServ {
public MainServ(MainRepo repo1) {
		super();
		this.repo1 = repo1;
	}

private MainRepo repo1;
public List<MainDetails> gets(){
   return	repo1.findAll();
}
public MainDetails posting(MainDetails deta) {
	return repo1.save(deta);
}
public MainDetails get(String id) {

	return repo1.findById(id).orElse(null);
}
public void dels(String id) {
    repo1.deleteById(id);	
}
}
