class Box
{
	private int length,breadth,height;
	public void setDimension(int l,int b,int h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	public void showDimension()
	{
		System.out.println("L="+length);
		System.out.println("H="+height);
		System.out.println("B="+breadth);
		
	}
}
class Exam
{
	public static void main(String []args)
	{
		Box s1=new Box();
		s1.setDimension(3,4,5);
		s1.showDimension();
	}
}