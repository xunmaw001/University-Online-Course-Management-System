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


import com.dao.KechengtongjiDao;
import com.entity.KechengtongjiEntity;
import com.service.KechengtongjiService;
import com.entity.vo.KechengtongjiVO;
import com.entity.view.KechengtongjiView;

@Service("kechengtongjiService")
public class KechengtongjiServiceImpl extends ServiceImpl<KechengtongjiDao, KechengtongjiEntity> implements KechengtongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengtongjiEntity> page = this.selectPage(
                new Query<KechengtongjiEntity>(params).getPage(),
                new EntityWrapper<KechengtongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengtongjiEntity> wrapper) {
		  Page<KechengtongjiView> page =new Query<KechengtongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengtongjiVO> selectListVO(Wrapper<KechengtongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengtongjiVO selectVO(Wrapper<KechengtongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengtongjiView> selectListView(Wrapper<KechengtongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengtongjiView selectView(Wrapper<KechengtongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
