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
 * 主观题信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-10 21:13:32
 */
@TableName("zhuguantixinxi")
public class ZhuguantixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhuguantixinxiEntity() {
		
	}
	
	public ZhuguantixinxiEntity(T t) {
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
	 * 试卷名称
	 */
					
	private String shijuanmingcheng;
	
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
	 * 设置：试卷名称
	 */
	public void setShijuanmingcheng(String shijuanmingcheng) {
		this.shijuanmingcheng = shijuanmingcheng;
	}
	/**
	 * 获取：试卷名称
	 */
	public String getShijuanmingcheng() {
		return shijuanmingcheng;
	}
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
