//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 50; i++) {
            System.out.println("main thread= " + i);
        }
        MyThread ravinder = new MyThread("Ravinder");
        MyThread anuradha = new MyThread("Anuradha");
        ravinder.start();
      /*  try {
            ravinder.join();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        } */
        anuradha.start();


    }
}

class MyThread extends Thread {
    String name;
    MyThread(String name){
        this.name = name;
    }
    void show(){
        for (int i = 1; i <= 5; i++) {
           System.out.println("i = " + i);
        }
    }

   public void run(){
        for (int i = 1; i <= 50; i++) {
             System.out.println(this+ " i = " + i);
        }
    }

    @Override
    public String toString() {
        return "MyThread{" +
                "name='" + name + '\'' +
                '}';
    }
}