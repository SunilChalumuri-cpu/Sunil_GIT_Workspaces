package mypack.java;

public class Service2 implements Service {
	@Override
	public String getServiceName() {
		return "Service2";
	}

	@Override
	public void execute() {
		System.out.println("This is execution of Service2");
	}
}
