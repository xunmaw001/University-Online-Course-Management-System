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


import com.dao.JiaowurenyuanDao;
import com.entity.JiaowurenyuanEntity;
import com.service.JiaowurenyuanService;
import com.entity.vo.JiaowurenyuanVO;
import com.entity.view.JiaowurenyuanView;

@Service("jiaowurenyuanService")
public class JiaowurenyuanServiceImpl extends ServiceImpl<JiaowurenyuanDao, JiaowurenyuanEntity> implements JiaowurenyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaowurenyuanEntity> page = this.selectPage(
                new Query<JiaowurenyuanEntity>(params).getPage(),
                new EntityWrapper<JiaowurenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaowurenyuanEntity> wrapper) {
		  Page<JiaowurenyuanView> page =new Query<JiaowurenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaowurenyuanVO> selectListVO(Wrapper<JiaowurenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaowurenyuanVO selectVO(Wrapper<JiaowurenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaowurenyuanView> selectListView(Wrapper<JiaowurenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaowurenyuanView selectView(Wrapper<JiaowurenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
