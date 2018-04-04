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



import com.gyguohua.model..VHealthDirect;
import com.gyguohua.api..IVHealthDirectService;

/**
 * Controller of VHealthDirect
 * @author yuchanglong
 * @date 2018-4-2
 */
@Api(tags={"XXX操作接口"})
@RestController
@Slf4j
@RequestMapping("/vHealthDirect")
public class VHealthDirectController {
	
	@Autowired
	private IVHealthDirectService vHealthDirectServiceImpl;
	
	/**
     * 注解
     *
     */
    @ApiOperation("xxx查询接口")
    @GetMapping(value = "/list")
    @NeedPage
	public List<VHealthDirect> getList(VHealthDirect search){
		return vHealthDirectServiceImpl.findVHealthDirectAll(search);
	}
	/**
     * 注解
     *
     */
    @ApiOperation("插入xxx接口")
    @PostMapping(value = "/insertVHealthDirect")
	public String insertVHealthDirect(VHealthDirect entity) {
		vHealthDirectServiceImpl.insertVHealthDirect(entity);
		return "操作成功";
	}
	/**
     * 注解
     *
     */
    @ApiOperation("更新xxx接口")
    @PutMapping(value = "/updateVHealthDirect")
	public String updateVHealthDirect(VHealthDirect entity) {
		vHealthDirectServiceImpl.updateVHealthDirect(entity);
		return "操作成功";
	}
	
	/**
     * 	多个用逗号隔开（英文逗号）例如：1,2,3
     *
     */
    @ApiOperation("删除xxx接口")
    @DeleteMapping(value = "/deleteVHealthDirectByIds")
	public String del(String ids) {
		vHealthDirectServiceImpl.deleteVHealthDirectByIds(ids);
		return "操作成功";
	}
}
