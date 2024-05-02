package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuguantihuidaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuguantihuidaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuguantihuidaView;


/**
 * 主观题回答
 *
 * @author 
 * @email 
 * @date 2021-05-10 21:13:32
 */
public interface ZhuguantihuidaService extends IService<ZhuguantihuidaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuguantihuidaVO> selectListVO(Wrapper<ZhuguantihuidaEntity> wrapper);
   	
   	ZhuguantihuidaVO selectVO(@Param("ew") Wrapper<ZhuguantihuidaEntity> wrapper);
   	
   	List<ZhuguantihuidaView> selectListView(Wrapper<ZhuguantihuidaEntity> wrapper);
   	
   	ZhuguantihuidaView selectView(@Param("ew") Wrapper<ZhuguantihuidaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuguantihuidaEntity> wrapper);
   	
}

