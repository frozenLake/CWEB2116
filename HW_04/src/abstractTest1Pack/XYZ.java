package abstractTest1Pack;
public class XYZ extends ABC{
	String DAY(String greeting) {
		return greeting + " THURSDAY";
	}

	@Override
	String DAY() {
		return null;
	}
}
