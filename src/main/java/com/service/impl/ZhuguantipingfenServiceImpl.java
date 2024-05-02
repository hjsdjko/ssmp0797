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


import com.dao.ZhuguantipingfenDao;
import com.entity.ZhuguantipingfenEntity;
import com.service.ZhuguantipingfenService;
import com.entity.vo.ZhuguantipingfenVO;
import com.entity.view.ZhuguantipingfenView;

@Service("zhuguantipingfenService")
public class ZhuguantipingfenServiceImpl extends ServiceImpl<ZhuguantipingfenDao, ZhuguantipingfenEntity> implements ZhuguantipingfenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuguantipingfenEntity> page = this.selectPage(
                new Query<ZhuguantipingfenEntity>(params).getPage(),
                new EntityWrapper<ZhuguantipingfenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuguantipingfenEntity> wrapper) {
		  Page<ZhuguantipingfenView> page =new Query<ZhuguantipingfenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuguantipingfenVO> selectListVO(Wrapper<ZhuguantipingfenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuguantipingfenVO selectVO(Wrapper<ZhuguantipingfenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuguantipingfenView> selectListView(Wrapper<ZhuguantipingfenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuguantipingfenView selectView(Wrapper<ZhuguantipingfenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
