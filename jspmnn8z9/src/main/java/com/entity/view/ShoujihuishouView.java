package com.entity.view;

import com.entity.ShoujihuishouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 手机回收
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-25 11:57:43
 */
@TableName("shoujihuishou")
public class ShoujihuishouView  extends ShoujihuishouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShoujihuishouView(){
	}
 
 	public ShoujihuishouView(ShoujihuishouEntity shoujihuishouEntity){
 	try {
			BeanUtils.copyProperties(this, shoujihuishouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
