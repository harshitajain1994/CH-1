package CH1;

import java.util.Arrays;

public class P2b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("hefsjafd");
		String s2 = new String("haefsjdf");
		int l1 = s1.length();
		int l2 = s2.length();
		int flag;
		if (l1 != l2 ){
			flag = 0;
			System.out.println("different lengths");
		}
		char c[] = new char[l1];
		c = s1.toCharArray();
		Arrays.sort(c);
		String cs = new String(Arrays.toString(c));
		
		char c2[] = new char[l2];
		c2 = s2.toCharArray();
		Arrays.sort(c2);
		String cs2 = new String(Arrays.toString(c2));
		
		if (cs.equals(cs2)){
			flag = 1;
			System.out.println("same");
		}
		else{
			flag = 0;
			System.out.println("different");
		}
		System.out.println(flag);
		
		

	}

}
