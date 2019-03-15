package prac;

	
/**
 * @author Dinesh Reddy
 * Class - return keyword practice 
 */
public class Rtn {

	int a = 100;

	int m1(int b) {
		System.out.println(b);
		return b;
	}

	int m2(int a) {
		System.out.println(a);
		return this.a;
	}

	int m3() {

		int a = 45;  // if declare the int a value below the syso then its take instance variable value
						// once see m5
		System.out.println(a);
		return a;
	}

	int m4() {
		System.out.println(a);
		
		return this.a;
	}
	
	int m5() {
		System.out.println(a);
		int a = 66;
		return a;
	}
	
	public static void main(String[] args) {

		Rtn obj = new Rtn();
		obj.m1(22);
		obj.m2(23);
		obj.m3(); // 45 - local variable is displayed - 1st priority goes to local
		obj.m4(); //100 - instance variable - used this keyword
		obj.m5(); //100 - because you entered the value after the syso, so its take the intense variable value
	}

}
