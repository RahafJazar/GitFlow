public class Student{
	int age =20;
	public static void main (String [] args){

		printMessage("Welcomme Ahmad In atypon training") ;
                Student s1= new Student();
		System.out.println(s1.getAge());
		System.out.println(s1.getAge()+1);

	}
	public static void printMessage(String msg){
		System.out.println (msg);
	}
	public int getAge(){
		return age;
	}
}

