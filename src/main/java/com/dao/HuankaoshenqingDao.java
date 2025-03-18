package com.dao;

import com.entity.HuankaoshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuankaoshenqingVO;
import com.entity.view.HuankaoshenqingView;


/**
 * 缓考申请
 * 
 * @author 
 * @email 
 * @date 2021-01-05 15:14:52
 */
public interface HuankaoshenqingDao extends BaseMapper<HuankaoshenqingEntity> {
	
	List<HuankaoshenqingVO> selectListVO(@Param("ew") Wrapper<HuankaoshenqingEntity> wrapper);
	
	HuankaoshenqingVO selectVO(@Param("ew") Wrapper<HuankaoshenqingEntity> wrapper);
	
	List<HuankaoshenqingView> selectListView(@Param("ew") Wrapper<HuankaoshenqingEntity> wrapper);

	List<HuankaoshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<HuankaoshenqingEntity> wrapper);
	
	HuankaoshenqingView selectView(@Param("ew") Wrapper<HuankaoshenqingEntity> wrapper);
	
}
