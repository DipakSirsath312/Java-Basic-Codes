class ArrayCmd{
	public static void main(String args[]){
		int a[];
		int sum=0;
		a=new int[args.length];
		System.out.println("Number of Argument:-"+args.length);

		for(int i=0;i<args.length;i++){
				a[i]=Integer.parseInt(args[i]);
				System.out.println(i+":"+a[i]);
				sum=a[i]+sum;

			}
		System.out.println("Addition:-"+sum);
	}
}