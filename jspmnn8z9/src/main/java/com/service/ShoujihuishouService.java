package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShoujihuishouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShoujihuishouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoujihuishouView;


/**
 * 手机回收
 *
 * @author 
 * @email 
 * @date 2021-02-25 11:57:43
 */
public interface ShoujihuishouService extends IService<ShoujihuishouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShoujihuishouVO> selectListVO(Wrapper<ShoujihuishouEntity> wrapper);
   	
   	ShoujihuishouVO selectVO(@Param("ew") Wrapper<ShoujihuishouEntity> wrapper);
   	
   	List<ShoujihuishouView> selectListView(Wrapper<ShoujihuishouEntity> wrapper);
   	
   	ShoujihuishouView selectView(@Param("ew") Wrapper<ShoujihuishouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShoujihuishouEntity> wrapper);
   	
}

