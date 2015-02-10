
public class Bacon {
	public static int SVIN = 0;
	public static int VEGETAR = 1;
	public static int KYLLING = 2;
	int type;
	
	Bacon(int type) {
		this.type = type;
	}
	
	public String getTypeString(){
		String typeAsString;
		switch (type) {
		case 0:
			typeAsString = "SVIN";
			break;
		case 1:
			typeAsString = "VEGETAR";
			break;
		case 2:
			typeAsString = "KYLLING";
			break;
		default:
			typeAsString = "MYSTERY MEAT";
			break;
		}
		return typeAsString;
	}
}
