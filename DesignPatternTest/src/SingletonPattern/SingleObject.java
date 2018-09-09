package SingletonPattern;

public class SingleObject {
	private volatile static SingleObject instance;
	private SingleObject(){};
	public static SingleObject getInstance() {
		if(instance==null) {
			synchronized (SingleObject.class) {
				if(instance==null) {
					instance=new SingleObject();
				}
			}
		}
		return instance;
	}
	public void showMessage() {
		System.out.println("Hello SingleObject!");
	}
}
