package com.SarchKaro.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SarchKaro.Entities.MainDetails;
import com.SarchKaro.Entities.SubDetails;
import com.SarchKaro.Services.MainServ;
import com.SarchKaro.Services.SubServ;

@RestController
public class SubController {

	public SubController(SubServ serv2) {
		super();
		this.serv2 = serv2;
	}
	private SubServ serv2;
    @GetMapping("products/{id}/show")
	public List<SubDetails> getall(@PathVariable("id") String id) {
		return serv2.gets(id);
	}
 
    @PostMapping("products/{id}")
    public SubDetails posts(@RequestBody SubDetails deta,@PathVariable("id") String id) {
    	return serv2.posting(id,deta);
    }
    @DeleteMapping("products/{id}/{size}")
    public void deletes(@PathVariable("id") String id,@PathVariable("size") int size) {
    	serv2.dels(id,size);
    }

}
