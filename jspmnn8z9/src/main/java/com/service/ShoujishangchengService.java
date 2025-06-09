package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShoujishangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShoujishangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoujishangchengView;


/**
 * 手机商城
 *
 * @author 
 * @email 
 * @date 2021-02-25 11:57:43
 */
public interface ShoujishangchengService extends IService<ShoujishangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShoujishangchengVO> selectListVO(Wrapper<ShoujishangchengEntity> wrapper);
   	
   	ShoujishangchengVO selectVO(@Param("ew") Wrapper<ShoujishangchengEntity> wrapper);
   	
   	List<ShoujishangchengView> selectListView(Wrapper<ShoujishangchengEntity> wrapper);
   	
   	ShoujishangchengView selectView(@Param("ew") Wrapper<ShoujishangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShoujishangchengEntity> wrapper);
   	
}

