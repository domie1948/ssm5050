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


import com.dao.ShoujishangchengDao;
import com.entity.ShoujishangchengEntity;
import com.service.ShoujishangchengService;
import com.entity.vo.ShoujishangchengVO;
import com.entity.view.ShoujishangchengView;

@Service("shoujishangchengService")
public class ShoujishangchengServiceImpl extends ServiceImpl<ShoujishangchengDao, ShoujishangchengEntity> implements ShoujishangchengService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShoujishangchengEntity> page = this.selectPage(
                new Query<ShoujishangchengEntity>(params).getPage(),
                new EntityWrapper<ShoujishangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShoujishangchengEntity> wrapper) {
		  Page<ShoujishangchengView> page =new Query<ShoujishangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShoujishangchengVO> selectListVO(Wrapper<ShoujishangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShoujishangchengVO selectVO(Wrapper<ShoujishangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShoujishangchengView> selectListView(Wrapper<ShoujishangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShoujishangchengView selectView(Wrapper<ShoujishangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
