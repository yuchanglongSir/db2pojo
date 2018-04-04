package com.gyguohua.controller.;

import java.util.List;
import java.util.Date;

import com.yxd.baseservice.yxdbootstarter.pagehelper.NeedPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import com.gyguohua.model..VCategory3;
import com.gyguohua.api..IVCategory3Service;

/**
 * Controller of VCategory3
 * @author yuchanglong
 * @date 2018-4-2
 */
@Api(tags={"XXX操作接口"})
@RestController
@Slf4j
@RequestMapping("/vCategory3")
public class VCategory3Controller {
	
	@Autowired
	private IVCategory3Service vCategory3ServiceImpl;
	
	/**
     * 注解
     *
     */
    @ApiOperation("xxx查询接口")
    @GetMapping(value = "/list")
    @NeedPage
	public List<VCategory3> getList(VCategory3 search){
		return vCategory3ServiceImpl.findVCategory3All(search);
	}
	/**
     * 注解
     *
     */
    @ApiOperation("插入xxx接口")
    @PostMapping(value = "/insertVCategory3")
	public String insertVCategory3(VCategory3 entity) {
		vCategory3ServiceImpl.insertVCategory3(entity);
		return "操作成功";
	}
	/**
     * 注解
     *
     */
    @ApiOperation("更新xxx接口")
    @PutMapping(value = "/updateVCategory3")
	public String updateVCategory3(VCategory3 entity) {
		vCategory3ServiceImpl.updateVCategory3(entity);
		return "操作成功";
	}
	
	/**
     * 	多个用逗号隔开（英文逗号）例如：1,2,3
     *
     */
    @ApiOperation("删除xxx接口")
    @DeleteMapping(value = "/deleteVCategory3ByIds")
	public String del(String ids) {
		vCategory3ServiceImpl.deleteVCategory3ByIds(ids);
		return "操作成功";
	}
}
