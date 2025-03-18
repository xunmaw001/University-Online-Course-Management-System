package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengtongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengtongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengtongjiView;


/**
 * 课程统计
 *
 * @author 
 * @email 
 * @date 2021-01-05 15:14:52
 */
public interface KechengtongjiService extends IService<KechengtongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengtongjiVO> selectListVO(Wrapper<KechengtongjiEntity> wrapper);
   	
   	KechengtongjiVO selectVO(@Param("ew") Wrapper<KechengtongjiEntity> wrapper);
   	
   	List<KechengtongjiView> selectListView(Wrapper<KechengtongjiEntity> wrapper);
   	
   	KechengtongjiView selectView(@Param("ew") Wrapper<KechengtongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengtongjiEntity> wrapper);
   	
}

