class LinearSearch {
	public static void main{
	Scanner am = new Scanner(System.in);
	System.out.println ("Enter the size of the array ");
	int st = am.nextInt();
	int[] list = new int[st];
	for (int i=0; i<list.length; i++){
		System.out.println ("Enter the array values ");
		list[i] = sc.nextInt();
	}
	//class LinearSer {
		int item = am.nextInt();
		for (int j:list){
			if item == j{
				System.out.println(" The item is matched ");
			}
			else{
				System.out.println("The item is not matched ");
			}
		} 
		  
	}
}
