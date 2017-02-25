
public class Static {
	static String name="Summation";
	static int c=5,d=6;
	
	public void show(){
		System.out.println("No Parameter");
	}
	public void sta(int a,int b){
		System.out.println("a and b="+a+" "+b);
		
	}
	public int add(int a,int b){
		
		return a+b;
	}
	public int mul(int e,int f){
		return e*f;
	}
	public static void main(String[] args) {
		System.out.println("Arithmatic Summation:"+name);
		System.out.println("C + D ="+(c+d));
		int sum;
		int mul;
		Static sta=new Static();
		sum=sta.add(15,20);
		System.out.println("Summation is:"+sum);
		mul=sta.mul(10,20);
		System.out.println("Multiplication is:"+mul);
		sta.show();
		sta.sta(24, 23);

	}

}
