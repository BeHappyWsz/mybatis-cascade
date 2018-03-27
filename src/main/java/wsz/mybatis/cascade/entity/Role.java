package wsz.mybatis.cascade.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *User-Role多对多
 *@author  wsz
 *@createdTime 2018年3月27日
*/
public class Role implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String name;

	private List<User> users = new ArrayList<User>();
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", users=" + users + "]";
	}
	
}
