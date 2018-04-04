package com.gyguohua.controller.user;

import java.util.List;
import java.util.Date;

import com.yxd.baseservice.yxdbootstarter.pagehelper.NeedPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import com.gyguohua.model.user.SUser;
import com.gyguohua.api.user.ISUserService;

/**
 * Controller of SUser
 * @author yuchanglong
 * @date 2018-4-2
 */
@Api(tags={"XXX操作接口"})
@RestController
@Slf4j
@RequestMapping("/sUser")
public class SUserController {
	
	@Autowired
	private ISUserService sUserServiceImpl;
	
	/**
     * 注解
     *
     */
    @ApiOperation("xxx查询接口")
    @GetMapping(value = "/list")
    @NeedPage
	public List<SUser> getList(SUser search){
		return sUserServiceImpl.findSUserAll(search);
	}
	/**
     * 注解
     *
     */
    @ApiOperation("插入xxx接口")
    @PostMapping(value = "/insertSUser")
	public String insertSUser(SUser entity) {
		sUserServiceImpl.insertSUser(entity);
		return "操作成功";
	}
	/**
     * 注解
     *
     */
    @ApiOperation("更新xxx接口")
    @PutMapping(value = "/updateSUser")
	public String updateSUser(SUser entity) {
		sUserServiceImpl.updateSUser(entity);
		return "操作成功";
	}
	
	/**
     * 	多个用逗号隔开（英文逗号）例如：1,2,3
     *
     */
    @ApiOperation("删除xxx接口")
    @DeleteMapping(value = "/deleteSUserByIds")
	public String del(String ids) {
		sUserServiceImpl.deleteSUserByIds(ids);
		return "操作成功";
	}
}
