package wsz.mybatis.cascade.entity;
/**
 *User-Address多对一关系
 *@author  wsz
 *@createdTime 2018年3月27日
*/
public class Address {
	
	private int id;
	
	private String title;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", title=" + title + "]";
	}
}
