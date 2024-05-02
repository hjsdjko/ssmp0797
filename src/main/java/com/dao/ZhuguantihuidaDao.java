package com.dao;

import com.entity.ZhuguantihuidaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuguantihuidaVO;
import com.entity.view.ZhuguantihuidaView;


/**
 * 主观题回答
 * 
 * @author 
 * @email 
 * @date 2021-05-10 21:13:32
 */
public interface ZhuguantihuidaDao extends BaseMapper<ZhuguantihuidaEntity> {
	
	List<ZhuguantihuidaVO> selectListVO(@Param("ew") Wrapper<ZhuguantihuidaEntity> wrapper);
	
	ZhuguantihuidaVO selectVO(@Param("ew") Wrapper<ZhuguantihuidaEntity> wrapper);
	
	List<ZhuguantihuidaView> selectListView(@Param("ew") Wrapper<ZhuguantihuidaEntity> wrapper);

	List<ZhuguantihuidaView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuguantihuidaEntity> wrapper);
	
	ZhuguantihuidaView selectView(@Param("ew") Wrapper<ZhuguantihuidaEntity> wrapper);
	
}
