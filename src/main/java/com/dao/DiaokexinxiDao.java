package com.dao;

import com.entity.DiaokexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiaokexinxiVO;
import com.entity.view.DiaokexinxiView;


/**
 * 调课信息
 * 
 * @author 
 * @email 
 * @date 2021-01-05 15:14:51
 */
public interface DiaokexinxiDao extends BaseMapper<DiaokexinxiEntity> {
	
	List<DiaokexinxiVO> selectListVO(@Param("ew") Wrapper<DiaokexinxiEntity> wrapper);
	
	DiaokexinxiVO selectVO(@Param("ew") Wrapper<DiaokexinxiEntity> wrapper);
	
	List<DiaokexinxiView> selectListView(@Param("ew") Wrapper<DiaokexinxiEntity> wrapper);

	List<DiaokexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiaokexinxiEntity> wrapper);
	
	DiaokexinxiView selectView(@Param("ew") Wrapper<DiaokexinxiEntity> wrapper);
	
}
