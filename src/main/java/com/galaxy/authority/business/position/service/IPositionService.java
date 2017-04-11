package com.galaxy.authority.business.position.service;

import java.util.List;
import java.util.Map;
import com.galaxy.authority.bean.Page;
import com.galaxy.authority.bean.position.PositionBean;

public interface IPositionService {
	Page<PositionBean> getPositionList(Map<String,Object> paramMap);
	boolean savePosition(PositionBean bean);
	List<Map<String,Object>> getPositionComboxList(Map<String,Object> paramMap);
}
