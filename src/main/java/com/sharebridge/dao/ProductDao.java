package com.sharebridge.dao;

import java.util.List;

import com.sharebridge.dto.CategoryDto;
import com.sharebridge.dto.ProductDto;

public interface ProductDao {
	List<CategoryDto> getAllCategory();
	
	int insertProduct(ProductDto dto);
	
	int getProductCountByMemberId(int memberId);
	
	List<ProductDto> getAllProducts();
		
	int updateProduct(ProductDto dto);
	
	ProductDto getProduct(int product_id);
	
	CategoryDto getCate(int category_id);
	
	int delProduct(int product_id);
	
	ProductDto getProductByProduct_id(int product_id);
	
	void updateStateTo1(int product_id);
	
	void updateStateTo0(int product_id);
}
