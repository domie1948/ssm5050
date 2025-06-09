package com.dao;

import com.entity.ShoujihuishouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShoujihuishouVO;
import com.entity.view.ShoujihuishouView;


/**
 * 手机回收
 * 
 * @author 
 * @email 
 * @date 2021-02-25 11:57:43
 */
public interface ShoujihuishouDao extends BaseMapper<ShoujihuishouEntity> {
	
	List<ShoujihuishouVO> selectListVO(@Param("ew") Wrapper<ShoujihuishouEntity> wrapper);
	
	ShoujihuishouVO selectVO(@Param("ew") Wrapper<ShoujihuishouEntity> wrapper);
	
	List<ShoujihuishouView> selectListView(@Param("ew") Wrapper<ShoujihuishouEntity> wrapper);

	List<ShoujihuishouView> selectListView(Pagination page,@Param("ew") Wrapper<ShoujihuishouEntity> wrapper);
	
	ShoujihuishouView selectView(@Param("ew") Wrapper<ShoujihuishouEntity> wrapper);
	
}
