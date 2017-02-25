
public class Constructor {

	double length;
	double height;
	double weidth;
	Constructor(double l,double h,double w ){
		length=l;
		height=h;
		weidth=w;
	}
	Constructor(){
		
	}
	Constructor(double len){
		length=height=weidth=len;
	}
	
	double volume(){
	return length*height*weidth;
	}
		public static void main(String[] args) {
		double vol;
		Constructor box1=new Constructor(20,30,40);
		Constructor box2=new Constructor();
		Constructor box3=new Constructor(20);
		vol=box1.volume();
		System.out.println("volume is:"+vol);
		System.out.println("..............................");
		vol=box2.volume();
		System.out.println("volume is:"+vol);
		System.out.println("..............................");
		vol=box3.volume();
		System.out.println("volume is:"+vol);
			
		}
		

	}


