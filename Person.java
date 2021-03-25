class Person
{
    String name;
    String email;
    int ssn;
  

    public Person()
    {
       this.name="Nikita";
       this.email="morankarnikita099@gmail.com";
       System.out.println("Person Name :-"+name+ "   Person Email :-"+ email) ;
    }

    public Person(String name,int ssn)
    {
        this.name=name;
        this.ssn=ssn;

        System.out.println("Person Name :-" +name+ "   Person Ssn:- "+ ssn) ;
    }

    public Person(String name,int ssn,String email)
    {
       
        this.name=name;
        this.ssn=ssn;
        this.email=email;

        System.out.println("Person Name :-" +name+ "   Person Ssn :-" + ssn+ "   Person Email :- "+ email) ;
     }
     public static void main(String []args)
     {
         Person p=new Person();
         Person p1=new Person("Hitesh",1);
         Person p2=new Person("Shruti",2,"Shrutiamrutkar99@gmail.com");
    }
}

/*Output:-

Person Name :-Nikita   Person Email :-morankarnikita099@gmail.com
Person Name :-Hitesh   Person Ssn:- 1
Person Name :-Shruti   Person Ssn :-2   Person Email :- Shrutiamrutkar99@gmail.com

...*/