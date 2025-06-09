package com.entity.view;

import com.entity.DiscussshoujishangchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 手机商城评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-25 11:57:43
 */
@TableName("discussshoujishangcheng")
public class DiscussshoujishangchengView  extends DiscussshoujishangchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshoujishangchengView(){
	}
 
 	public DiscussshoujishangchengView(DiscussshoujishangchengEntity discussshoujishangchengEntity){
 	try {
			BeanUtils.copyProperties(this, discussshoujishangchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
