package wsz.mybatis.cascade.dao;

import java.util.List;

import wsz.mybatis.cascade.entity.User;

/**
 *
 *@author  wsz
 *@createdTime 2018年3月26日
*/
public interface UserMapper {
	
	List<User> findAll();
	
	/**
	 * 根据id查找User
	 * @param id
	 * @return
	 */
	User findById(int id);
}
