package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshoujishangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshoujishangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshoujishangchengView;


/**
 * 手机商城评论表
 *
 * @author 
 * @email 
 * @date 2021-02-25 11:57:43
 */
public interface DiscussshoujishangchengService extends IService<DiscussshoujishangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshoujishangchengVO> selectListVO(Wrapper<DiscussshoujishangchengEntity> wrapper);
   	
   	DiscussshoujishangchengVO selectVO(@Param("ew") Wrapper<DiscussshoujishangchengEntity> wrapper);
   	
   	List<DiscussshoujishangchengView> selectListView(Wrapper<DiscussshoujishangchengEntity> wrapper);
   	
   	DiscussshoujishangchengView selectView(@Param("ew") Wrapper<DiscussshoujishangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshoujishangchengEntity> wrapper);
   	
}

