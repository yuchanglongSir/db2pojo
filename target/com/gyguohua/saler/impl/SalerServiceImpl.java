package com.gyguohua..impl;

import com.gyguohua.api..ISalerService;
import com.gyguohua.model..Saler;
import com.gyguohua..mapper.SalerMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:Saler
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class SalerServiceImpl implements ISalerService {

	@Autowired
	private SalerMapper salerMapper;
	
	/**
	 * 
    * 新增Saler
    * @param entity
	* @Title: saveSaler
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertSaler(Saler entity){
		salerMapper.insert(entity);
	};
	
	/**
	* 批量新增Saler
	* @param entity
	* @Title: batchSaveSaler 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertSaler(List<Saler> entity){
		salerMapper.batchInsert(entity);
	};
	
	/**
	* 编辑Saler
	* @param entity
	* @Title: updateSaler 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateSaler(Saler entity){
		salerMapper.update(entity);
	};
	
	/**
	* 根据id删除Saler
	* @Title: deleteSalerById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteSalerById(String id){
		salerMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除Saler
	* @Title: deleteSalerByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteSalerByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            salerMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findSalerById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public Saler findSalerById(String id){
		return salerMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findSalerAll
	* @return List<Saler>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<Saler> findSalerAll(Saler search){
		return salerMapper.findAll(search);
	};
	
}
