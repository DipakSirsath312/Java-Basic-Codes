class Room{
	double length,width;
	Room(double x,double y){
		length = x;
		width  = y;
	}
	Room(double x){
	 length = width = x;
	}
	double Area1(){
		return(length*width);
	}
}
class Call{
	public static void main(String args[]){
		Room a = new Room(15.0,10.0);
		Room b = new Room(12.5);
		double  t =a.Area1();
		System.out.println(t);
	}
}