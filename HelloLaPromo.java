import java.util.ArrayList;
import java.util.List;

public class HelloLaPromo {
	
	public static void main(String[] args) {
		List<String> membres = new ArrayList();
		membres.add("Eric","Claude");

		for(String membre : membres) {
			System.out.println(membre);
		}
	}
}
