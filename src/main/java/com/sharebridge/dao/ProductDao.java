package com.sharebridge.dao;

import java.util.List;

import com.sharebridge.dto.CategoryDto;
import com.sharebridge.dto.ProductDto;

public interface ProductDao {
	List<CategoryDto> allCategory();
	
	int insertProduct(ProductDto dto);
	
	int getProductCountByMemberId(int memberId);
}
