package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShoujigujiaDao;
import com.entity.ShoujigujiaEntity;
import com.service.ShoujigujiaService;
import com.entity.vo.ShoujigujiaVO;
import com.entity.view.ShoujigujiaView;

@Service("shoujigujiaService")
public class ShoujigujiaServiceImpl extends ServiceImpl<ShoujigujiaDao, ShoujigujiaEntity> implements ShoujigujiaService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShoujigujiaEntity> page = this.selectPage(
                new Query<ShoujigujiaEntity>(params).getPage(),
                new EntityWrapper<ShoujigujiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShoujigujiaEntity> wrapper) {
		  Page<ShoujigujiaView> page =new Query<ShoujigujiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShoujigujiaVO> selectListVO(Wrapper<ShoujigujiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShoujigujiaVO selectVO(Wrapper<ShoujigujiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShoujigujiaView> selectListView(Wrapper<ShoujigujiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShoujigujiaView selectView(Wrapper<ShoujigujiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
