package com.gyguohua.model.;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * POJO:VDefineDrug
 * 
 * @author yuchanglong
 * @date 2018-4-2
 */
 @ApiModel(value = "VDefineDrug", description = "xxx对象")
@Data
public class VDefineDrug {
	
		@ApiModelProperty(value = "", name = "id12")
		private String	id12;		
		@ApiModelProperty(value = "", name = "code12")
		private String	code12;		
		@ApiModelProperty(value = "", name = "code")
		private String	code;		
		@ApiModelProperty(value = "", name = "name")
		private String	name;		
		@ApiModelProperty(value = "", name = "id")
		private String	id;		
		@ApiModelProperty(value = "", name = "nameChn")
		private String	nameChn;		

}
