
public class Serviceses {
	public String name;
	public int price;
	public int tax;
	public int amount;
	
	Option op[];
	Adon ao[];
	
	Option opp;
	Adon aon[];
	
	public Serviceses(String n, int p, int t,Option o[],Adon a[]) {
		name = n;
		price = p;
		tax = t;
		op = o;
		ao = a;
		amount = 0;
	}
	
	public void bookServiceses(Option o, Adon a[]){
		
		opp = o;
		aon = a;
		serviceBook(o);
	}

	public void serviceBook(Option o) {
		amount= amount + price;
		amount= amount + o.price;
		
		for(int i=0; i<aon.length; i++){
			amount = amount + aon[i].price;
		}
	}
	
	public void printBill(){
		Debug.Log("\nName : "+name);
		Debug.Log("\nPrice : "+price);
		Debug.Log("\nOption : "+opp.name);
		Debug.Log("\nPrice : "+opp.price);
		
		for(int i=0; i<aon.length; i++){
			Debug.Log("\nAdon : "+aon[i].name+" Price : "+aon[i].price);
		}
		Debug.Log("\nTotal Amount is : "+amount);
	}
}
