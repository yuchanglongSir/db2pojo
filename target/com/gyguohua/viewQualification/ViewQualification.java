package com.gyguohua.model.;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * POJO:ViewQualification
 * 
 * @author yuchanglong
 * @date 2018-4-2
 */
 @ApiModel(value = "ViewQualification", description = "xxx对象")
@Data
public class ViewQualification {
	
		@ApiModelProperty(value = "", name = "id")
		private String	id;		
		@ApiModelProperty(value = "", name = "createDate")
		private Date	createDate;		
		@ApiModelProperty(value = "", name = "mName")
		private String	mName;		
		@ApiModelProperty(value = "", name = "baseInfoUserName")
		private String	baseInfoUserName;		
		@ApiModelProperty(value = "", name = "baseInfoDate")
		private Date	baseInfoDate;		
		@ApiModelProperty(value = "", name = "auditUserName")
		private String	auditUserName;		
		@ApiModelProperty(value = "", name = "auditDate")
		private Date	auditDate;		
		@ApiModelProperty(value = "", name = "clarifyClag")
		private String	clarifyClag;		
		@ApiModelProperty(value = "", name = "talkName")
		private String	talkName;		
		@ApiModelProperty(value = "", name = "talkContent")
		private String	talkContent;		
		@ApiModelProperty(value = "", name = "talkDate")
		private Date	talkDate;		
		@ApiModelProperty(value = "", name = "talkOrg")
		private String	talkOrg;		
		@ApiModelProperty(value = "", name = "replyFlag")
		private String	replyFlag;		
		@ApiModelProperty(value = "", name = "replyUser")
		private String	replyUser;		
		@ApiModelProperty(value = "", name = "replyContent")
		private String	replyContent;		
		@ApiModelProperty(value = "", name = "fDate")
		private Date	fDate;		

}
