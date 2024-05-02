package com.entity.view;

import com.entity.ZhuguantihuidaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 主观题回答
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-10 21:13:32
 */
@TableName("zhuguantihuida")
public class ZhuguantihuidaView  extends ZhuguantihuidaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuguantihuidaView(){
	}
 
 	public ZhuguantihuidaView(ZhuguantihuidaEntity zhuguantihuidaEntity){
 	try {
			BeanUtils.copyProperties(this, zhuguantihuidaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
