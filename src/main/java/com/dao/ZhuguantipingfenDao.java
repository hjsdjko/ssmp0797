package com.dao;

import com.entity.ZhuguantipingfenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuguantipingfenVO;
import com.entity.view.ZhuguantipingfenView;


/**
 * 主观题评分
 * 
 * @author 
 * @email 
 * @date 2021-05-10 21:13:32
 */
public interface ZhuguantipingfenDao extends BaseMapper<ZhuguantipingfenEntity> {
	
	List<ZhuguantipingfenVO> selectListVO(@Param("ew") Wrapper<ZhuguantipingfenEntity> wrapper);
	
	ZhuguantipingfenVO selectVO(@Param("ew") Wrapper<ZhuguantipingfenEntity> wrapper);
	
	List<ZhuguantipingfenView> selectListView(@Param("ew") Wrapper<ZhuguantipingfenEntity> wrapper);

	List<ZhuguantipingfenView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuguantipingfenEntity> wrapper);
	
	ZhuguantipingfenView selectView(@Param("ew") Wrapper<ZhuguantipingfenEntity> wrapper);
	
}
