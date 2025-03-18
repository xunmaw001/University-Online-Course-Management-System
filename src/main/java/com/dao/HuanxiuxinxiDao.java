package com.dao;

import com.entity.HuanxiuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuanxiuxinxiVO;
import com.entity.view.HuanxiuxinxiView;


/**
 * 缓修信息
 * 
 * @author 
 * @email 
 * @date 2021-01-05 15:14:51
 */
public interface HuanxiuxinxiDao extends BaseMapper<HuanxiuxinxiEntity> {
	
	List<HuanxiuxinxiVO> selectListVO(@Param("ew") Wrapper<HuanxiuxinxiEntity> wrapper);
	
	HuanxiuxinxiVO selectVO(@Param("ew") Wrapper<HuanxiuxinxiEntity> wrapper);
	
	List<HuanxiuxinxiView> selectListView(@Param("ew") Wrapper<HuanxiuxinxiEntity> wrapper);

	List<HuanxiuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HuanxiuxinxiEntity> wrapper);
	
	HuanxiuxinxiView selectView(@Param("ew") Wrapper<HuanxiuxinxiEntity> wrapper);
	
}
