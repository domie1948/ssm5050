package com.dao;

import com.entity.ShoujipinpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShoujipinpaiVO;
import com.entity.view.ShoujipinpaiView;


/**
 * 手机品牌
 * 
 * @author 
 * @email 
 * @date 2021-02-25 11:57:43
 */
public interface ShoujipinpaiDao extends BaseMapper<ShoujipinpaiEntity> {
	
	List<ShoujipinpaiVO> selectListVO(@Param("ew") Wrapper<ShoujipinpaiEntity> wrapper);
	
	ShoujipinpaiVO selectVO(@Param("ew") Wrapper<ShoujipinpaiEntity> wrapper);
	
	List<ShoujipinpaiView> selectListView(@Param("ew") Wrapper<ShoujipinpaiEntity> wrapper);

	List<ShoujipinpaiView> selectListView(Pagination page,@Param("ew") Wrapper<ShoujipinpaiEntity> wrapper);
	
	ShoujipinpaiView selectView(@Param("ew") Wrapper<ShoujipinpaiEntity> wrapper);
	
}
