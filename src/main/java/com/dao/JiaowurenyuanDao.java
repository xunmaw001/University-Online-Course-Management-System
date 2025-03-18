package com.dao;

import com.entity.JiaowurenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaowurenyuanVO;
import com.entity.view.JiaowurenyuanView;


/**
 * 教务人员
 * 
 * @author 
 * @email 
 * @date 2021-01-05 15:14:51
 */
public interface JiaowurenyuanDao extends BaseMapper<JiaowurenyuanEntity> {
	
	List<JiaowurenyuanVO> selectListVO(@Param("ew") Wrapper<JiaowurenyuanEntity> wrapper);
	
	JiaowurenyuanVO selectVO(@Param("ew") Wrapper<JiaowurenyuanEntity> wrapper);
	
	List<JiaowurenyuanView> selectListView(@Param("ew") Wrapper<JiaowurenyuanEntity> wrapper);

	List<JiaowurenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<JiaowurenyuanEntity> wrapper);
	
	JiaowurenyuanView selectView(@Param("ew") Wrapper<JiaowurenyuanEntity> wrapper);
	
}
