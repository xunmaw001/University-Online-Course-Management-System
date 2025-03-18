package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaowurenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaowurenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaowurenyuanView;


/**
 * 教务人员
 *
 * @author 
 * @email 
 * @date 2021-01-05 15:14:51
 */
public interface JiaowurenyuanService extends IService<JiaowurenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaowurenyuanVO> selectListVO(Wrapper<JiaowurenyuanEntity> wrapper);
   	
   	JiaowurenyuanVO selectVO(@Param("ew") Wrapper<JiaowurenyuanEntity> wrapper);
   	
   	List<JiaowurenyuanView> selectListView(Wrapper<JiaowurenyuanEntity> wrapper);
   	
   	JiaowurenyuanView selectView(@Param("ew") Wrapper<JiaowurenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaowurenyuanEntity> wrapper);
   	
}

