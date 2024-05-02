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


import com.dao.ZhuguantixinxiDao;
import com.entity.ZhuguantixinxiEntity;
import com.service.ZhuguantixinxiService;
import com.entity.vo.ZhuguantixinxiVO;
import com.entity.view.ZhuguantixinxiView;

@Service("zhuguantixinxiService")
public class ZhuguantixinxiServiceImpl extends ServiceImpl<ZhuguantixinxiDao, ZhuguantixinxiEntity> implements ZhuguantixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuguantixinxiEntity> page = this.selectPage(
                new Query<ZhuguantixinxiEntity>(params).getPage(),
                new EntityWrapper<ZhuguantixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuguantixinxiEntity> wrapper) {
		  Page<ZhuguantixinxiView> page =new Query<ZhuguantixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuguantixinxiVO> selectListVO(Wrapper<ZhuguantixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuguantixinxiVO selectVO(Wrapper<ZhuguantixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuguantixinxiView> selectListView(Wrapper<ZhuguantixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuguantixinxiView selectView(Wrapper<ZhuguantixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
