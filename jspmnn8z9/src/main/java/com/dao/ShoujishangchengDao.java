package com.dao;

import com.entity.ShoujishangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShoujishangchengVO;
import com.entity.view.ShoujishangchengView;


/**
 * 手机商城
 * 
 * @author 
 * @email 
 * @date 2021-02-25 11:57:43
 */
public interface ShoujishangchengDao extends BaseMapper<ShoujishangchengEntity> {
	
	List<ShoujishangchengVO> selectListVO(@Param("ew") Wrapper<ShoujishangchengEntity> wrapper);
	
	ShoujishangchengVO selectVO(@Param("ew") Wrapper<ShoujishangchengEntity> wrapper);
	
	List<ShoujishangchengView> selectListView(@Param("ew") Wrapper<ShoujishangchengEntity> wrapper);

	List<ShoujishangchengView> selectListView(Pagination page,@Param("ew") Wrapper<ShoujishangchengEntity> wrapper);
	
	ShoujishangchengView selectView(@Param("ew") Wrapper<ShoujishangchengEntity> wrapper);
	
}
