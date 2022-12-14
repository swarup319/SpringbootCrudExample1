package com.curd.Example2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.crud.Example2.entity.Product;
import com.crud.Example2.repository.ProductRepository;
import com.crud.Example2.service.ProductService;

@SpringBootTest
class SpringBootCurdExample2ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	public ProductService service;
	
	@MockBean
	public ProductRepository repository;
	
	@Test
	public void GetProductTest() {
		when(repository.findAll()).thenReturn(Stream.of(new Product("Mobile",100,1000000), new Product("Laptop",50,2000000)).collect(Collectors.toList()));
		assertEquals(2,service.getProducts().size());  // assert is used to test pass or fail of test cases
	}
	
//	@Test
//	public void GetProductById() {
//		int id= 2;
//		when(repository.findById(id)).thenReturn(Stream.of(new Product("TV",20,1500000)).collect(Collectors.toList()));
//	}
}
