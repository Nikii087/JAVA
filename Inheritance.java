class Student
{
    private int age;
    public String name;
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }

}
class Person extends Student
{
  public int rollno;
  public void setRollno(int rollno)
  {
      this.rollno = rollno;
  }
  public int getRollno()
  {
      return this.rollno;
  }
}

  class Inheritance
  {
  public static void main(String[] args)
  {

    Person p=new Person();
    p.setAge(22);
    p.setName("Nike");
    p.setRollno(4);

    System.out.println("Name of student is    :"+p.getName());
    System.out.println("Rollno of student is  :"+p.getRollno());
    System.out.println("Age of student is     :"+p.getAge());


  }
  }

