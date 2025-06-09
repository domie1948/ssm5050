package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShoujipinpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShoujipinpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoujipinpaiView;


/**
 * 手机品牌
 *
 * @author 
 * @email 
 * @date 2021-02-25 11:57:43
 */
public interface ShoujipinpaiService extends IService<ShoujipinpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShoujipinpaiVO> selectListVO(Wrapper<ShoujipinpaiEntity> wrapper);
   	
   	ShoujipinpaiVO selectVO(@Param("ew") Wrapper<ShoujipinpaiEntity> wrapper);
   	
   	List<ShoujipinpaiView> selectListView(Wrapper<ShoujipinpaiEntity> wrapper);
   	
   	ShoujipinpaiView selectView(@Param("ew") Wrapper<ShoujipinpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShoujipinpaiEntity> wrapper);
   	
}

