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

import com.entity.KaohejiluEntity;
import com.entity.view.KaohejiluView;

import com.service.KaohejiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 考核记录
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-05 15:14:51
 */
@RestController
@RequestMapping("/kaohejilu")
public class KaohejiluController {
    @Autowired
    private KaohejiluService kaohejiluService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KaohejiluEntity kaohejilu, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			kaohejilu.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KaohejiluEntity> ew = new EntityWrapper<KaohejiluEntity>();
		PageUtils page = kaohejiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaohejilu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KaohejiluEntity kaohejilu, HttpServletRequest request){
        EntityWrapper<KaohejiluEntity> ew = new EntityWrapper<KaohejiluEntity>();
		PageUtils page = kaohejiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaohejilu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KaohejiluEntity kaohejilu){
       	EntityWrapper<KaohejiluEntity> ew = new EntityWrapper<KaohejiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kaohejilu, "kaohejilu")); 
        return R.ok().put("data", kaohejiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KaohejiluEntity kaohejilu){
        EntityWrapper< KaohejiluEntity> ew = new EntityWrapper< KaohejiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kaohejilu, "kaohejilu")); 
		KaohejiluView kaohejiluView =  kaohejiluService.selectView(ew);
		return R.ok("查询考核记录成功").put("data", kaohejiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        KaohejiluEntity kaohejilu = kaohejiluService.selectById(id);
        return R.ok().put("data", kaohejilu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        KaohejiluEntity kaohejilu = kaohejiluService.selectById(id);
        return R.ok().put("data", kaohejilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KaohejiluEntity kaohejilu, HttpServletRequest request){
    	kaohejilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaohejilu);

        kaohejiluService.insert(kaohejilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KaohejiluEntity kaohejilu, HttpServletRequest request){
    	kaohejilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaohejilu);

        kaohejiluService.insert(kaohejilu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody KaohejiluEntity kaohejilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kaohejilu);
        kaohejiluService.updateById(kaohejilu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kaohejiluService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<KaohejiluEntity> wrapper = new EntityWrapper<KaohejiluEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = kaohejiluService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
