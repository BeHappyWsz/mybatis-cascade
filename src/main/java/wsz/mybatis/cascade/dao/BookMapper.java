package wsz.mybatis.cascade.dao;

import wsz.mybatis.cascade.entity.Book;

/**
 *
 *@author  wsz
 *@createdTime 2018年3月27日
*/
public interface BookMapper {
	
	int addBook(Book book);
	
	Book findById(int id);
}
