package com.gyguohua.model.;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * POJO:VHealthDirect
 * 
 * @author yuchanglong
 * @date 2018-4-2
 */
 @ApiModel(value = "VHealthDirect", description = "xxx对象")
@Data
public class VHealthDirect {
	
		@ApiModelProperty(value = "", name = "id")
		private String	id;		
		@ApiModelProperty(value = "", name = "directFlag")
		private Double	directFlag;		

}
