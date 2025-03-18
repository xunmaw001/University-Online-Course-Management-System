package com.dao;

import com.entity.KaohejiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaohejiluVO;
import com.entity.view.KaohejiluView;


/**
 * 考核记录
 * 
 * @author 
 * @email 
 * @date 2021-01-05 15:14:51
 */
public interface KaohejiluDao extends BaseMapper<KaohejiluEntity> {
	
	List<KaohejiluVO> selectListVO(@Param("ew") Wrapper<KaohejiluEntity> wrapper);
	
	KaohejiluVO selectVO(@Param("ew") Wrapper<KaohejiluEntity> wrapper);
	
	List<KaohejiluView> selectListView(@Param("ew") Wrapper<KaohejiluEntity> wrapper);

	List<KaohejiluView> selectListView(Pagination page,@Param("ew") Wrapper<KaohejiluEntity> wrapper);
	
	KaohejiluView selectView(@Param("ew") Wrapper<KaohejiluEntity> wrapper);
	
}
