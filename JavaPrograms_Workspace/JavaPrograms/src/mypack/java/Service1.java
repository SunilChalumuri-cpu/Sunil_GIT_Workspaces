package mypack.java;

public class Service1 implements Service {
	@Override
	public String getServiceName() {
		return "Service1";
	}

	@Override
	public void execute() {
		System.out.println("This is execution of Service1");
	}
}
