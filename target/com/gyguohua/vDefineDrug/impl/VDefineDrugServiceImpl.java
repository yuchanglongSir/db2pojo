package com.gyguohua..impl;

import com.gyguohua.api..IVDefineDrugService;
import com.gyguohua.model..VDefineDrug;
import com.gyguohua..mapper.VDefineDrugMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:VDefineDrug
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class VDefineDrugServiceImpl implements IVDefineDrugService {

	@Autowired
	private VDefineDrugMapper vDefineDrugMapper;
	
	/**
	 * 
    * 新增VDefineDrug
    * @param entity
	* @Title: saveVDefineDrug
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertVDefineDrug(VDefineDrug entity){
		vDefineDrugMapper.insert(entity);
	};
	
	/**
	* 批量新增VDefineDrug
	* @param entity
	* @Title: batchSaveVDefineDrug 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertVDefineDrug(List<VDefineDrug> entity){
		vDefineDrugMapper.batchInsert(entity);
	};
	
	/**
	* 编辑VDefineDrug
	* @param entity
	* @Title: updateVDefineDrug 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateVDefineDrug(VDefineDrug entity){
		vDefineDrugMapper.update(entity);
	};
	
	/**
	* 根据id删除VDefineDrug
	* @Title: deleteVDefineDrugById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteVDefineDrugById(String id){
		vDefineDrugMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除VDefineDrug
	* @Title: deleteVDefineDrugByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteVDefineDrugByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            vDefineDrugMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findVDefineDrugById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public VDefineDrug findVDefineDrugById(String id){
		return vDefineDrugMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findVDefineDrugAll
	* @return List<VDefineDrug>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<VDefineDrug> findVDefineDrugAll(VDefineDrug search){
		return vDefineDrugMapper.findAll(search);
	};
	
}
