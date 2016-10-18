import java.util.ArrayList;
import java.util.List;

public class HelloLaPromo {
	
	public static void main(String[] args) {
		List<String> membres = new ArrayList();
		membres.add("Eric");

		for(String membre : membres) {
			System.out.println(membre);
		}
	}
}