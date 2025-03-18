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


import com.dao.HuanxiuxinxiDao;
import com.entity.HuanxiuxinxiEntity;
import com.service.HuanxiuxinxiService;
import com.entity.vo.HuanxiuxinxiVO;
import com.entity.view.HuanxiuxinxiView;

@Service("huanxiuxinxiService")
public class HuanxiuxinxiServiceImpl extends ServiceImpl<HuanxiuxinxiDao, HuanxiuxinxiEntity> implements HuanxiuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuanxiuxinxiEntity> page = this.selectPage(
                new Query<HuanxiuxinxiEntity>(params).getPage(),
                new EntityWrapper<HuanxiuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuanxiuxinxiEntity> wrapper) {
		  Page<HuanxiuxinxiView> page =new Query<HuanxiuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuanxiuxinxiVO> selectListVO(Wrapper<HuanxiuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuanxiuxinxiVO selectVO(Wrapper<HuanxiuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuanxiuxinxiView> selectListView(Wrapper<HuanxiuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuanxiuxinxiView selectView(Wrapper<HuanxiuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
