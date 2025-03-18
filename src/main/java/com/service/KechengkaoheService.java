package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengkaoheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengkaoheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengkaoheView;


/**
 * 课程考核
 *
 * @author 
 * @email 
 * @date 2021-01-05 15:14:51
 */
public interface KechengkaoheService extends IService<KechengkaoheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengkaoheVO> selectListVO(Wrapper<KechengkaoheEntity> wrapper);
   	
   	KechengkaoheVO selectVO(@Param("ew") Wrapper<KechengkaoheEntity> wrapper);
   	
   	List<KechengkaoheView> selectListView(Wrapper<KechengkaoheEntity> wrapper);
   	
   	KechengkaoheView selectView(@Param("ew") Wrapper<KechengkaoheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengkaoheEntity> wrapper);
   	
}

