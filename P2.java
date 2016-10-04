package CH1;

import java.util.Arrays;

public class P2 {

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
		String s1_a = new String();
		s1_a = create_arr(s1);
		System.out.println("this is first array" + s1_a);
		String s2_a = new String();
		s2_a = create_arr(s2);
		System.out.println("this is second array" + s2_a);
		if (s1_a.equals(s2_a)){
			flag = 1;
			System.out.println("same");
		}
		else{
			flag = 0;
			System.out.println("different");
		}
		System.out.println(flag);
	}
	
	static String create_arr(String s1){
		int c;
		int arr[] = new int[128];
		for (int i = 0; i < 128; i++){
			arr[i] = 0;
		}
		for (int i =0; i < s1.length(); i++){
			c = s1.charAt(i);
			//System.out.println("this is c"+ c);
			arr[c]++;
			//System.out.println("this is c value "+ arr[c]);
		}
		//Integer.toString(arr[]);
		String s = new String(Arrays.toString(arr));
		System.out.println("this is to array"+ s);
		return s;
	}

}
