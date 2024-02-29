class Rectangle{
	int length,width;
	void getdata(int x,int y){
		length =x;
		width =y;
	}
	int Area(){
		int Area = length * width;
		return(Area);
	}
}
class B{

	public static void main(String args[]){
		int A1,A2;
		Rectangle r1 =new Rectangle();
		Rectangle r2 =new Rectangle();

		r1.length = 15;
		r2.length = 10;

		A1 = r1.length*r1.width;
		r2.getdata(20,12);
		A2 = r2.Area();

		System.out.println(A1);
		System.out.println(A2);
	}
}