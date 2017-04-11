package com.galaxy.authority.business.position.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.galaxy.authority.bean.Page;
import com.galaxy.authority.bean.ResultBean;
import com.galaxy.authority.bean.position.PositionBean;
import com.galaxy.authority.business.position.service.IPositionService;
import com.galaxy.authority.common.CUtils;
import com.galaxy.authority.common.StaticConst;

@Controller
@RequestMapping("/position")
public class PositionController {
	@Autowired
	private IPositionService service;
	
	@RequestMapping("getPositionList")
	@ResponseBody
	public Object getPositionList(@RequestBody String paramString){
		ResultBean result = ResultBean.instance();
		result.setSuccess(false);
		
		if(CUtils.get().stringIsNotEmpty(paramString)){
			Map<String,Object> paramMap = CUtils.get().jsonString2map(paramString);
			if(CUtils.get().mapIsNotEmpty(paramMap)){
				int pageNo = CUtils.get().object2Integer(paramMap.get("pageNo"));
				int pageSize = CUtils.get().object2Integer(paramMap.get("pageSize"));
				int startNo = (pageNo-1)*pageSize;
				paramMap.put("startNo", startNo<0?0:startNo);
				paramMap.put("companyId", StaticConst.COMPANY_ID);
				
				Page<PositionBean> page = service.getPositionList(paramMap);
				if(page.getResultCount()>0){
					Map<String,Object> map = new HashMap<String,Object>();
					map.put("total", page.getResultCount());
					map.put("rows", page.getMapList());
					result.setSuccess(true);
					result.setValue(map);
				}
			}
		}
		return result;
	}
	
	@RequestMapping("savePosition")
	@ResponseBody
	public Object savePosition(@RequestBody PositionBean bean){
		ResultBean result = ResultBean.instance();
		result.setSuccess(false);
		
		if(bean!=null){
			bean.setCompanyId(StaticConst.COMPANY_ID);
			result.setSuccess(service.savePosition(bean));
		}
		return result;
	}
	
	@RequestMapping("getPositionComboxList")
	@ResponseBody
	public Object getPositionComboxList(){
		ResultBean result = ResultBean.instance();
		result.setSuccess(false);
		
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("companyId", StaticConst.COMPANY_ID);
		List<Map<String,Object>> dataList = service.getPositionComboxList(paramMap);
		if(CUtils.get().listIsNotEmpty(dataList)){
			result.setSuccess(true);
			result.setValue(dataList);
		}
		
		return result;
	}
	
	/**
	 * 判断是否能被禁用或删除
	 */
	@RequestMapping("checkPosition")
	@ResponseBody
	public Object checkPosition(@RequestBody String mapString){
		ResultBean result = ResultBean.instance();
		
		return result;
	}
	
	
}
