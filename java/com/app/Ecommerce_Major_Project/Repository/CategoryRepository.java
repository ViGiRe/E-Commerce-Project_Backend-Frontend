package com.app.Ecommerce_Major_Project.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.Ecommerce_Major_Project.Model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

	

	
}
