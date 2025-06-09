package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussshoujishangchengEntity;
import com.entity.view.DiscussshoujishangchengView;

import com.service.DiscussshoujishangchengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 手机商城评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-25 11:57:43
 */
@RestController
@RequestMapping("/discussshoujishangcheng")
public class DiscussshoujishangchengController {
    @Autowired
    private DiscussshoujishangchengService discussshoujishangchengService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussshoujishangchengEntity discussshoujishangcheng, HttpServletRequest request){

        EntityWrapper<DiscussshoujishangchengEntity> ew = new EntityWrapper<DiscussshoujishangchengEntity>();
    	PageUtils page = discussshoujishangchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussshoujishangcheng), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussshoujishangchengEntity discussshoujishangcheng, HttpServletRequest request){
        EntityWrapper<DiscussshoujishangchengEntity> ew = new EntityWrapper<DiscussshoujishangchengEntity>();
    	PageUtils page = discussshoujishangchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussshoujishangcheng), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussshoujishangchengEntity discussshoujishangcheng){
       	EntityWrapper<DiscussshoujishangchengEntity> ew = new EntityWrapper<DiscussshoujishangchengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussshoujishangcheng, "discussshoujishangcheng")); 
        return R.ok().put("data", discussshoujishangchengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussshoujishangchengEntity discussshoujishangcheng){
        EntityWrapper< DiscussshoujishangchengEntity> ew = new EntityWrapper< DiscussshoujishangchengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussshoujishangcheng, "discussshoujishangcheng")); 
		DiscussshoujishangchengView discussshoujishangchengView =  discussshoujishangchengService.selectView(ew);
		return R.ok("查询手机商城评论表成功").put("data", discussshoujishangchengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussshoujishangchengEntity discussshoujishangcheng = discussshoujishangchengService.selectById(id);
        return R.ok().put("data", discussshoujishangcheng);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussshoujishangchengEntity discussshoujishangcheng = discussshoujishangchengService.selectById(id);
        return R.ok().put("data", discussshoujishangcheng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussshoujishangchengEntity discussshoujishangcheng, HttpServletRequest request){
    	discussshoujishangcheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussshoujishangcheng);

        discussshoujishangchengService.insert(discussshoujishangcheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussshoujishangchengEntity discussshoujishangcheng, HttpServletRequest request){
    	discussshoujishangcheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussshoujishangcheng);

        discussshoujishangchengService.insert(discussshoujishangcheng);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussshoujishangchengEntity discussshoujishangcheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussshoujishangcheng);
        discussshoujishangchengService.updateById(discussshoujishangcheng);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussshoujishangchengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussshoujishangchengEntity> wrapper = new EntityWrapper<DiscussshoujishangchengEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussshoujishangchengService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
