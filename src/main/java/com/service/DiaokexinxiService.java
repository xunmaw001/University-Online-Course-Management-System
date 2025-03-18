package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiaokexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiaokexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiaokexinxiView;


/**
 * 调课信息
 *
 * @author 
 * @email 
 * @date 2021-01-05 15:14:51
 */
public interface DiaokexinxiService extends IService<DiaokexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiaokexinxiVO> selectListVO(Wrapper<DiaokexinxiEntity> wrapper);
   	
   	DiaokexinxiVO selectVO(@Param("ew") Wrapper<DiaokexinxiEntity> wrapper);
   	
   	List<DiaokexinxiView> selectListView(Wrapper<DiaokexinxiEntity> wrapper);
   	
   	DiaokexinxiView selectView(@Param("ew") Wrapper<DiaokexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiaokexinxiEntity> wrapper);
   	
}

