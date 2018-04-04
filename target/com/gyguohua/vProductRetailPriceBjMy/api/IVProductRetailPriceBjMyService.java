package com.gyguohua.;

import java.util.List;
import com.gyguohua.model..VProductRetailPriceBjMy;
/**
 * Service Interface:VProductRetailPriceBjMy
 * @author yuchanglong
 * @date 2018-4-2
 */
public interface IVProductRetailPriceBjMyService  {

	/**
	* 新增VProductRetailPriceBjMy
	* @Title: saveVProductRetailPriceBjMy
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void insertVProductRetailPriceBjMy(VProductRetailPriceBjMy entity);
	
	/**
	* 批量新增VProductRetailPriceBjMy
	* @param list
	* @Title: batchSaveVProductRetailPriceBjMy 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void batchInsertVProductRetailPriceBjMy(List<VProductRetailPriceBjMy> list);
	
	/**
	* 编辑VProductRetailPriceBjMy
	* @Title: updateVProductRetailPriceBjMy 
	* @param entity
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void updateVProductRetailPriceBjMy(VProductRetailPriceBjMy entity);
	
	/**
	* 根据id删除VProductRetailPriceBjMy
	* @Title: deleteVProductRetailPriceBjMyById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVProductRetailPriceBjMyById(String id);
	
	/**
	* 根据id批量删除VProductRetailPriceBjMy
	* @Title: deleteVProductRetailPriceBjMyByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	void deleteVProductRetailPriceBjMyByIds(String ids);
	
	/**
	* 根据id查询
	* @Title: findVProductRetailPriceBjMyById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	VProductRetailPriceBjMy findVProductRetailPriceBjMyById(String id);
	
	/**
	* 查询全部
	* @param search
	* @Title: findVProductRetailPriceBjMyAll
	* @return List<VProductRetailPriceBjMy>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	List<VProductRetailPriceBjMy> findVProductRetailPriceBjMyAll(VProductRetailPriceBjMy search);
	
}