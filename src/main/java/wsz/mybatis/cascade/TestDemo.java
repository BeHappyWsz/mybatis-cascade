package wsz.mybatis.cascade;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import wsz.mybatis.cascade.dao.BookMapper;
import wsz.mybatis.cascade.dao.UserMapper;
import wsz.mybatis.cascade.entity.Book;
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
	
	@Before
	public void init() {
		sqlSession = DBUtils.getSqlSession();
		userMapper = sqlSession.getMapper(UserMapper.class);
		bookMapper = sqlSession.getMapper(BookMapper.class);
	}
	
	@After
	public void destory() {
		if(null != sqlSession)
			sqlSession.close();
	}
	
	@Test
	public void findAll() {
		List<User> list = userMapper.findAll();
		for (User user : list) {
			System.out.println(user.toString());
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
