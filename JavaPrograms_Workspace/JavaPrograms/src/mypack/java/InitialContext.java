package mypack.java;

public class InitialContext {
	public Object lookUp(String jndiName) {
		if (jndiName.equalsIgnoreCase("SERVICE1")) {
			System.out.println("Looking and creating new Service1 Object");
			return new Service1();
		} else if (jndiName.equalsIgnoreCase("SERVICE2")) {
			System.out.println("Looking and creating new Service2 Object");
			return new Service2();
		}
		return null;
	}
}
