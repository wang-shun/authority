package com.galaxy.authority.dao.role;

import java.util.List;
import java.util.Map;

import com.galaxy.authority.bean.role.RoleBean;

public interface IRoleDao {
	//获取角色列表
	public List<Map<String, Object>> getRoleList(Map<String, Object> paramMap);
	//获取角色列表总记录数
	public int getRoleListCount(Map<String, Object> paramMap);
	//保存角色
	public int saveRole(RoleBean bean);
	//删除角色
	public int delRoleById(Map<String, Object> paramMap);
	//通过id获取角色信息
	public RoleBean getRoleById(long id);
	//更新角色
	public boolean updateRole(RoleBean bean);
	//通过部门id获取部门人数list
	public List<Map<String, Object>> getUserListByDeptId(Map<String, Object> paramMap);
	
	public List<Map<String, Object>> getUserNameByDeptId(Map<String, Object> deptParamMap);

}
