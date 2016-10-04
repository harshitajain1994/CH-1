package CH1;

import java.util.Arrays;

public class P1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("hello");
		String s_sorted = new String(sort_str(s));
		boolean answer = check(s_sorted);
		System.out.println(answer);

	}
	
	static char[] sort_str(String s){
		char s_array[] = new char[s.length()];
		
		s_array = s.toCharArray();
		
		Arrays.sort(s_array);
		s_array.toString();
		//System.out.println("sorted is " + s_sorted);
		return s_array;
	}
	
	static boolean check(String s_sorted){
		for (int i = 0; i < s_sorted.length(); i++){
			char c = s_sorted.charAt(i);
			if (c == s_sorted.charAt(i+1)){
				System.out.println("it is not unique");
				return false;
			}
		}
		System.out.println("it is  unique");
		return true;
	}

}
