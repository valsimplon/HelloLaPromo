import java.util.ArrayList;
import java.util.List;

public class HelloLaPromo {
	
	public static void main(String[] args) {
		List<String> membres = new ArrayList();
		membres.add("Eric");
		membres.add("Jean-Michel");
		membres.add("laurence");
		membres.add("Laurent");
		membres.add ("Claude");

		for(String membre : membres) {
			System.out.println(membre);
		}
	}
}
