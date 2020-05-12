import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Employee em = new Employee();
        Employee em1 = new Employee("jjj", new Date());
        Manager man = new Manager();
        HeadManager manager = new HeadManager();

        Employee emplMan = new Manager();

        System.out.println(em.getName());
        System.out.println(emplMan.getName());

        Worker work1 = new Employee();
        Worker work2 = new Employee1();
//
//        work1.doJob();
//        work2.doJob();

        Manager manager4 = new Manager();
        Employee employee = manager4;
        //employee.setBonus(10.0);


       // Manager manager5 = employee;
        Manager manager3 = (Manager) employee;

        int a = 3;
        short b = 7;
        a = b; //Неявное приведение
         a = (int) b; //Явное приведение
         //b = a; //Вот так нельзя!
        b = (short) a; //Явное приведение




        List<Worker> list = new ArrayList<>();
        list.add(new Employee());
        list.add(new Employee1());

        for(Worker w: list){
            w.doJob();
        }

//        String s = new String("aa");
//        String s1 = "aa";
//
//        if(s.equals(s1)){
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//
//        Long a = 127L;
//        Long b = 127L;

        double a1 = 0.1;
        double b1 = 0.2;

        if(a1+b1==0.3){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        Thread thr = new Thread(new Runnable() {
            String code = em.getName();
            @Override
            public void run() {
                System.out.println(code);
            }
        });
    }

     class Thr implements Runnable{

        @Override
        public void run() {
            System.out.println(1);
        }
    }
}
