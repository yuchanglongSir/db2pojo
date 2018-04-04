package com.gyguohua..impl;

import com.gyguohua.api..IVProductRetailPriceBjMyService;
import com.gyguohua.model..VProductRetailPriceBjMy;
import com.gyguohua..mapper.VProductRetailPriceBjMyMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:VProductRetailPriceBjMy
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class VProductRetailPriceBjMyServiceImpl implements IVProductRetailPriceBjMyService {

	@Autowired
	private VProductRetailPriceBjMyMapper vProductRetailPriceBjMyMapper;
	
	/**
	 * 
    * 新增VProductRetailPriceBjMy
    * @param entity
	* @Title: saveVProductRetailPriceBjMy
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertVProductRetailPriceBjMy(VProductRetailPriceBjMy entity){
		vProductRetailPriceBjMyMapper.insert(entity);
	};
	
	/**
	* 批量新增VProductRetailPriceBjMy
	* @param entity
	* @Title: batchSaveVProductRetailPriceBjMy 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertVProductRetailPriceBjMy(List<VProductRetailPriceBjMy> entity){
		vProductRetailPriceBjMyMapper.batchInsert(entity);
	};
	
	/**
	* 编辑VProductRetailPriceBjMy
	* @param entity
	* @Title: updateVProductRetailPriceBjMy 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateVProductRetailPriceBjMy(VProductRetailPriceBjMy entity){
		vProductRetailPriceBjMyMapper.update(entity);
	};
	
	/**
	* 根据id删除VProductRetailPriceBjMy
	* @Title: deleteVProductRetailPriceBjMyById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteVProductRetailPriceBjMyById(String id){
		vProductRetailPriceBjMyMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除VProductRetailPriceBjMy
	* @Title: deleteVProductRetailPriceBjMyByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteVProductRetailPriceBjMyByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            vProductRetailPriceBjMyMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findVProductRetailPriceBjMyById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public VProductRetailPriceBjMy findVProductRetailPriceBjMyById(String id){
		return vProductRetailPriceBjMyMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findVProductRetailPriceBjMyAll
	* @return List<VProductRetailPriceBjMy>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<VProductRetailPriceBjMy> findVProductRetailPriceBjMyAll(VProductRetailPriceBjMy search){
		return vProductRetailPriceBjMyMapper.findAll(search);
	};
	
}
