package com.SarchKaro.Services;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.SarchKaro.Entities.MainDetails;
import com.SarchKaro.Entities.MainRepo;
import com.SarchKaro.Entities.SubDetails;
import com.SarchKaro.Entities.SubRepo;
@Service
public class SubServ {
    public SubServ(SubRepo repo2,MainRepo repo1) {
		super();
		this.repo2 = repo2;
		this.repo1 = repo1;
	}
	private SubRepo repo2;
	private MainRepo repo1;
	public List<SubDetails> gets(String id) {
//		MainDetails mains = repo1.findById(id).orElse(null);
		List<SubDetails> all = repo2.findAll();
		all.stream().filter(a->a.getMain().getProdName().equals(id));
		return all;
	}
	public SubDetails posting(String id, SubDetails deta) {
	      MainDetails id2 = repo1.getById(id);
		deta.setMain(id2);
		SubDetails save = repo2.save(deta);
		return save;
	}
	public void dels(String id, int size) {
       MainDetails else1 = repo1.findById(id).orElse(null);		
       List<SubDetails> all = repo2.findAll();
       
       
       
       Stream<SubDetails> filter = all.stream().filter(a->a.getMain().equals(else1) );
       Iterator<SubDetails> ab=filter.iterator();
       while(ab.hasNext()) {
    	   int size2 = ab.next().getSize();
		if(size2==size) {
    		   repo2.deleteById(size2);
    	   }
	}
 
       
	}

}
