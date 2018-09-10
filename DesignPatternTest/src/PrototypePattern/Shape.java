package PrototypePattern;

public abstract class Shape implements Cloneable {
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private String id;
	protected String type;
	
	public Object clone() {
		Object clone=null;
		try {
			clone=super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	abstract void draw();
}
