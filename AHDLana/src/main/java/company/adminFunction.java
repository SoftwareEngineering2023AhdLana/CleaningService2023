package company;

import java.util.ArrayList;

public class adminFunction {
	static public ArrayList<admin> admins=new ArrayList<admin>();

	public static int search(String w) {
		for(int i=0; i < admins.size() ; i++) {
			if(w.equals(admins.get(i).getUsername())) {
				return i;
			}
		}
		
		return -1;
	}
}
