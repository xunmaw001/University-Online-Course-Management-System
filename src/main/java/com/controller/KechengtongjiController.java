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

import com.entity.KechengtongjiEntity;
import com.entity.view.KechengtongjiView;

import com.service.KechengtongjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 课程统计
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-05 15:14:52
 */
@RestController
@RequestMapping("/kechengtongji")
public class KechengtongjiController {
    @Autowired
    private KechengtongjiService kechengtongjiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KechengtongjiEntity kechengtongji, HttpServletRequest request){

        EntityWrapper<KechengtongjiEntity> ew = new EntityWrapper<KechengtongjiEntity>();
		PageUtils page = kechengtongjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengtongji), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KechengtongjiEntity kechengtongji, HttpServletRequest request){
        EntityWrapper<KechengtongjiEntity> ew = new EntityWrapper<KechengtongjiEntity>();
		PageUtils page = kechengtongjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengtongji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KechengtongjiEntity kechengtongji){
       	EntityWrapper<KechengtongjiEntity> ew = new EntityWrapper<KechengtongjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kechengtongji, "kechengtongji")); 
        return R.ok().put("data", kechengtongjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KechengtongjiEntity kechengtongji){
        EntityWrapper< KechengtongjiEntity> ew = new EntityWrapper< KechengtongjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kechengtongji, "kechengtongji")); 
		KechengtongjiView kechengtongjiView =  kechengtongjiService.selectView(ew);
		return R.ok("查询课程统计成功").put("data", kechengtongjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        KechengtongjiEntity kechengtongji = kechengtongjiService.selectById(id);
        return R.ok().put("data", kechengtongji);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        KechengtongjiEntity kechengtongji = kechengtongjiService.selectById(id);
        return R.ok().put("data", kechengtongji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KechengtongjiEntity kechengtongji, HttpServletRequest request){
    	kechengtongji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kechengtongji);

        kechengtongjiService.insert(kechengtongji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KechengtongjiEntity kechengtongji, HttpServletRequest request){
    	kechengtongji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kechengtongji);

        kechengtongjiService.insert(kechengtongji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody KechengtongjiEntity kechengtongji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kechengtongji);
        kechengtongjiService.updateById(kechengtongji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kechengtongjiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<KechengtongjiEntity> wrapper = new EntityWrapper<KechengtongjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = kechengtongjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
