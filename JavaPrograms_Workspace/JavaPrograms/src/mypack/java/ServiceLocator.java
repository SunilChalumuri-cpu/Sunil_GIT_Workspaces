package mypack.java;

public class ServiceLocator {
	private static Cache cacheObj;
	static {
		cacheObj = new Cache();
	}

	public static Service getService(String jndiName) {
		Service service = cacheObj.getService(jndiName);
		if (service != null)
			return service;
		InitialContext context = new InitialContext();
		Service newService = (Service) context.lookUp(jndiName);
		cacheObj.AddService(newService);
		return newService;
	}
}
