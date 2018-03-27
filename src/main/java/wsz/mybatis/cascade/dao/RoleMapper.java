package wsz.mybatis.cascade.dao;
/**
 *
 *@author  wsz
 *@createdTime 2018年3月27日
*/

import java.util.List;

import wsz.mybatis.cascade.entity.Role;

public interface RoleMapper {
	
	List<Role> mtmRoleSelect();
}
