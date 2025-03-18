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


import com.dao.DiaokexinxiDao;
import com.entity.DiaokexinxiEntity;
import com.service.DiaokexinxiService;
import com.entity.vo.DiaokexinxiVO;
import com.entity.view.DiaokexinxiView;

@Service("diaokexinxiService")
public class DiaokexinxiServiceImpl extends ServiceImpl<DiaokexinxiDao, DiaokexinxiEntity> implements DiaokexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiaokexinxiEntity> page = this.selectPage(
                new Query<DiaokexinxiEntity>(params).getPage(),
                new EntityWrapper<DiaokexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiaokexinxiEntity> wrapper) {
		  Page<DiaokexinxiView> page =new Query<DiaokexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiaokexinxiVO> selectListVO(Wrapper<DiaokexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiaokexinxiVO selectVO(Wrapper<DiaokexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiaokexinxiView> selectListView(Wrapper<DiaokexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiaokexinxiView selectView(Wrapper<DiaokexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
