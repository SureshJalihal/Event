
public class MainClient {
	public static void main(String[] args) {
		User cl1 = new User("Ambrespoori");
		
		Option op1 = new Option("Air Hall",800);
		
		Adon a1 = new Adon("Sound",500);
		
		Option opl1[] = new Option[1];
		opl1[0] = op1;
		
		Adon adl1[] = new Adon[1];
		adl1[0] = a1;
		
		Serviceses s1 = new Serviceses("Hall Booking",5000,10,opl1,adl1);
		
		s1.bookServiceses(op1, adl1);
		s1.printBill();
	}
}
