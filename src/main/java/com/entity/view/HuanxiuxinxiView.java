package com.entity.view;

import com.entity.HuanxiuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 缓修信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-05 15:14:51
 */
@TableName("huanxiuxinxi")
public class HuanxiuxinxiView  extends HuanxiuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuanxiuxinxiView(){
	}
 
 	public HuanxiuxinxiView(HuanxiuxinxiEntity huanxiuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, huanxiuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
