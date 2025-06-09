package com.dao;

import com.entity.ShoujigujiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShoujigujiaVO;
import com.entity.view.ShoujigujiaView;


/**
 * 手机估价
 * 
 * @author 
 * @email 
 * @date 2021-02-25 11:57:43
 */
public interface ShoujigujiaDao extends BaseMapper<ShoujigujiaEntity> {
	
	List<ShoujigujiaVO> selectListVO(@Param("ew") Wrapper<ShoujigujiaEntity> wrapper);
	
	ShoujigujiaVO selectVO(@Param("ew") Wrapper<ShoujigujiaEntity> wrapper);
	
	List<ShoujigujiaView> selectListView(@Param("ew") Wrapper<ShoujigujiaEntity> wrapper);

	List<ShoujigujiaView> selectListView(Pagination page,@Param("ew") Wrapper<ShoujigujiaEntity> wrapper);
	
	ShoujigujiaView selectView(@Param("ew") Wrapper<ShoujigujiaEntity> wrapper);
	
}
