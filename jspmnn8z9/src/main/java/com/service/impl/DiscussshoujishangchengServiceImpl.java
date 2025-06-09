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


import com.dao.DiscussshoujishangchengDao;
import com.entity.DiscussshoujishangchengEntity;
import com.service.DiscussshoujishangchengService;
import com.entity.vo.DiscussshoujishangchengVO;
import com.entity.view.DiscussshoujishangchengView;

@Service("discussshoujishangchengService")
public class DiscussshoujishangchengServiceImpl extends ServiceImpl<DiscussshoujishangchengDao, DiscussshoujishangchengEntity> implements DiscussshoujishangchengService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshoujishangchengEntity> page = this.selectPage(
                new Query<DiscussshoujishangchengEntity>(params).getPage(),
                new EntityWrapper<DiscussshoujishangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshoujishangchengEntity> wrapper) {
		  Page<DiscussshoujishangchengView> page =new Query<DiscussshoujishangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshoujishangchengVO> selectListVO(Wrapper<DiscussshoujishangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshoujishangchengVO selectVO(Wrapper<DiscussshoujishangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshoujishangchengView> selectListView(Wrapper<DiscussshoujishangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshoujishangchengView selectView(Wrapper<DiscussshoujishangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
