package com.crud.Example2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.crud.Example2.entity.Product;

@Repository
@EnableJpaRepositories
public interface ProductRepository extends JpaRepository<Product,Integer> {

	Product findByName(String name);
// JpaRepository<model class name,Datatype of primary key>

}
