package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 课程统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-05 15:14:52
 */
@TableName("kechengtongji")
public class KechengtongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KechengtongjiEntity() {
		
	}
	
	public KechengtongjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tongjiriqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：课程名称
	 */
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
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
