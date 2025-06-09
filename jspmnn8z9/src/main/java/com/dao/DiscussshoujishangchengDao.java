package com.dao;

import com.entity.DiscussshoujishangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshoujishangchengVO;
import com.entity.view.DiscussshoujishangchengView;


/**
 * 手机商城评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-25 11:57:43
 */
public interface DiscussshoujishangchengDao extends BaseMapper<DiscussshoujishangchengEntity> {
	
	List<DiscussshoujishangchengVO> selectListVO(@Param("ew") Wrapper<DiscussshoujishangchengEntity> wrapper);
	
	DiscussshoujishangchengVO selectVO(@Param("ew") Wrapper<DiscussshoujishangchengEntity> wrapper);
	
	List<DiscussshoujishangchengView> selectListView(@Param("ew") Wrapper<DiscussshoujishangchengEntity> wrapper);

	List<DiscussshoujishangchengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshoujishangchengEntity> wrapper);
	
	DiscussshoujishangchengView selectView(@Param("ew") Wrapper<DiscussshoujishangchengEntity> wrapper);
	
}
