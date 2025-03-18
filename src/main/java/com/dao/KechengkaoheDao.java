package com.dao;

import com.entity.KechengkaoheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengkaoheVO;
import com.entity.view.KechengkaoheView;


/**
 * 课程考核
 * 
 * @author 
 * @email 
 * @date 2021-01-05 15:14:51
 */
public interface KechengkaoheDao extends BaseMapper<KechengkaoheEntity> {
	
	List<KechengkaoheVO> selectListVO(@Param("ew") Wrapper<KechengkaoheEntity> wrapper);
	
	KechengkaoheVO selectVO(@Param("ew") Wrapper<KechengkaoheEntity> wrapper);
	
	List<KechengkaoheView> selectListView(@Param("ew") Wrapper<KechengkaoheEntity> wrapper);

	List<KechengkaoheView> selectListView(Pagination page,@Param("ew") Wrapper<KechengkaoheEntity> wrapper);
	
	KechengkaoheView selectView(@Param("ew") Wrapper<KechengkaoheEntity> wrapper);
	
}
