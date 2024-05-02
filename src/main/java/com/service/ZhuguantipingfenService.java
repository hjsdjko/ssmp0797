package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuguantipingfenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuguantipingfenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuguantipingfenView;


/**
 * 主观题评分
 *
 * @author 
 * @email 
 * @date 2021-05-10 21:13:32
 */
public interface ZhuguantipingfenService extends IService<ZhuguantipingfenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuguantipingfenVO> selectListVO(Wrapper<ZhuguantipingfenEntity> wrapper);
   	
   	ZhuguantipingfenVO selectVO(@Param("ew") Wrapper<ZhuguantipingfenEntity> wrapper);
   	
   	List<ZhuguantipingfenView> selectListView(Wrapper<ZhuguantipingfenEntity> wrapper);
   	
   	ZhuguantipingfenView selectView(@Param("ew") Wrapper<ZhuguantipingfenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuguantipingfenEntity> wrapper);
   	
}

