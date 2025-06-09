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


import com.dao.ShoujihuishouDao;
import com.entity.ShoujihuishouEntity;
import com.service.ShoujihuishouService;
import com.entity.vo.ShoujihuishouVO;
import com.entity.view.ShoujihuishouView;

@Service("shoujihuishouService")
public class ShoujihuishouServiceImpl extends ServiceImpl<ShoujihuishouDao, ShoujihuishouEntity> implements ShoujihuishouService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShoujihuishouEntity> page = this.selectPage(
                new Query<ShoujihuishouEntity>(params).getPage(),
                new EntityWrapper<ShoujihuishouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShoujihuishouEntity> wrapper) {
		  Page<ShoujihuishouView> page =new Query<ShoujihuishouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShoujihuishouVO> selectListVO(Wrapper<ShoujihuishouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShoujihuishouVO selectVO(Wrapper<ShoujihuishouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShoujihuishouView> selectListView(Wrapper<ShoujihuishouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShoujihuishouView selectView(Wrapper<ShoujihuishouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
