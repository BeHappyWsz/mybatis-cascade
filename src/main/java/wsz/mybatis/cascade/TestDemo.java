package wsz.mybatis.cascade;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
	
	@Before
	public void init() {
		sqlSession = DBUtils.getSqlSession();
		userMapper = sqlSession.getMapper(UserMapper.class);
	}
	
	@After
	public void destory() {
		if(null != sqlSession)
			sqlSession.close();
	}
	
	@Test
	public void findAll() {
		List<User> list = userMapper.findAll();
		System.out.println(list);
		for (User user : list) {
			if(!user.getBooks().isEmpty()) {
				System.out.println(user.getBooks().toString());
			}
		}
	}
	
	@Test
	public void insertBook() {
		List<Book> list = new ArrayList<Book>();
		for(int i =0;i<5;i++) {
			list.add(new Book("aa",12.55f,"22"));
		}
		User user = userMapper.findById(1);
		user.setBooks(list);
		
		sqlSession.commit();
	}
}
