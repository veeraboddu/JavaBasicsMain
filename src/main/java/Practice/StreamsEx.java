package Practice;

import java.util.ArrayList;
import java.util.List;

public class StreamsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> barCode = new ArrayList<>();
		barCode.add("9999121211");
		barCode.add("1111121212");
		barCode.add("1111121213");
		barCode.add("9999121214");
		barCode.add("9999121215");

		barCode.forEach(ex ->{
			if(ex.startsWith("9999"))
					System.out.println("standing"+ex);
			else {
				System.out.println("topstock"+ex);
			}
				
		});


	}

}
