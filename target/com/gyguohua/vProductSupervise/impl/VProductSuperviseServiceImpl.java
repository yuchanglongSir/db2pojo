package com.gyguohua..impl;

import com.gyguohua.api..IVProductSuperviseService;
import com.gyguohua.model..VProductSupervise;
import com.gyguohua..mapper.VProductSuperviseMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:VProductSupervise
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class VProductSuperviseServiceImpl implements IVProductSuperviseService {

	@Autowired
	private VProductSuperviseMapper vProductSuperviseMapper;
	
	/**
	 * 
    * 新增VProductSupervise
    * @param entity
	* @Title: saveVProductSupervise
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertVProductSupervise(VProductSupervise entity){
		vProductSuperviseMapper.insert(entity);
	};
	
	/**
	* 批量新增VProductSupervise
	* @param entity
	* @Title: batchSaveVProductSupervise 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertVProductSupervise(List<VProductSupervise> entity){
		vProductSuperviseMapper.batchInsert(entity);
	};
	
	/**
	* 编辑VProductSupervise
	* @param entity
	* @Title: updateVProductSupervise 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateVProductSupervise(VProductSupervise entity){
		vProductSuperviseMapper.update(entity);
	};
	
	/**
	* 根据id删除VProductSupervise
	* @Title: deleteVProductSuperviseById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteVProductSuperviseById(String id){
		vProductSuperviseMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除VProductSupervise
	* @Title: deleteVProductSuperviseByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteVProductSuperviseByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            vProductSuperviseMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findVProductSuperviseById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public VProductSupervise findVProductSuperviseById(String id){
		return vProductSuperviseMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findVProductSuperviseAll
	* @return List<VProductSupervise>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<VProductSupervise> findVProductSuperviseAll(VProductSupervise search){
		return vProductSuperviseMapper.findAll(search);
	};
	
}
