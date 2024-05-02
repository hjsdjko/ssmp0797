package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhuguantihuidaDao;
import com.entity.ZhuguantihuidaEntity;
import com.service.ZhuguantihuidaService;
import com.entity.vo.ZhuguantihuidaVO;
import com.entity.view.ZhuguantihuidaView;

@Service("zhuguantihuidaService")
public class ZhuguantihuidaServiceImpl extends ServiceImpl<ZhuguantihuidaDao, ZhuguantihuidaEntity> implements ZhuguantihuidaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuguantihuidaEntity> page = this.selectPage(
                new Query<ZhuguantihuidaEntity>(params).getPage(),
                new EntityWrapper<ZhuguantihuidaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuguantihuidaEntity> wrapper) {
		  Page<ZhuguantihuidaView> page =new Query<ZhuguantihuidaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuguantihuidaVO> selectListVO(Wrapper<ZhuguantihuidaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuguantihuidaVO selectVO(Wrapper<ZhuguantihuidaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuguantihuidaView> selectListView(Wrapper<ZhuguantihuidaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuguantihuidaView selectView(Wrapper<ZhuguantihuidaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
