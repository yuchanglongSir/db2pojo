package com.gyguohua..impl;

import com.gyguohua.api..IVHealthDirectService;
import com.gyguohua.model..VHealthDirect;
import com.gyguohua..mapper.VHealthDirectMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service Implementation:VHealthDirect
 * @author yuchanglong
 * @date 2018-4-2
 */
@Service
@Slf4j
public class VHealthDirectServiceImpl implements IVHealthDirectService {

	@Autowired
	private VHealthDirectMapper vHealthDirectMapper;
	
	/**
	 * 
    * 新增VHealthDirect
    * @param entity
	* @Title: saveVHealthDirect
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void insertVHealthDirect(VHealthDirect entity){
		vHealthDirectMapper.insert(entity);
	};
	
	/**
	* 批量新增VHealthDirect
	* @param entity
	* @Title: batchSaveVHealthDirect 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void batchInsertVHealthDirect(List<VHealthDirect> entity){
		vHealthDirectMapper.batchInsert(entity);
	};
	
	/**
	* 编辑VHealthDirect
	* @param entity
	* @Title: updateVHealthDirect 
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void updateVHealthDirect(VHealthDirect entity){
		vHealthDirectMapper.update(entity);
	};
	
	/**
	* 根据id删除VHealthDirect
	* @Title: deleteVHealthDirectById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	 @Override
	public void deleteVHealthDirectById(String id){
		vHealthDirectMapper.deleteById(id);
	};
	
	/**
	* 根据id批量删除VHealthDirect
	* @Title: deleteVHealthDirectByIds 
	* @param ids
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public void deleteVHealthDirectByIds(String ids){
		if (ids != null && !("").equals(ids)) {
            String[] idsArr = ids.split(",");
            vHealthDirectMapper.deleteByIds(idsArr);
        }
	};
	
	/**
	* 根据id查询
	* @Title: findVHealthDirectById 
	* @param id
	* @return void    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public VHealthDirect findVHealthDirectById(String id){
		return vHealthDirectMapper.findById(id);
	};
	
	/**
	* 查询全部
	* @Title: findVHealthDirectAll
	* @return List<VHealthDirect>    返回类型 
	* @date 2018-4-2
	* @user by yuchanglong
	 */
	@Override
	public List<VHealthDirect> findVHealthDirectAll(VHealthDirect search){
		return vHealthDirectMapper.findAll(search);
	};
	
}
