package com.gyguohua..mapper;

import com.gyguohua.model..VProduct;
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
public interface VProductMapper {
		/**
	* 新增VProduct
	* @param entity
	* @Title: saveVProduct
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(VProduct entity);
	
	/**
	* 批量新增VProduct
	* @param list
	* @Title: batchSaveVProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<VProduct> list);
	
	/**
	* 编辑VProduct
	* @param entity
	* @Title: updateVProduct 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(VProduct entity);
	
	/**
	* 根据id删除VProduct
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除VProduct
	* @param ids
	* @Title: deleteVProductByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findVProductById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VProduct findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVProductAll
	* @return
	* @return List<VProduct>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VProduct> findAll(VProduct search);
	
}