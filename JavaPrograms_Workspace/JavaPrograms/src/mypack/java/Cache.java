package mypack.java;

import java.util.ArrayList;
import java.util.List;

public class Cache {
	private List<Service> services;

	public Cache() {
		services = new ArrayList<Service>();
	}

	public Service getService(String serviceName) {
		for (Service service : services) {
			if (service.getServiceName().equalsIgnoreCase(serviceName)) {
				System.out.println("Returning Cached Service Object: " + service.getServiceName());
				return service;
			}
		}
		return null;
	}

	public void AddService(Service newService) {
		// ArrayList cannot be added and iterated at same time.
//		if (services.isEmpty())
//			services.add(newService);
//		for (Service service : services) {
//			if (!(service.getServiceName().equalsIgnoreCase(newService.getServiceName())))
//				services.add(newService);
//		}

		boolean exists = false;
		for (Service service : services) {
			if (service.getServiceName().equalsIgnoreCase(newService.getServiceName()))
				exists = true;
		}
		if (!exists)
			services.add(newService);

	}
}
