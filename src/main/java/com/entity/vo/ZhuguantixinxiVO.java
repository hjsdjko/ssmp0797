package com.entity.vo;

import com.entity.ZhuguantixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 主观题信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-10 21:13:32
 */
public class ZhuguantixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科目
	 */
	
	private String kemu;
		
	/**
	 * 题目
	 */
	
	private String timu;
		
	/**
	 * 分值
	 */
	
	private String fenzhi;
		
	/**
	 * 要求
	 */
	
	private String yaoqiu;
				
	
	/**
	 * 设置：科目
	 */
	 
	public void setKemu(String kemu) {
		this.kemu = kemu;
	}
	
	/**
	 * 获取：科目
	 */
	public String getKemu() {
		return kemu;
	}
				
	
	/**
	 * 设置：题目
	 */
	 
	public void setTimu(String timu) {
		this.timu = timu;
	}
	
	/**
	 * 获取：题目
	 */
	public String getTimu() {
		return timu;
	}
				
	
	/**
	 * 设置：分值
	 */
	 
	public void setFenzhi(String fenzhi) {
		this.fenzhi = fenzhi;
	}
	
	/**
	 * 获取：分值
	 */
	public String getFenzhi() {
		return fenzhi;
	}
				
	
	/**
	 * 设置：要求
	 */
	 
	public void setYaoqiu(String yaoqiu) {
		this.yaoqiu = yaoqiu;
	}
	
	/**
	 * 获取：要求
	 */
	public String getYaoqiu() {
		return yaoqiu;
	}
			
}
