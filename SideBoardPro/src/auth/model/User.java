package auth.model;

public class User {
	public String id;
	public String name;
	
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
}
