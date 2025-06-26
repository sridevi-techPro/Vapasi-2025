public class MultiLevel {
    public static void main(String[] args) {
      //  Child child = new Child("Sri",35,"Software Architect",10000000,"Music","Engineering");
    Child child = new Child();

    }
}
class GrandParent{
    String name;
    int age;
public GrandParent(){
    System.out.println("Default GrandParent");
}
    public GrandParent(String name, int age) {
    this();
        this.name = name;
        this.age = age;
        System.out.println("Param GrandParent: Name:"+name +", age:"+ age);
        this.commute();
        this.eat();
    }

    void commute(){
        System.out.println("GrandParent travels by Walk");
    }
    void eat(){
        System.out.println("GrandParent eats roti");
    }
}

class Parent extends GrandParent{
    String occupation;
    int salary;

    Parent(){
        super();
         System.out.println("Default Parent");
    }

    Parent(String name, int age,String occupation, int salary){
        super(name,age);
        this.name = name;
        this.age=age;
        this.occupation = occupation;
        this.salary =salary;
        System.out.println("Param Parent: occupation:"+occupation +", salary:"+ salary);
        this.commute();
        this.eat();
        this.DoOccupation();
        this.EarnSalary();
    }

    void commute(){
        System.out.println("Parent travels in Cycle");
    }
    void eat(){
        System.out.println("Parent eats bread");
    }
void DoOccupation(){
    System.out.println("Parent works as Teacher");
}
void EarnSalary(){
    System.out.println("Parent earns 10000 rs salary");
}
}

class Child extends Parent{
    String hobby;
    String education;
    Child(){
        super();
        System.out.println("Default Child");
    }

    public Child(String name, int age, String occupation, int salary,String hobby, String education) {
        super(name,age,occupation,salary);
        this.name = name;
        this.age =age;
        this.occupation =occupation;
        this.salary =salary;
        this.hobby = hobby;
        this.education = education;
        System.out.println(" Child: name:"+name+" , age:"+age+",occupation:"+occupation +", salary:"+ salary+" hobby:"+hobby +", education:"+ education);
    this.commute();
    this.eat();
    this.DoOccupation();
    this.EarnSalary();
    this.PracticeHobby();
    this.PursueEducation();
    }
    void commute(){
        System.out.println("Child travels in Car");
    }
    void eat(){
        System.out.println("Child eats Pizza");
    }
    void DoOccupation(){
        System.out.println("child works as Software Architect");
    }
    void EarnSalary(){
        System.out.println("Child earns 1000000 rs as salary");
    }

    void PracticeHobby(){
        System.out.println("Child Hobby:"+"Music");
    }
    void PursueEducation(){
        System.out.println("Child Education:PHD");
    }

}