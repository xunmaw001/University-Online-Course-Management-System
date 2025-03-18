package com.entity.view;

import com.entity.HuankaoshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 缓考申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-05 15:14:52
 */
@TableName("huankaoshenqing")
public class HuankaoshenqingView  extends HuankaoshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuankaoshenqingView(){
	}
 
 	public HuankaoshenqingView(HuankaoshenqingEntity huankaoshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, huankaoshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
