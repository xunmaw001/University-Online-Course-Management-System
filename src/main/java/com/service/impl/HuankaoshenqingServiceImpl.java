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


import com.dao.HuankaoshenqingDao;
import com.entity.HuankaoshenqingEntity;
import com.service.HuankaoshenqingService;
import com.entity.vo.HuankaoshenqingVO;
import com.entity.view.HuankaoshenqingView;

@Service("huankaoshenqingService")
public class HuankaoshenqingServiceImpl extends ServiceImpl<HuankaoshenqingDao, HuankaoshenqingEntity> implements HuankaoshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuankaoshenqingEntity> page = this.selectPage(
                new Query<HuankaoshenqingEntity>(params).getPage(),
                new EntityWrapper<HuankaoshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuankaoshenqingEntity> wrapper) {
		  Page<HuankaoshenqingView> page =new Query<HuankaoshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuankaoshenqingVO> selectListVO(Wrapper<HuankaoshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuankaoshenqingVO selectVO(Wrapper<HuankaoshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuankaoshenqingView> selectListView(Wrapper<HuankaoshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuankaoshenqingView selectView(Wrapper<HuankaoshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
