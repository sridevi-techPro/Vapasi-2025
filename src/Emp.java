//Entity class
public class Emp {
   private int eid;
    private float salary;
    private String name;

   Emp(){
       System.out.println(" creating Emp object");
   }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
       if(eid>100) {
           this.eid = eid;
       }
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Emp Id:"+this.eid);
        System.out.println("Salary:"+this.salary);
        System.out.println("Name:"+this.name);
    }

    public String toString(){
       return "Emp("+
               "eid:"+eid+
               "salary:"+salary+
               "name:"+name +")";
    }


}
