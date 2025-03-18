package com.entity.view;

import com.entity.KaohejiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考核记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-05 15:14:51
 */
@TableName("kaohejilu")
public class KaohejiluView  extends KaohejiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaohejiluView(){
	}
 
 	public KaohejiluView(KaohejiluEntity kaohejiluEntity){
 	try {
			BeanUtils.copyProperties(this, kaohejiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
