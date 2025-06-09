package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShoujigujiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShoujigujiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoujigujiaView;


/**
 * 手机估价
 *
 * @author 
 * @email 
 * @date 2021-02-25 11:57:43
 */
public interface ShoujigujiaService extends IService<ShoujigujiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShoujigujiaVO> selectListVO(Wrapper<ShoujigujiaEntity> wrapper);
   	
   	ShoujigujiaVO selectVO(@Param("ew") Wrapper<ShoujigujiaEntity> wrapper);
   	
   	List<ShoujigujiaView> selectListView(Wrapper<ShoujigujiaEntity> wrapper);
   	
   	ShoujigujiaView selectView(@Param("ew") Wrapper<ShoujigujiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShoujigujiaEntity> wrapper);
   	
}

