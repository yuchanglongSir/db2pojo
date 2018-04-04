package com.gyguohua..impl;

import com.gyguohua.api..IMedicalService;
import com.gyguohua.model..Medical;
import com.gyguohua..mapper.MedicalMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:Medical
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class MedicalServiceImpl implements IMedicalService {

	@Autowired
	private MedicalMapper medicalMapper;
	
	/**
	 * 
    * 新增Medical
    * @param entity
	* @Title: saveMedical
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertMedical(Medical entity){
		medicalMapper.insert(entity);
	};
	
	/**
	* 批量新增Medical
	* @param entity
	* @Title: batchSaveMedical 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertMedical(List<Medical> entity){
		medicalMapper.batchInsert(entity);
	};
	
	/**
	* 编辑Medical
	* @param entity
	* @Title: updateMedical 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateMedical(Medical entity){
		medicalMapper.update(entity);
	};
	
	/**
	* 根据id删除Medical
	* @Title: deleteMedicalById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteMedicalById(String id){
		medicalMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除Medical
	* @Title: deleteMedicalByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteMedicalByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            medicalMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findMedicalById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public Medical findMedicalById(String id){
		return medicalMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findMedicalAll
	* @return List<Medical>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<Medical> findMedicalAll(Medical search){
		return medicalMapper.findAll(search);
	};
	
}
