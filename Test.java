class Student
{
	private int sid,rno;
	String name1;
	
	public void getData(int sid,int rno,String name1)
	{

		id=sid;
		roll_no=rno;
		name=name1;
	}
	public void displayData()
	{
		System.out.println("id="+id);
		System.out.println("roll_no="+roll_no);
		System.out.println("name="+name);
	}
}
class Test
{
	public static void main(String []args)
	{
	Student s1=new Student();
	s1.getData(1,4,"Nike");
	s1.displayData();
	}
}