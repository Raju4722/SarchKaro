package com.SarchKaro.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SarchKaro.Entities.MainDetails;
import com.SarchKaro.Services.MainServ;

@RestController
public class MainController {

	public MainController(MainServ serv1) {
		super();
		this.serv1 = serv1;
	}
	private MainServ serv1;
    @GetMapping("products")
	public List<MainDetails> getall() {
		return serv1.gets();
	}
    @GetMapping("products/{id}")
	public MainDetails getone(@PathVariable("id") String id) {
		return serv1.get(id);
	}
    @PostMapping("products")
    public MainDetails posts(@RequestBody MainDetails deta) {
    	return serv1.posting(deta);
    }
    @DeleteMapping("products/{id}")
    public void deletes(@PathVariable("id") String id) {
    	serv1.dels(id);
    }

}
