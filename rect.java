class Rectangle{
	int length,width;
	Rectangle(int x,int y){
		length = x;
		length = y;
	}
	int Area(){
		return(length * width);
	}
}
class rect{
	public static  void main(String args[]){
		Rectangle r =new Rectangle(15,10);
		int P = r.Area();
		System.out.println(P);
	}
}