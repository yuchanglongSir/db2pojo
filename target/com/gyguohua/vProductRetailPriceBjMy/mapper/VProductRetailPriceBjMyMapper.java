package com.gyguohua..mapper;

import com.gyguohua.model..VProductRetailPriceBjMy;
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
public interface VProductRetailPriceBjMyMapper {
		/**
	* 新增VProductRetailPriceBjMy
	* @param entity
	* @Title: saveVProductRetailPriceBjMy
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insert(VProductRetailPriceBjMy entity);
	
	/**
	* 批量新增VProductRetailPriceBjMy
	* @param list
	* @Title: batchSaveVProductRetailPriceBjMy 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsert(List<VProductRetailPriceBjMy> list);
	
	/**
	* 编辑VProductRetailPriceBjMy
	* @param entity
	* @Title: updateVProductRetailPriceBjMy 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void update(VProductRetailPriceBjMy entity);
	
	/**
	* 根据id删除VProductRetailPriceBjMy
	* @param id
	* @Title: deleteById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteById(String id);
	
	/**
	* 根据id批量删除VProductRetailPriceBjMy
	* @param ids
	* @Title: deleteVProductRetailPriceBjMyByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteByIds(String [] ids);
	
	/**
	* 根据id查询
	* @param id
	* @Title: findVProductRetailPriceBjMyById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VProductRetailPriceBjMy findById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVProductRetailPriceBjMyAll
	* @return
	* @return List<VProductRetailPriceBjMy>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VProductRetailPriceBjMy> findAll(VProductRetailPriceBjMy search);
	
}