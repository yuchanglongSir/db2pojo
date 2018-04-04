package com.gyguohua..mapper;

import com.gyguohua.model..VStandardProduct;
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
public interface VStandardProductMapper {
		/**
	* 新增VStandardProduct
	* @param entity
	* @Title: saveVStandardProduct
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(VStandardProduct entity);
	
	/**
	* 批量新增VStandardProduct
	* @param list
	* @Title: batchSaveVStandardProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<VStandardProduct> list);
	
	/**
	* 编辑VStandardProduct
	* @param entity
	* @Title: updateVStandardProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(VStandardProduct entity);
	
	/**
	* 根据id删除VStandardProduct
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除VStandardProduct
	* @param ids
	* @Title: deleteVStandardProductByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findVStandardProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VStandardProduct findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVStandardProductAll
	* @return
	* @return List<VStandardProduct>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VStandardProduct> findAll(VStandardProduct search);
	
}