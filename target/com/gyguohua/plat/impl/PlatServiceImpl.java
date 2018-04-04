package com.gyguohua..impl;

import com.gyguohua.api..IPlatService;
import com.gyguohua.model..Plat;
import com.gyguohua..mapper.PlatMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:Plat
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class PlatServiceImpl implements IPlatService {

	@Autowired
	private PlatMapper platMapper;
	
	/**
	 * 
    * 新增Plat
    * @param entity
	* @Title: savePlat
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertPlat(Plat entity){
		platMapper.insert(entity);
	};
	
	/**
	* 批量新增Plat
	* @param entity
	* @Title: batchSavePlat 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertPlat(List<Plat> entity){
		platMapper.batchInsert(entity);
	};
	
	/**
	* 编辑Plat
	* @param entity
	* @Title: updatePlat 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updatePlat(Plat entity){
		platMapper.update(entity);
	};
	
	/**
	* 根据id删除Plat
	* @Title: deletePlatById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deletePlatById(String id){
		platMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除Plat
	* @Title: deletePlatByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deletePlatByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            platMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findPlatById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public Plat findPlatById(String id){
		return platMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findPlatAll
	* @return List<Plat>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<Plat> findPlatAll(Plat search){
		return platMapper.findAll(search);
	};
	
}
