//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
Emp e1 = new Emp();
e1.setEid(101);
e1.setSalary(99.91f);
e1.setName("Sridevi");
Emp e2 = new Emp();
        e2.setEid(102);
        e2.setSalary(994.91f);
        e2.setName("Shriya");
e1.display();
e2.display();

        System.out.println(e1);
        System.out.println(e2);

       // ---------------------------------
Laptop l1 = new Laptop();
HDD hdd = new HDD();
hdd.setSize(500);
hdd.setType("Hdd1");
Processor process = new Processor();
process.setGen("ProcessGen1");
process.setgHz(500);
RAM ram = new RAM();
ram.setSize(64);
ram.setGen("RAMGen1");

l1.setHdd(hdd);
l1.setProcessor(process);
l1.setRam(ram);
        System.out.println(l1);

        }
    }
