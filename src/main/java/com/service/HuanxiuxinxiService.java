package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuanxiuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuanxiuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuanxiuxinxiView;


/**
 * 缓修信息
 *
 * @author 
 * @email 
 * @date 2021-01-05 15:14:51
 */
public interface HuanxiuxinxiService extends IService<HuanxiuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuanxiuxinxiVO> selectListVO(Wrapper<HuanxiuxinxiEntity> wrapper);
   	
   	HuanxiuxinxiVO selectVO(@Param("ew") Wrapper<HuanxiuxinxiEntity> wrapper);
   	
   	List<HuanxiuxinxiView> selectListView(Wrapper<HuanxiuxinxiEntity> wrapper);
   	
   	HuanxiuxinxiView selectView(@Param("ew") Wrapper<HuanxiuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuanxiuxinxiEntity> wrapper);
   	
}

