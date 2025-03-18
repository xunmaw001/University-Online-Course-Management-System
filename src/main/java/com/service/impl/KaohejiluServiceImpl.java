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


import com.dao.KaohejiluDao;
import com.entity.KaohejiluEntity;
import com.service.KaohejiluService;
import com.entity.vo.KaohejiluVO;
import com.entity.view.KaohejiluView;

@Service("kaohejiluService")
public class KaohejiluServiceImpl extends ServiceImpl<KaohejiluDao, KaohejiluEntity> implements KaohejiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaohejiluEntity> page = this.selectPage(
                new Query<KaohejiluEntity>(params).getPage(),
                new EntityWrapper<KaohejiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaohejiluEntity> wrapper) {
		  Page<KaohejiluView> page =new Query<KaohejiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaohejiluVO> selectListVO(Wrapper<KaohejiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaohejiluVO selectVO(Wrapper<KaohejiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaohejiluView> selectListView(Wrapper<KaohejiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaohejiluView selectView(Wrapper<KaohejiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
