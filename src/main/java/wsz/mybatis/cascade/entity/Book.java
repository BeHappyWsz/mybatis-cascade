package wsz.mybatis.cascade.entity;

import java.io.Serializable;

/**
 *
 *@author  wsz
 *@createdTime 2018年3月26日
*/
public class Book implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String name;
	
	private float price;
	
	private String code;

	private int user_id;
	
	public Book() {}
	
	public Book(String name, float price, String code) {
		super();
		this.name = name;
		this.price = price;
		this.code = code;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}
