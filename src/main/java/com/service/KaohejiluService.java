package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaohejiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaohejiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaohejiluView;


/**
 * 考核记录
 *
 * @author 
 * @email 
 * @date 2021-01-05 15:14:51
 */
public interface KaohejiluService extends IService<KaohejiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaohejiluVO> selectListVO(Wrapper<KaohejiluEntity> wrapper);
   	
   	KaohejiluVO selectVO(@Param("ew") Wrapper<KaohejiluEntity> wrapper);
   	
   	List<KaohejiluView> selectListView(Wrapper<KaohejiluEntity> wrapper);
   	
   	KaohejiluView selectView(@Param("ew") Wrapper<KaohejiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaohejiluEntity> wrapper);
   	
}

