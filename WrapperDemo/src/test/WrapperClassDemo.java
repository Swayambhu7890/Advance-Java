package test;

public class WrapperClassDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//AutoBoxing:-(Convert Primitive Datatype into object type)
		int i = 20;
		
		int a = 30;
		
		Integer itr = Integer.valueOf(i);         //explicit conversion--> autoboxing   --> 1st way to write autoboxing
		
		Integer j = a;                            //autoboxing-->compiler will write internally Integer.valueOf(i)-->2nd way to write autoboxing
		
		System.out.println("i:"+i+" a: "+a);
		System.out.println("itr:"+itr+" j: "+j);
		
		char c = 'c';
		Character c1 = Character.valueOf(c);
		
		
		//UnBoxing:-(Convert Object type into Primitive Datatype)
		Integer s = new Integer(10);
		int x = s.intValue();                      //unboxing->1st way to write Unboxing
		
		int y = s;                                 //unboxing-->2nd way to write Unboxing
		
		System.out.println(x+" "+y);


	}

}
