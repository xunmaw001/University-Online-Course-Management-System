package com.entity.model;

import com.entity.KetangjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 课堂记录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-05 15:14:51
 */
public class KetangjiluModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
