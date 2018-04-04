package com.gyguohua..mapper;

import com.gyguohua.model..ProductInfo;
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
public interface ProductInfoMapper {
		/**
	* 新增ProductInfo
	* @param entity
	* @Title: saveProductInfo
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(ProductInfo entity);
	
	/**
	* 批量新增ProductInfo
	* @param list
	* @Title: batchSaveProductInfo 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<ProductInfo> list);
	
	/**
	* 编辑ProductInfo
	* @param entity
	* @Title: updateProductInfo 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(ProductInfo entity);
	
	/**
	* 根据id删除ProductInfo
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除ProductInfo
	* @param ids
	* @Title: deleteProductInfoByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findProductInfoById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	ProductInfo findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findProductInfoAll
	* @return
	* @return List<ProductInfo>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<ProductInfo> findAll(ProductInfo search);
	
}