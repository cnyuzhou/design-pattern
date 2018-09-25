package ObserverPattern;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		BinaryObserver binaryObserver = new BinaryObserver();
		HexaObserver hexaObserver = new HexaObserver();
		OctalObserver octalObserver = new OctalObserver();
		Subject subject = new Subject();
		subject.addAttach(binaryObserver);
		subject.addAttach(hexaObserver);
		subject.addAttach(octalObserver);
		subject.setMsg(15);
		subject.setMsg(10);
	}
}
