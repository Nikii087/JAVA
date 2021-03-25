public class Model
{
   
    int modelYear;
    String modelName;

    public Model(int year, String name)
    {
        modelYear=year;
        modelName=name;
    }

 public static void main(String[] args) {

    Model myCar=new Model(2020,"CRETA");
    System.out.println("Car Year is   :"+myCar.modelYear);
    System.out.println("Car Name is   :"+myCar.modelName);
        
    }
}