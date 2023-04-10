package com.Shoppingmall.OM;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;





@Service
@Transactional
public class OrderService  {

	
	@Autowired
	private OrderRepository repository;
	
	public List<OrderModule> listAll(){
		return repository.findAll();
	}
	
	public OrderModule get(Integer id) {
		return repository.findById(id) .get();	
		}
	
	public void save(OrderModule order) {
		repository.save(order);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}



}
