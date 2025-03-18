package com.entity.model;

import com.entity.KechengtongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 课程统计
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-05 15:14:52
 */
public class KechengtongjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 总人数
	 */
	
	private Integer zongrenshu;
		
	/**
	 * 请假人数
	 */
	
	private Integer qingjiarenshu;
		
	/**
	 * 旷课人数
	 */
	
	private Integer kuangkerenshu;
		
	/**
	 * 缓修人数
	 */
	
	private Integer huanxiurenshu;
		
	/**
	 * 上课人数
	 */
	
	private Integer shangkerenshu;
		
	/**
	 * 统计日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tongjiriqi;
				
	
	/**
	 * 设置：总人数
	 */
	 
	public void setZongrenshu(Integer zongrenshu) {
		this.zongrenshu = zongrenshu;
	}
	
	/**
	 * 获取：总人数
	 */
	public Integer getZongrenshu() {
		return zongrenshu;
	}
				
	
	/**
	 * 设置：请假人数
	 */
	 
	public void setQingjiarenshu(Integer qingjiarenshu) {
		this.qingjiarenshu = qingjiarenshu;
	}
	
	/**
	 * 获取：请假人数
	 */
	public Integer getQingjiarenshu() {
		return qingjiarenshu;
	}
				
	
	/**
	 * 设置：旷课人数
	 */
	 
	public void setKuangkerenshu(Integer kuangkerenshu) {
		this.kuangkerenshu = kuangkerenshu;
	}
	
	/**
	 * 获取：旷课人数
	 */
	public Integer getKuangkerenshu() {
		return kuangkerenshu;
	}
				
	
	/**
	 * 设置：缓修人数
	 */
	 
	public void setHuanxiurenshu(Integer huanxiurenshu) {
		this.huanxiurenshu = huanxiurenshu;
	}
	
	/**
	 * 获取：缓修人数
	 */
	public Integer getHuanxiurenshu() {
		return huanxiurenshu;
	}
				
	
	/**
	 * 设置：上课人数
	 */
	 
	public void setShangkerenshu(Integer shangkerenshu) {
		this.shangkerenshu = shangkerenshu;
	}
	
	/**
	 * 获取：上课人数
	 */
	public Integer getShangkerenshu() {
		return shangkerenshu;
	}
				
	
	/**
	 * 设置：统计日期
	 */
	 
	public void setTongjiriqi(Date tongjiriqi) {
		this.tongjiriqi = tongjiriqi;
	}
	
	/**
	 * 获取：统计日期
	 */
	public Date getTongjiriqi() {
		return tongjiriqi;
	}
			
}
