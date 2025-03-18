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

import com.entity.HuankaoshenqingEntity;
import com.entity.view.HuankaoshenqingView;

import com.service.HuankaoshenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 缓考申请
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-05 15:14:52
 */
@RestController
@RequestMapping("/huankaoshenqing")
public class HuankaoshenqingController {
    @Autowired
    private HuankaoshenqingService huankaoshenqingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuankaoshenqingEntity huankaoshenqing, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaowurenyuan")) {
			huankaoshenqing.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			huankaoshenqing.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuankaoshenqingEntity> ew = new EntityWrapper<HuankaoshenqingEntity>();
		PageUtils page = huankaoshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huankaoshenqing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuankaoshenqingEntity huankaoshenqing, HttpServletRequest request){
        EntityWrapper<HuankaoshenqingEntity> ew = new EntityWrapper<HuankaoshenqingEntity>();
		PageUtils page = huankaoshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huankaoshenqing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuankaoshenqingEntity huankaoshenqing){
       	EntityWrapper<HuankaoshenqingEntity> ew = new EntityWrapper<HuankaoshenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huankaoshenqing, "huankaoshenqing")); 
        return R.ok().put("data", huankaoshenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuankaoshenqingEntity huankaoshenqing){
        EntityWrapper< HuankaoshenqingEntity> ew = new EntityWrapper< HuankaoshenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huankaoshenqing, "huankaoshenqing")); 
		HuankaoshenqingView huankaoshenqingView =  huankaoshenqingService.selectView(ew);
		return R.ok("查询缓考申请成功").put("data", huankaoshenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        HuankaoshenqingEntity huankaoshenqing = huankaoshenqingService.selectById(id);
        return R.ok().put("data", huankaoshenqing);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        HuankaoshenqingEntity huankaoshenqing = huankaoshenqingService.selectById(id);
        return R.ok().put("data", huankaoshenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuankaoshenqingEntity huankaoshenqing, HttpServletRequest request){
    	huankaoshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huankaoshenqing);

        huankaoshenqingService.insert(huankaoshenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuankaoshenqingEntity huankaoshenqing, HttpServletRequest request){
    	huankaoshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huankaoshenqing);

        huankaoshenqingService.insert(huankaoshenqing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HuankaoshenqingEntity huankaoshenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huankaoshenqing);
        huankaoshenqingService.updateById(huankaoshenqing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huankaoshenqingService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<HuankaoshenqingEntity> wrapper = new EntityWrapper<HuankaoshenqingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaowurenyuan")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = huankaoshenqingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
