package wsz.mybatis.cascade;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import wsz.mybatis.cascade.dao.BookMapper;
import wsz.mybatis.cascade.dao.RoleMapper;
import wsz.mybatis.cascade.dao.UserMapper;
import wsz.mybatis.cascade.entity.Book;
import wsz.mybatis.cascade.entity.Role;
import wsz.mybatis.cascade.entity.User;
import wsz.mybatis.cascade.utils.DBUtils;

/**
 *
 *@author  wsz
 *@createdTime 2018年3月26日
*/
public class TestDemo {
	
	private SqlSession sqlSession;
	
	private UserMapper userMapper;
	
	private BookMapper bookMapper;
	
	private RoleMapper roleMapper;
	
	@Before
	public void init() {
		sqlSession = DBUtils.getSqlSession();
		userMapper = sqlSession.getMapper(UserMapper.class);
		bookMapper = sqlSession.getMapper(BookMapper.class);
		roleMapper = sqlSession.getMapper(RoleMapper.class);
	}
	
	@After
	public void destory() {
		if(null != sqlSession)
			sqlSession.close();
	}
	
	/**
	 * oneToMany查询
	 */
	@Test
	public void otmUserSelect() {
		List<User> list = userMapper.otmUserSelect();
		for (User user : list) {
			System.out.println(user.getBooks());
		}
	}
	
	/**
	 * manyToMany查询
	 */
	@Test
	public void mtoSelect() {
		List<User> list = userMapper.mtoSelect();
		for (User user : list) {
			System.out.println(user.getAddress().toString());
		}
	}
	
	/**
	 * 多对多user方
	 */
	@Test
	public void mtmUserSelect() {
		List<User> list = userMapper.mtmUserSelect();
		for (User user : list) {
			System.out.println(user.getRoles());
		}
	}
	
	/**
	 * 多对多role方
	 */
	@Test
	public void mtmRoleSelect() {
		List<Role> list = roleMapper.mtmRoleSelect();
		for (Role role : list) {
			System.out.println(role);
		}
	}
	
	@Test
	public void insertBook() {
		User user = userMapper.findById(2);
		Book book = bookMapper.findById(4);
		book.setUser_id(user.getId());
		int flag = bookMapper.addBook(book);
		System.out.println(flag);
		sqlSession.commit();
	}
	
}
