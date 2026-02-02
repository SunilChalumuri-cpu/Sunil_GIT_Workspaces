package mypack.java;

public abstract class ShapeProto implements Cloneable {
	private String id;
	protected String type;

	abstract void draw();

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

//The below function returns the clone of the calling object which extends the ShapeProto.
	public Object cloner() {
		Object cloneObject = null;
		try {
			cloneObject = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloneObject;
	}
}
