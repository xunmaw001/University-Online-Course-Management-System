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
 * 课堂记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-05 15:14:51
 */
@TableName("ketangjilu")
public class KetangjiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KetangjiluEntity() {
		
	}
	
	public KetangjiluEntity(T t) {
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
	 * 科目名称
	 */
					
	private String kemumingcheng;
	
	/**
	 * 学生人数
	 */
					
	private String xueshengrenshu;
	
	/**
	 * 缺课原因
	 */
					
	private String quekeyuanyin;
	
	/**
	 * 作业布置
	 */
					
	private String zuoyebuzhi;
	
	/**
	 * 视音频链接
	 */
					
	private String shiyinpinlianjie;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	
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
	 * 设置：科目名称
	 */
	public void setKemumingcheng(String kemumingcheng) {
		this.kemumingcheng = kemumingcheng;
	}
	/**
	 * 获取：科目名称
	 */
	public String getKemumingcheng() {
		return kemumingcheng;
	}
	/**
	 * 设置：学生人数
	 */
	public void setXueshengrenshu(String xueshengrenshu) {
		this.xueshengrenshu = xueshengrenshu;
	}
	/**
	 * 获取：学生人数
	 */
	public String getXueshengrenshu() {
		return xueshengrenshu;
	}
	/**
	 * 设置：缺课原因
	 */
	public void setQuekeyuanyin(String quekeyuanyin) {
		this.quekeyuanyin = quekeyuanyin;
	}
	/**
	 * 获取：缺课原因
	 */
	public String getQuekeyuanyin() {
		return quekeyuanyin;
	}
	/**
	 * 设置：作业布置
	 */
	public void setZuoyebuzhi(String zuoyebuzhi) {
		this.zuoyebuzhi = zuoyebuzhi;
	}
	/**
	 * 获取：作业布置
	 */
	public String getZuoyebuzhi() {
		return zuoyebuzhi;
	}
	/**
	 * 设置：视音频链接
	 */
	public void setShiyinpinlianjie(String shiyinpinlianjie) {
		this.shiyinpinlianjie = shiyinpinlianjie;
	}
	/**
	 * 获取：视音频链接
	 */
	public String getShiyinpinlianjie() {
		return shiyinpinlianjie;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}

}
