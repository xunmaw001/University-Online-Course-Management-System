package com.dao;

import com.entity.KechengtongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengtongjiVO;
import com.entity.view.KechengtongjiView;


/**
 * 课程统计
 * 
 * @author 
 * @email 
 * @date 2021-01-05 15:14:52
 */
public interface KechengtongjiDao extends BaseMapper<KechengtongjiEntity> {
	
	List<KechengtongjiVO> selectListVO(@Param("ew") Wrapper<KechengtongjiEntity> wrapper);
	
	KechengtongjiVO selectVO(@Param("ew") Wrapper<KechengtongjiEntity> wrapper);
	
	List<KechengtongjiView> selectListView(@Param("ew") Wrapper<KechengtongjiEntity> wrapper);

	List<KechengtongjiView> selectListView(Pagination page,@Param("ew") Wrapper<KechengtongjiEntity> wrapper);
	
	KechengtongjiView selectView(@Param("ew") Wrapper<KechengtongjiEntity> wrapper);
	
}
