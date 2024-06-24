import java.util.HashMap;

public class hashMap {
	
	public static void main(String[] args){
		HashMap<String, Integer> countries = new HashMap<String, Integer>();
		countries.put("USA", "Washington");
		countries.put("India", "New Delhi");
		
		//countries.remove("USA");
		System.out.println(countries);
		System.out.println(countries.get("Russia"));
		
		countries.replace("USA", "Detroit");
		countries.clear();
		
		System.out.println(countries);
		
		for(String i : countries.keySet() {
			System.out.print(i + "concat");
			System.out.println(countries.get(i));			
		}
		
		
	}
}