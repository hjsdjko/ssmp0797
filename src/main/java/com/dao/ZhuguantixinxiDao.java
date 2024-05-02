package com.dao;

import com.entity.ZhuguantixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuguantixinxiVO;
import com.entity.view.ZhuguantixinxiView;


/**
 * 主观题信息
 * 
 * @author 
 * @email 
 * @date 2021-05-10 21:13:32
 */
public interface ZhuguantixinxiDao extends BaseMapper<ZhuguantixinxiEntity> {
	
	List<ZhuguantixinxiVO> selectListVO(@Param("ew") Wrapper<ZhuguantixinxiEntity> wrapper);
	
	ZhuguantixinxiVO selectVO(@Param("ew") Wrapper<ZhuguantixinxiEntity> wrapper);
	
	List<ZhuguantixinxiView> selectListView(@Param("ew") Wrapper<ZhuguantixinxiEntity> wrapper);

	List<ZhuguantixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuguantixinxiEntity> wrapper);
	
	ZhuguantixinxiView selectView(@Param("ew") Wrapper<ZhuguantixinxiEntity> wrapper);
	
}
