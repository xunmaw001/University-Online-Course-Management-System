package com.entity.view;

import com.entity.JiaowurenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教务人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-05 15:14:51
 */
@TableName("jiaowurenyuan")
public class JiaowurenyuanView  extends JiaowurenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaowurenyuanView(){
	}
 
 	public JiaowurenyuanView(JiaowurenyuanEntity jiaowurenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, jiaowurenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
