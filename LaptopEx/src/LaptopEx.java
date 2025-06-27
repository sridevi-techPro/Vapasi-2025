//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LaptopEx {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Manufacturing Laptops");
        HDD hdd1 = new HDD(500,"5th Generation");
        RAM ram1 = new RAM(64,"10th Generation");
        Processor processor1 = new Processor("HDD",16);
        Laptop laptop1 = new Laptop(hdd1,ram1,processor1);
        HDD hdd2 = new HDD(1000,"8th Generation");
        RAM ram2 = new RAM(128,"10th Generation");
        Processor processor2 = new Processor("SSD",32);
        Laptop laptop2 = new Laptop(hdd2,ram2,processor2);
        System.out.println(" Laptop1: "+laptop1);
        System.out.println(" Laptop2: "+ laptop2);
        }
    }
