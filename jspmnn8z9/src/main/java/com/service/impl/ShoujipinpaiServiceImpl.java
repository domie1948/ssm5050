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


import com.dao.ShoujipinpaiDao;
import com.entity.ShoujipinpaiEntity;
import com.service.ShoujipinpaiService;
import com.entity.vo.ShoujipinpaiVO;
import com.entity.view.ShoujipinpaiView;

@Service("shoujipinpaiService")
public class ShoujipinpaiServiceImpl extends ServiceImpl<ShoujipinpaiDao, ShoujipinpaiEntity> implements ShoujipinpaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShoujipinpaiEntity> page = this.selectPage(
                new Query<ShoujipinpaiEntity>(params).getPage(),
                new EntityWrapper<ShoujipinpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShoujipinpaiEntity> wrapper) {
		  Page<ShoujipinpaiView> page =new Query<ShoujipinpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShoujipinpaiVO> selectListVO(Wrapper<ShoujipinpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShoujipinpaiVO selectVO(Wrapper<ShoujipinpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShoujipinpaiView> selectListView(Wrapper<ShoujipinpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShoujipinpaiView selectView(Wrapper<ShoujipinpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
