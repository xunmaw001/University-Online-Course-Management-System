package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuankaoshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuankaoshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuankaoshenqingView;


/**
 * 缓考申请
 *
 * @author 
 * @email 
 * @date 2021-01-05 15:14:52
 */
public interface HuankaoshenqingService extends IService<HuankaoshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuankaoshenqingVO> selectListVO(Wrapper<HuankaoshenqingEntity> wrapper);
   	
   	HuankaoshenqingVO selectVO(@Param("ew") Wrapper<HuankaoshenqingEntity> wrapper);
   	
   	List<HuankaoshenqingView> selectListView(Wrapper<HuankaoshenqingEntity> wrapper);
   	
   	HuankaoshenqingView selectView(@Param("ew") Wrapper<HuankaoshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuankaoshenqingEntity> wrapper);
   	
}

