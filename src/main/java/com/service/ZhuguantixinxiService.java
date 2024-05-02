package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuguantixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuguantixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuguantixinxiView;


/**
 * 主观题信息
 *
 * @author 
 * @email 
 * @date 2021-05-10 21:13:32
 */
public interface ZhuguantixinxiService extends IService<ZhuguantixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuguantixinxiVO> selectListVO(Wrapper<ZhuguantixinxiEntity> wrapper);
   	
   	ZhuguantixinxiVO selectVO(@Param("ew") Wrapper<ZhuguantixinxiEntity> wrapper);
   	
   	List<ZhuguantixinxiView> selectListView(Wrapper<ZhuguantixinxiEntity> wrapper);
   	
   	ZhuguantixinxiView selectView(@Param("ew") Wrapper<ZhuguantixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuguantixinxiEntity> wrapper);
   	
}

