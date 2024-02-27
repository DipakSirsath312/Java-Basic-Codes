class C{
	void show(){
		System.out.println("Parent Show");
	}
}
class Child extends C{
	void show(){
		System.out.println("Child Class");
	}
}
class  ExtendsParent{

	public static void main(String[] args){
		Child s = new Child();
		s.show();
	}
}