package com.gyguohua.model.;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * POJO:Plat
 * 
 * @author yuchanglong
 * @date 2018-4-2
 */
 @ApiModel(value = "Plat", description = "xxx对象")
@Data
public class Plat {
	
		@ApiModelProperty(value = "", name = "platId")
		private String	platId;		
		@ApiModelProperty(value = "", name = "platFather")
		private String	platFather;		
		@ApiModelProperty(value = "", name = "platClass")
		private String	platClass;		
		@ApiModelProperty(value = "", name = "platGrade")
		private Double	platGrade;		
		@ApiModelProperty(value = "", name = "platName")
		private String	platName;		
		@ApiModelProperty(value = "", name = "platLevel")
		private String	platLevel;		
		@ApiModelProperty(value = "", name = "platDesc")
		private String	platDesc;		
		@ApiModelProperty(value = "", name = "platRoot")
		private String	platRoot;		
		@ApiModelProperty(value = "", name = "platCode")
		private String	platCode;		

}
