package com.gyguohua..impl;

import com.gyguohua.api..ICatPharmacologyGradeAllService;
import com.gyguohua.model..CatPharmacologyGradeAll;
import com.gyguohua..mapper.CatPharmacologyGradeAllMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:CatPharmacologyGradeAll
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class CatPharmacologyGradeAllServiceImpl implements ICatPharmacologyGradeAllService {

	@Autowired
	private CatPharmacologyGradeAllMapper catPharmacologyGradeAllMapper;
	
	/**
	 * 
    * 新增CatPharmacologyGradeAll
    * @param entity
	* @Title: saveCatPharmacologyGradeAll
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertCatPharmacologyGradeAll(CatPharmacologyGradeAll entity){
		catPharmacologyGradeAllMapper.insert(entity);
	};
	
	/**
	* 批量新增CatPharmacologyGradeAll
	* @param entity
	* @Title: batchSaveCatPharmacologyGradeAll 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertCatPharmacologyGradeAll(List<CatPharmacologyGradeAll> entity){
		catPharmacologyGradeAllMapper.batchInsert(entity);
	};
	
	/**
	* 编辑CatPharmacologyGradeAll
	* @param entity
	* @Title: updateCatPharmacologyGradeAll 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateCatPharmacologyGradeAll(CatPharmacologyGradeAll entity){
		catPharmacologyGradeAllMapper.update(entity);
	};
	
	/**
	* 根据id删除CatPharmacologyGradeAll
	* @Title: deleteCatPharmacologyGradeAllById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteCatPharmacologyGradeAllById(String id){
		catPharmacologyGradeAllMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除CatPharmacologyGradeAll
	* @Title: deleteCatPharmacologyGradeAllByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteCatPharmacologyGradeAllByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            catPharmacologyGradeAllMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findCatPharmacologyGradeAllById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public CatPharmacologyGradeAll findCatPharmacologyGradeAllById(String id){
		return catPharmacologyGradeAllMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findCatPharmacologyGradeAllAll
	* @return List<CatPharmacologyGradeAll>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<CatPharmacologyGradeAll> findCatPharmacologyGradeAllAll(CatPharmacologyGradeAll search){
		return catPharmacologyGradeAllMapper.findAll(search);
	};
	
}
