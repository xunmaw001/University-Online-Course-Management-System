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


import com.dao.KechengkaoheDao;
import com.entity.KechengkaoheEntity;
import com.service.KechengkaoheService;
import com.entity.vo.KechengkaoheVO;
import com.entity.view.KechengkaoheView;

@Service("kechengkaoheService")
public class KechengkaoheServiceImpl extends ServiceImpl<KechengkaoheDao, KechengkaoheEntity> implements KechengkaoheService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengkaoheEntity> page = this.selectPage(
                new Query<KechengkaoheEntity>(params).getPage(),
                new EntityWrapper<KechengkaoheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengkaoheEntity> wrapper) {
		  Page<KechengkaoheView> page =new Query<KechengkaoheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengkaoheVO> selectListVO(Wrapper<KechengkaoheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengkaoheVO selectVO(Wrapper<KechengkaoheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengkaoheView> selectListView(Wrapper<KechengkaoheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengkaoheView selectView(Wrapper<KechengkaoheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
