class Person
{
    String name;
    String email;
    int ssn;
  

    public Person()
    {
       this.name="Nikita";
       this.email="morankarnikita099@gmail.com";
    }

    public Person(String name,int ssn)
    {
        this.name=name;
        this.ssn=ssn;

     }

    public Person(String name,int ssn,String email)
    {
       
        this.name=name;
        this.ssn=ssn;
        this.email=email;

     }
    public void display()
     {
        System.out.println("Person Name :-" +name+ "   Person Ssn :-" + ssn+ "   Person Email :- "+ email) ;
     }
     public static void main(String []args)
     {
         Person p=new Person();
         Person p1=new Person("Hitesh",1);
         Person p2=new Person("Shruti",2,"Shrutiamrutkar99@gmail.com");
        
         p.display();
         p1.display();
         p2.display();
    }
}

/*Output:-
Person Name :-Nikita   Person Ssn :-0   Person Email :- morankarnikita099@gmail.com
Person Name :-Hitesh   Person Ssn :-1   Person Email :- null
Person Name :-Shruti   Person Ssn :-2   Person Email :- Shrutiamrutkar99@gmail.com

...*/