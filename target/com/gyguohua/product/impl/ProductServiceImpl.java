package com.gyguohua..impl;

import com.gyguohua.api..IProductService;
import com.gyguohua.model..Product;
import com.gyguohua..mapper.ProductMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:Product
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductMapper productMapper;
	
	/**
	 * 
    * 新增Product
    * @param entity
	* @Title: saveProduct
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertProduct(Product entity){
		productMapper.insert(entity);
	};
	
	/**
	* 批量新增Product
	* @param entity
	* @Title: batchSaveProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertProduct(List<Product> entity){
		productMapper.batchInsert(entity);
	};
	
	/**
	* 编辑Product
	* @param entity
	* @Title: updateProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateProduct(Product entity){
		productMapper.update(entity);
	};
	
	/**
	* 根据id删除Product
	* @Title: deleteProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteProductById(String id){
		productMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除Product
	* @Title: deleteProductByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteProductByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            productMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public Product findProductById(String id){
		return productMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findProductAll
	* @return List<Product>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<Product> findProductAll(Product search){
		return productMapper.findAll(search);
	};
	
}
