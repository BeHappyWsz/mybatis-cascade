package wsz.mybatis.cascade.dao;

import java.util.List;

import wsz.mybatis.cascade.entity.User;

/**
 *
 *@author  wsz
 *@createdTime 2018年3月26日
*/
public interface UserMapper {
	
	/**
	 * 根据id查找User
	 * @param id
	 * @return
	 */
	User findById(int id);
	
	/**
	 * oneToMany查询user方
	 * @return
	 */
	List<User> otmUserSelect();
	
	/**
	 * manyToOne查询
	 * @return
	 */
	List<User> mtoSelect();
	
	/**
	 * 多对多user方进行查询role信息
	 * @return
	 */
	List<User> mtmUserSelect();
}
