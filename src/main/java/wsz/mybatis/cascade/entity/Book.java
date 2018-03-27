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
	
	private double price;
	
	private int user_id;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public Book() {}
	
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", user_id=" + user_id + "]";
	}
	
}
