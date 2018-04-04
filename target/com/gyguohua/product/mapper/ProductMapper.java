package com.gyguohua..mapper;

import com.gyguohua.model..Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
/**
 * Service Interface:Users
 * @author yuchanglong
 * @date 2018-4-2
 */
 @Component
@Mapper
public interface ProductMapper {
		/**
	* 新增Product
	* @param entity
	* @Title: saveProduct
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(Product entity);
	
	/**
	* 批量新增Product
	* @param list
	* @Title: batchSaveProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<Product> list);
	
	/**
	* 编辑Product
	* @param entity
	* @Title: updateProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(Product entity);
	
	/**
	* 根据id删除Product
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除Product
	* @param ids
	* @Title: deleteProductByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	Product findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findProductAll
	* @return
	* @return List<Product>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<Product> findAll(Product search);
	
}