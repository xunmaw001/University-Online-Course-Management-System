package com.entity.view;

import com.entity.KechengtongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-05 15:14:52
 */
@TableName("kechengtongji")
public class KechengtongjiView  extends KechengtongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengtongjiView(){
	}
 
 	public KechengtongjiView(KechengtongjiEntity kechengtongjiEntity){
 	try {
			BeanUtils.copyProperties(this, kechengtongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
