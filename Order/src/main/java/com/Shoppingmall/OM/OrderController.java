package com.Shoppingmall.OM;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;







@RestController
public class OrderController {
	

	@Autowired
	private OrderService service;
	
	

 	//Retrieval

	@GetMapping("/orders")
   public List<OrderModule> list(){	
	return service.listAll();	
	}
	
	
	//Retrieve By Id
			@GetMapping("/orders/{id}")
	  public ResponseEntity<OrderModule> get(@PathVariable  Integer id){
		try {
			OrderModule order= service.get(id);
			return new ResponseEntity<OrderModule>(order, HttpStatus.OK);
		}
		catch (NoSuchElementException e) {
			return new ResponseEntity<OrderModule>(HttpStatus.NOT_FOUND);
		
		}
	

}//end of findByid()
	
			
			//Create
			@PostMapping("/orders")
			public void add(@RequestBody OrderModule order ) {
				service.save(order);
			}		
			
		
			//Update
			@PutMapping("/orders/{id}")
	     public ResponseEntity<?> update(@RequestBody OrderModule order,@PathVariable Integer id){
		try {
		OrderModule existOrder=service.get(id);
			service.save(order);
			return new ResponseEntity<> (HttpStatus.OK);
		} 
		catch (Exception e) {
			return new ResponseEntity<> (HttpStatus.NOT_FOUND) ;
		}
	}//end of update method	
			
		
			
			
			
			//Delete 
			
			@DeleteMapping("/orders/{id}")
			public void delete(@PathVariable Integer id) {
				service.delete(id);
			}
			
}
